package algorithms.practice.sort.collections.insertion;

import java.util.Comparator;
import java.util.List;

public interface InsertionC{

	
	@SuppressWarnings("rawtypes")
	public void Sort(List<Comparable> ListToSort, Comparator<Comparable> Comparator);
	
	@SuppressWarnings("rawtypes")
	public void Sort(List<Comparable> ListToSort);
	
	
	@SuppressWarnings("rawtypes")
	public void Reverse(List<Comparable> ArrayToSort);
	
	@SuppressWarnings("rawtypes")
	public void Reverse(List<Comparable> ArrayToSort,Comparator<Comparable> Comparator);

	
	public static Comparator<String> IgnoreCase = new Comparator<String>() {
		@Override
		public int compare(String object1, String object2) {
			return object1.compareToIgnoreCase(object2);
		}
		
		
	};
}
