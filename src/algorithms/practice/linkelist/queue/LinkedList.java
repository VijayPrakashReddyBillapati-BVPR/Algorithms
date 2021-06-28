package algorithms.practice.linkelist.queue;

public interface LinkedList<T> {

	public boolean isEmpty();
	public boolean enqueue(T data);
	public T dequeue();
	public String toString();
	public T[] toArray();
	public int size();
}
