package algorithms.practice.binaryheaps;

import java.util.Arrays;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random rand = new Random();
		BinaryHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		BinaryHeap<Integer> heaps = new BinaryMinHeap<Integer>();
		
		System.out.println(" MAXHEAP isEmpty() "+heap.isEmpty());
		System.out.println(" MINHEAP isEmpty() "+heaps.isEmpty());
		
		
		System.out.println(" MAXHEAP max() "+heap.max());
		System.out.println(" MINHEAP min() "+heaps.min());
		System.out.println();
		
		Integer[] a = new Integer[20];
		for(int i=0; i<20;i++)
		{
			int value = rand.nextInt(40);
			a[i]=value;
			heap.insert(value);
			heaps.insert(value);
		}
		
		System.out.println("in demo class "+Arrays.toString(a));
		System.out.println();
		
		System.out.println(" MAXHEAP deleteMax() "+heap.deleteMax());
		System.out.println(" MINHEAP deleteMin() "+heaps.deleteMin());
		System.out.println();
		System.out.println(" MAXHEAP max() "+heap.max());
		System.out.println(" MINHEAP min() "+heaps.min());
		System.out.println();
		
		HeapSort<Integer> heapsort = new HeapSort<Integer>();
		heapsort.sort(a);
		System.out.println(Arrays.toString(a));
	}
	

}
