package algorithms.practice.search.bst;

public class BSTdemo {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst =  new BinarySearchTreeImpl<Integer>();
		Integer[] array = {12,45,78,9090,22,1,56,9,3,2,7,9};
		
		for(int i=0; i<array.length ;i++)
		{
			bst.insert(array[i]);
		}
		
		System.out.println(bst.findLargest());
		System.out.println(bst.findSmallest());
		System.out.println(bst.search(78));
		System.out.println(bst.search(23));
		System.out.println(bst.searchKthLargest(2));
		System.out.println(bst.searchKthSmallest(3));

	}

}
