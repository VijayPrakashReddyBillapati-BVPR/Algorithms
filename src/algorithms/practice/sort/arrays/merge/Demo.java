package algorithms.practice.sort.arrays.merge;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		MergeSort<Integer> mergesort = new MergeSortImpl_1<Integer>();
		Random rand = new Random();
		Integer[] array = new Integer[50];
		for(int i=0; i<array.length;i++)
		{
			array[i]= rand.nextInt(200);
		}
		
		mergesort.sort(array);
		System.out.println("sorted ");
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
//		mergesort.ReverseSort(array);
//		System.out.println("reverse sorted ");
//		for(int i=0; i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}

	}

}
