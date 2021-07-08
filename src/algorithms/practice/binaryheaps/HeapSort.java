package algorithms.practice.binaryheaps;

import java.util.Comparator;

public class HeapSort<T extends Comparable<? super T>> {

	private Comparator<? super T> comparator;

	public void sort(T[] array, Comparator<? super T> comparator) {

		this.comparator = comparator;

		int N = array.length-1;
		for (int k = N / 2; k >= 0; k--)
			sink(array, k, N);
		while (N > 1) {
			exch(array, 0, N);
			sink(array, 0, --N);
		}

	}

	public void sort(T[] array) {

		int N = array.length-1;
		for (int k = N / 2; k >= 0; k--)
			sink(array, k, N);
		while (N > 1) {
			exch(array, 0, N);
			sink(array, 0, --N);
		}

	}

	private void exch(T[] array, int i, int k) {
		T temp = array[k];
		array[k] = array[i];
		array[i] = temp;

	}

	private void sink(T[] array, int k, int n) {
		while (2 * k < n) {
			int index = 2 * k;
			if (index < n-1 && less(index, index + 1, array))
				index++;
			if (!less(k, index, array))
				break;
			exch(array, k, index);
			k = index;
		}

	}

	private boolean less(int t1, int t2, T[] array) {
		if (comparator != null) {
			return comparator.compare(array[t1], array[t2]) < 0;
		}
		return array[t1].compareTo(array[t2]) < 0;
	}
}
