package algorithms.practice.sort.arrays.insertionsort;

import java.util.Comparator;

public final class InsertionSort<T extends Comparable<? super T>> implements Insertion<T> {
	public InsertionSort() {}

	public void Sort(T[] a) {
		if(a.length <1 || a == null) {
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
//				if(a[j].compareTo(a[j-1])<0) {
				if(a[j].compareTo(a[j-1])<0) {
					exchange(a,j,j-1);
				}
				else break;
			}
		}
		
	}

	private void exchange(T[] a, int Index_1, int Index_2) {
		T temp = a[Index_1];
		a[Index_1]=a[Index_2];
		a[Index_2] = temp;
		
	}

	@Override
	public void Sort(T[] a, Comparator<T> Comparator) {
		if(a.length <1 || a == null) {
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(Comparator.compare(a[j],a[j-1])<0) {
					exchange(a,j,j-1);
				}
				else break;
			}
		}
		
	}
	
	

	@Override
	public void Reverse(T[] a) {
		if(a.length <1 || a == null) {
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
//				if(c.compare(a[j],a[j-1])>0) {
				if(a[j].compareTo(a[j-1])>0) {
					exchange(a,j,j-1);
				}
				else break;
			}
		}
		
	}

	@Override
	public void Reverse(T[] a, Comparator<T> Comparator) {
		
			if(a.length <1 || a == null) {
				return;
			}
			
			for(int i=0;i<a.length;i++) {
				for(int j=i;j>0;j--) {
					if(Comparator.compare(a[j],a[j-1])>0) {
						exchange(a,j,j-1);
					}
					else break;
				}
			}
		
	}

	@Override
	public void sort(T[] a, int low, int high, Comparator<? super T> comparator) {
		if(a.length <1 || a == null) {
			return;
		}
		for(int i=low+1;i<=high;i++) {
			for(int j=i;j>low;j--) {
				if(less(a[j],a[j-1],comparator)) { //if(comparator.compare(a[j],a[j-1])<0) {
					exchange(a,j,j-1);
				}
				else break;
			}
		}
		
	}

	private boolean less(T t, T t2, Comparator<? super T> comparator) {
		if(comparator==null)
		{
			return t.compareTo(t2)<0;
		}
		return comparator.compare(t, t2)<0;
	}

}
