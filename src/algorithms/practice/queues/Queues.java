package algorithms.practice.queues;

public interface Queues<T> {
	static final int MAX = 4;

	public boolean enqueue(T a);

	public T dequeue();
	
	public T peek();

	public boolean isEmpty();
	
	public int size();
	
	public boolean isFull();
}
