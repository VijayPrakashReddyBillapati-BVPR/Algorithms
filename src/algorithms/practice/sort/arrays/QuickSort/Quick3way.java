package algorithms.practice.sort.arrays.QuickSort;

import java.util.Comparator;

import algorithms.practice.sort.arrays.insertionsort.Insertion;
import algorithms.practice.sort.arrays.insertionsort.InsertionSort;

public class Quick3way<T extends Comparable<? super T>> implements QuickSort<T> {
	public static final int CUTOFF = 10;

	@Override
	public void sort(T[] array) {
		sort(array, null);

	}

	@Override
	public void sort(T[] array, Comparator<? super T> comparator) {

		sort(array, 0, array.length - 1, comparator);

	}

	private void sort(T[] array, int low, int high, Comparator<? super T> comparator) {
//		if (high <= low)
//			return;
		if (high <= low + CUTOFF) {

			Insertion<T> Insertion = new InsertionSort<T>();
			Insertion.sort(array, low, high, comparator);
			return;

		}
		int left = low, current = low + 1, right = high;
		T pivot = array[low];

		while (current <= right) {
			int cmp = compare(array[current], pivot, comparator);

			if (cmp < 0)
				swap(array, left++, current++);
			else if (cmp > 0)
				swap(array, current, right--);
			else
				current++;
		}
		sort(array, low, left - 1, comparator);
		sort(array, right + 1, high, comparator);

	}

	private void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private int compare(T t, T pivot, Comparator<? super T> comparator) {
		if (comparator == null) {
			return t.compareTo(pivot);
		}
		return comparator.compare(t, pivot);
	}

	@Override
	public void reverseSort(T[] array) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverseSort(T[] array, Comparator<? super T> comparator) {
		// TODO Auto-generated method stub

	}

}
