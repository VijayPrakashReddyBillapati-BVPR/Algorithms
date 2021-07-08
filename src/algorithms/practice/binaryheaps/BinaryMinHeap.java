package algorithms.practice.binaryheaps;

import java.util.Comparator;

public class BinaryMinHeap<T extends Comparable<? super T>> implements BinaryHeap<T> {

	private static final int SIZE = 5;
	T[] minHeap ;
	int pointer=0;
	Comparator<? super T> comparator;


	@SuppressWarnings("unchecked")
	public BinaryMinHeap() {
		minHeap = (T[]) new Comparable[SIZE];
	}
	
	@SuppressWarnings("unchecked")
	public BinaryMinHeap(Comparator<? super T> comparator) {
		minHeap = (T[]) new Comparable[SIZE];
		this.comparator=comparator;
	}
	
	
	@Override
	public void insert(T key) {
		if(minHeap.length*3/4 == pointer)
			reSize(minHeap.length*2);
		minHeap[++pointer] = key;
		swim(pointer);
		
	}



	@Override
	public T min() {
		
		return minHeap[1];
	}

	@Override
	public T deleteMin() {
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException("Array does not contain values");
		
		T min = minHeap[1];
		exchange(1,pointer--);
		minHeap[pointer+1]=null;
		skim(1);
		
		if(minHeap.length/4 > pointer)
			reSize(minHeap.length/2);
		return min;
	}



	@Override
	public boolean isEmpty() {
		
		return pointer==0;
	}

	@SuppressWarnings("unchecked")
	private void reSize(int size) {
		T[] helper = minHeap;
		minHeap = (T[]) new Comparable[size];
		for(int i=1;i<=pointer;i++)
		{
			minHeap[i] = helper[i];
		}
		helper = null;
		
	}
	
	private void swim(int key) {
		while(key>1 && greater(key/2,key))
		{
			exchange(key/2,key);
			key = key/2;
		}
		
	}

	private boolean greater(int i, int k) {
		if(comparator!=null)
		{
			return comparator.compare(minHeap[i], minHeap[k])>0;
		}
		return minHeap[i].compareTo(minHeap[k])>0;
	}

	private void exchange(int j, int k) {
		T temp = minHeap[j];
		minHeap[j] = minHeap[k];
		minHeap[k]=temp;
	}
	
	private void skim(int k) {
		
		while(2*k<=pointer)
		{
			int j=2*k;
			if(j<pointer && greater(j,j+1)) j++;
			exchange(k,j);
			k=j;
		}
	}

	
}
