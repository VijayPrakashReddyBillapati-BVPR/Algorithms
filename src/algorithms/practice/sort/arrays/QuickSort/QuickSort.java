package algorithms.practice.sort.arrays.QuickSort;

import java.util.Comparator;

public interface QuickSort<T> {

	public void sort(T[] array);
	public void sort(T[] array,Comparator<? super T> comparator);
	public void reverseSort(T[] array);
	public void reverseSort(T[] array,Comparator<? super T> comparator);
}
