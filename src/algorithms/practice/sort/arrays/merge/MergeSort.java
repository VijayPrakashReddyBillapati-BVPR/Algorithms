package algorithms.practice.sort.arrays.merge;

import java.util.Comparator;

public interface MergeSort<T> {
	
	public void sort(T[] array);
	public void sort(T[] array,Comparator<? super T> comparator);
	public void ReverseSort(T[] array);
	public void ReverseSort(T[] array,Comparator<? super T> comparator);
	

}
