package algorithms.practice.binaryheaps;

import java.util.Comparator;

public class BinaryMaxHeap<T extends Comparable<? super T>> implements BinaryHeap<T> {

	private static final int SIZE = 5;
	T[] maxHeap ;
	int pointer=0;
	Comparator<? super T> comparator;


	@SuppressWarnings("unchecked")
	public BinaryMaxHeap() {
		maxHeap = (T[]) new Comparable[SIZE];
	}
	
	@SuppressWarnings("unchecked")
	public BinaryMaxHeap(Comparator<? super T> comparator) {
		maxHeap = (T[]) new Comparable[SIZE];
		this.comparator=comparator;
	}

	@Override
	public void insert(T key) {
		if(maxHeap.length*3/4 == pointer)
			reSize(maxHeap.length*2);
		maxHeap[++pointer] = key;
		swim(pointer);
		
	}


	@SuppressWarnings("unchecked")
	private void reSize(int size) {
		T[] helper = maxHeap;
		maxHeap = (T[]) new Comparable[size];
		for(int i=1;i<=pointer;i++)
		{
			maxHeap[i] = helper[i];
		}
		helper = null;
		
	}

	private void swim(int k) {
		
		while(k>1 && less(k/2,k))
		{
			exchange(k,k/2);
			k = k/2;
		}
	}

	private void exchange(int k, int i) {
		
		T temp = maxHeap[k];
		maxHeap[k] = maxHeap[i];
		maxHeap[i] = temp;
		
	}

	private boolean less(int t1, int t2) {
		
		if(comparator!=null)
		{
			return comparator.compare(maxHeap[t1], maxHeap[t2])<0;
		}
		return maxHeap[t1].compareTo(maxHeap[t2])<0;
	}

	@Override
	public T max() {
		
		return maxHeap[1];
	}


	@Override
	public T deleteMax() {
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException("Array does not contain values");
		T key = maxHeap[1];
		exchange(1,pointer--);
		sink(1);
		maxHeap[pointer+1]=null;
		if(maxHeap.length/4 > pointer)
			reSize(maxHeap.length/2);
		return key;
	}

	private void sink(int k) {
		while(2*k<=pointer)
		{
			int index = 2*k;
			if(index<pointer && less(index,index+1)) index++;
			if (!less(k, index)) break;
			exchange(k,index);
			k=index;
		}
		
	}

	@Override
	public boolean isEmpty() {
		return pointer==0;
	}

}
