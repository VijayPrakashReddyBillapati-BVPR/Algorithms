package algorithms.practice.search.bst;

public interface BinarySearchTree<T> {

	public boolean insert(T a);
	public boolean search(T a);
	public T findLargest();
	public T findSmallest();
	public T searchKthLargest(int k);
	public T searchKthSmallest(int k);
	
}
