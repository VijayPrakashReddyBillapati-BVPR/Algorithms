package algorithms.practice.sort.arrays.QuickSort;

import java.util.Comparator;

import algorithms.practice.sort.arrays.insertionsort.Insertion;
import algorithms.practice.sort.arrays.insertionsort.InsertionSort;

public class QuickSortImpl<T extends Comparable<? super T>> implements QuickSort<T> {

	public static final int CUTOFF = 10;
	public void sort(T[] array) {
		sort(array, null);

	}

	@Override
	public void sort(T[] array, Comparator<? super T> comparator) {

		sort(array, comparator, 0, array.length - 1);
	}

	private void sort(T[] array, Comparator<? super T> comparator, int low, int high) {
		
		if (high <= low + CUTOFF) { 
			
			Insertion<T> Insertion = new InsertionSort<T>();
			Insertion.sort(array, low, high,comparator); return; 
			
			}
//		if (high <= low) return;
			int pivot = partition(array, comparator, low, high);

			sort(array, comparator, low, pivot - 1);
			sort(array, comparator, pivot + 1, high);

	}

	private int partition(T[] array, Comparator<? super T> comparator, int low, int high) {
		
		int helperLeft = low; // index of smaller element
		int helperRight = high+1;
		T pivot = array[low];
		
		
		while (true) { // Scan right, scan left, check for scan complete, and exchange.
			while (less(array[++helperLeft], pivot,comparator))
				if (helperLeft == high)
					break;
			while (less(pivot, array[--helperRight],comparator))
				if (helperRight == low)
					break;
			
			if (helperLeft >= helperRight)
				break;

			swap(array, helperLeft, helperRight);
		}
		
		swap(array, low, helperRight); // Put pivot = a[j] into position
		return helperRight; 

	}

	private void swap(T[] array, int left, int right) {
		
		T temp = array[left];
		array[left] = array[right];
		array[right] = temp;

	}

	private boolean less(T t, T pivot, Comparator<? super T> comparator) {
		
		if (comparator == null) {
			return t.compareTo(pivot)<0;
		}
		return comparator.compare(t, pivot)<0;
	}

	@Override
	public void reverseSort(T[] array) {
		reverseSort(array, null);

	}

	@Override
	public void reverseSort(T[] array, Comparator<? super T> comparator) {
		// TODO Auto-generated method stub

	}

}
