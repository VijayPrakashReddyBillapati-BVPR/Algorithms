package algorithms.practice.sort.arrays.QuickSort;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		QuickSort<Integer>  quick = new QuickSortImpl<Integer>();
		QuickSort<Integer>  quick1 = new Quick3way<Integer>();
		
		Integer[] array = {19,12,24,23,1,9,22,19,26,16,20,24,13,28,29};
		System.out.println(Arrays.toString(array));
		
		quick1.sort(array);
			System.out.println(Arrays.toString(array));
	}

}
