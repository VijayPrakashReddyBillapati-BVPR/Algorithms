package algorithms.practice.sort.arrays.merge;

import java.util.Comparator;

public class MergeSortImpl<T extends Comparable<? super T>> implements MergeSort<T> {

	
	
	@SuppressWarnings("unchecked")
	public void sort(T[] a) {
		T[] aux = (T[]) new Comparable[a.length];
		mergeSort(a, aux, 0, a.length - 1, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort(T[] array, Comparator<? super T> comparator) {
		T[] helper_ = (T[]) new Comparable[array.length];
		mergeSort(array, helper_, 0, array.length - 1, comparator);

	}

	private void mergeSort(T[] array, T[] helper_, int low, int high, Comparator<? super T> comparator) {
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		mergeSort(array, helper_, low, mid, comparator);
		mergeSort(array, helper_, mid + 1, high, comparator);
		merge(array, helper_, low, mid, high, comparator);

	}

	private void merge(T[] array, T[] helper, int low, int mid, int high, Comparator<? super T> comparator) {
		for (int i = low; i <= high; i++)
			helper[i] = array[i];

		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;

		while (helperLeft <= mid && helperRight <= high) {
			if (less(helper[helperLeft], helper[helperRight], comparator)) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}

	}

	private boolean less(T t, T t2, Comparator<? super T> comparator) {

		if (comparator == null) {
			return t.compareTo(t2) < 0;
		}
		return comparator.compare(t, t2) < 0;
	}

	
	
	
	
	@SuppressWarnings("unused")
	private void sort(T[] a, T[] aux, int lo, int hi, Comparator<? super T> comparator) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid, comparator);
		sort(a, aux, mid + 1, hi, comparator);
		merge(a, aux, lo, mid, hi, comparator);
	}

	@SuppressWarnings("unused")
	private void merge_1(T[] a, T[] aux, int lo, int mid, int hi, Comparator<? super T> comparator) {
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i], comparator))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}

	@SuppressWarnings("unused")
	private void merge_2(T[] array, T[] helper, int low, int mid, int high, Comparator<? super T> comparator) {
		for (int i = low; i <= high; i++)
			helper[i] = array[i];

		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;

		while (helperLeft <= mid && helperRight <= high) {
			if (comparator.compare(helper[helperLeft], helper[helperRight]) < 0) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}

	}

	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void ReverseSort(T[] array) {
		T[] helper = (T[]) new Comparable[array.length];
		sortReverse(array, helper, 0, array.length - 1, null);

	}
	

	@SuppressWarnings("unchecked")
	@Override
	public void ReverseSort(T[] array, Comparator<? super T> comparator) {
		T[] helper = (T[]) new Comparable[array.length];
		sortReverse(array, helper, 0, array.length - 1, comparator);

	}
	

	private void sortReverse(T[] array, T[] helper_, int low, int high, Comparator<? super T> comparator) {
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		sortReverse(array, helper_, low, mid, comparator);
		sortReverse(array, helper_, mid + 1, high, comparator);
		reverseMerge(array, helper_, low, mid, high, comparator);

	}

	private void reverseMerge(T[] array, T[] helper_, int low, int mid, int high, Comparator<? super T> comparator) {
		for (int i = 0; i < array.length; i++) {
			helper_[i] = array[i];
		}

		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;
		while (helperLeft <= mid && helperRight <= high) {
			if (greater(helper_[helperLeft], helper_[helperRight], comparator)) {
				array[current] = helper_[helperLeft];
				helperLeft++;
			} else {
				array[current] = helper_[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper_[helperLeft + i];
		}
	}

	private boolean greater(T t, T t2, Comparator<? super T> comparator) {
		if (comparator == null) {
			return t.compareTo(t2) > 0;
		}
		return comparator.compare(t, t2) > 0;
	}

}
