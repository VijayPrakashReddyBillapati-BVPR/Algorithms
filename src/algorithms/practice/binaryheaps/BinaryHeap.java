package algorithms.practice.binaryheaps;

public interface BinaryHeap<T> {
	
	public void insert(T key);
	public boolean isEmpty();
	public default T deleteMax() { return null; }
	public default T max() { return null; }
	public default T min() { return null; }
	public default T deleteMin() { return null; }
	

}
