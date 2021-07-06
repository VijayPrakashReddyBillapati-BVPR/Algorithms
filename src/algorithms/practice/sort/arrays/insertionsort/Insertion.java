package algorithms.practice.sort.arrays.insertionsort;

import java.util.Comparator;

public interface Insertion <T extends Comparable<? super T>>{

	public void Sort(T[] ArrayToSort);
	
	public void Sort(T[] ArrayToSort,Comparator<T> Comparator);
	
	public void Reverse(T[] ArrayToSort);
	
	public void Reverse(T[] ArrayToSort,Comparator<T> Comparator);
	
	public static Comparator<String> IgnoreCase = new Comparator<String>() {
		@Override
		public int compare(String object1, String object2) {
			return object1.compareToIgnoreCase(object2);
		}
		
		
	};

	public void sort(T[] array, int low, int high, Comparator<? super T> comparator);

}
