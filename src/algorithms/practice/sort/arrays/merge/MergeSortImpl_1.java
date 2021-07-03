package algorithms.practice.sort.arrays.merge;

import java.util.Comparator;

import algorithms.practice.sort.arrays.selection.insertionsort.Insertion;
import algorithms.practice.sort.arrays.selection.insertionsort.InsertionSort;

public class MergeSortImpl_1<T extends Comparable<? super T>> implements MergeSort<T> {
	
	public final static int CUTOFF = 6;
	@Override
	public void sort(T[] array) {
		sort(array,null);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort(T[] array, Comparator<? super T> comparator) {
		int size = array.length;
		T[] helper = (T[]) new Comparable[size];
		sort(array,helper,0,size-1,comparator);
		
	}

	private void sort(T[] array, T[] helper, int low, int high, Comparator<? super T> comparator) {
//		if(high<=low)
//			return;
		if (high <= low + CUTOFF - 1)
		 {
			Insertion<T> insertion = new InsertionSort<T>();
			insertion.sort(array,low,high,comparator);
		 return;
		 }
		int mid = low+(high - low)/2;
		sort(array,helper,low,mid,comparator);
		sort(array,helper,mid+1, high,comparator);
//		if(!less(array[mid+1], array[mid], comparator)) return;
		merge(array,helper, low, mid,high,comparator);
		
	}

	private void merge(T[] array, T[] helper, int low, int mid, int high, Comparator<? super T> comparator) {
		for(int i=0; i<=high;i++)
		{
			helper[i]=array[i];
		}
		
		int helperLeft=low;
		int helperRight=mid+1;
		int current = low;
		while(helperLeft<=mid && helperRight<=high)
		{
			if(less(helper[helperLeft],helper[helperRight],comparator))
			{
				array[current]=helper[helperLeft];
				helperLeft++;
			}else {
				array[current]=helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = mid - helperLeft;
		for(int i=0;i<=remaining;i++) {
			array[current+i]=helper[helperLeft+i];
		}
		
	}

	private boolean less(T t, T t2, Comparator<? super T> comparator) {
		if(comparator==null)
		{
			return t.compareTo(t2)<0;
		}
		return comparator.compare(t, t2)<0;
	}

	@Override
	public void ReverseSort(T[] array) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ReverseSort(T[] array, Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		
	}

}
