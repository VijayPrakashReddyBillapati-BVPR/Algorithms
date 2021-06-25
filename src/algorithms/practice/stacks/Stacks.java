package algorithms.practice.stacks;

public interface Stacks<T> {
	static final int MAX = 2;

	public boolean push(T a);

	public T pop();
	
	public T peek();

	public boolean isEmpty();
	
	public int size();
}
