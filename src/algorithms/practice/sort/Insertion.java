package algorithms.practice.sort;

import java.util.Comparator;

public interface Insertion <T>{

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
}
