package algorithms.practice.Example;

import java.util.Comparator;

public class NutsnBolts<T extends Comparable<? super T>> {

	public void sortNutsAndBolts(T[] nuts, T[] bolts, Comparator<? super T> comparator) {
		if (nuts.length != bolts.length)
			return;
		if (nuts == null || bolts == null)
			return;
		usingQuickSort(nuts, bolts, comparator, 0, nuts.length - 1);
	}

	private void usingQuickSort(T[] nuts, T[] bolts, Comparator<? super T> comparator, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(nuts, bolts[high], comparator, low, high);
			partition(bolts, nuts[pivotIndex], comparator, low, high);
			usingQuickSort(nuts, bolts, comparator, low, pivotIndex - 1);
			usingQuickSort(nuts, bolts, comparator, pivotIndex + 1, high);
		}

	}

	private int partition(T[] array, T pivot, Comparator<? super T> comparator, int low, int high) {
		
		 int helperLeft = low;
		 int helperRight = high;
	        for (int i = helperLeft; i < helperRight; i++)
	        {
	            if (compare(array[i],pivot,comparator)<0){
	            	swap(array,helperLeft,i);
	            	helperLeft++;
	            } else if(compare(array[i],pivot,comparator)==0){
	            	swap(array,i,helperRight);
	                i--;
	            }
	        }

	        swap(array,helperLeft,helperRight);
	 
	        return helperLeft;
	}

	private void swap(T[] array, int i, int high) {
		T temp = array[i];
		array[i] = array[high];
		array[high] = temp;

	}

	private int compare(T t, T pivot, Comparator<? super T> comparator) {
		if (comparator == null) {
			return t.compareTo(pivot);
		}
		return comparator.compare(t, pivot);
	}

}
