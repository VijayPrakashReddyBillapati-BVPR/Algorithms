package algorithms.practice.sort.collections.insertion;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public final class InsertionSortC {

	static Object[] a = null;

	public static <T extends Comparable<? super T>> void sort(List<T> l) {

		sort(l, null);
	}

	@SuppressWarnings({ "unchecked" })
	public static <T> void sort(List<T> l, Comparator<? super T> c)
	{
	 T[] a = (T[]) l.toArray();
	 System.out.println(a[0]);
	 sort(a,0,a.length,c);
	 System.out.println(a[0]);
	 ListIterator<T> i = l.listIterator();
	 for (int pos = 0, alen = a.length;  pos < alen;  pos++)
	 {
		 i.next();
		 i.set(a[pos]);
	 }
	}
	
	public static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
	{
		if(a.length <1 || a == null) {
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
//				if(a[j].compareTo(a[j-1])<0) {
				if(compare(a[j],a[j-1],c)<0) {
					exchange(a,j,j-1);
				}
				else break;
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static <T> int compare(T o1, T o2, Comparator<? super T> c) {
		
		return c == null ? ((Comparable) o1).compareTo(o2) : c.compare(o1, o2);
	}

	private static <T> void exchange(T[] a, int Index_1, int Index_2) {
		T temp = a[Index_1];
		a[Index_1]=a[Index_2];
		a[Index_2] = temp;
		
	}
}