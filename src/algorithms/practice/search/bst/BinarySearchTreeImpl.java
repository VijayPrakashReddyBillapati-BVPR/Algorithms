package algorithms.practice.search.bst;

import algorithms.practice.stacks.Stacks;
import algorithms.practice.stacks.StacksImpl;

public class BinarySearchTreeImpl<T extends Comparable<? super T>> implements BinarySearchTree<T> {

	public Node root;

	public BinarySearchTreeImpl() {
		root = null;
	}

	@Override
	public boolean insert(T a) {

		root = insertKey(root, a);
		return true;
	}

	private Node insertKey(Node rootNode, T key) {

		if (rootNode == null) {
			rootNode = new Node(key);
		}

		if (key.compareTo(rootNode.key) < 0) {
			rootNode.left = insertKey(rootNode.left, key);

		} else if (key.compareTo(rootNode.key) > 0) {

			rootNode.right = insertKey(rootNode.right, key);
		}

		return rootNode;
	}

	@Override
	public T findLargest() {
		Node node = searchRight(root);
		return node.key;
	}

	private Node searchRight(Node right) {
		if (right == null) {
			throw new IllegalArgumentException("tree must have atleast one node");
		}
		if (right.right != null) {
			return searchRight(right.right);
		}

		return right;
	}

	@Override
	public T findSmallest() {
		Node node = searchLeft(root);
		return node.key;
	}

	private Node searchLeft(Node left) {

		if (left == null) {
			throw new IllegalArgumentException("tree must have atleast one node");
		}
		if (left.left != null) {
			return searchLeft(left.left);
		}
		return left;
	}

	@Override
	public boolean search(T a) {
		if (search(root, a) == null) {
			return false;
		}
		return true;
	}

	private T search(Node node, T a) {
		T key = null;
		if (node != null) {
			if (node.key.compareTo(a) < 0) {
				key = search(node.right, a);

			} else if (node.key.compareTo(a) > 0) {

				key = search(node.left, a);

			} else if (node.key.compareTo(a) == 0) {
				key = node.key;
			}
		}

		return key;
	}

	
	
	@Override
	public T searchKthLargest(int k) {
		Node temp=root;
		if(temp== null)
		{
			throw new IllegalArgumentException("tree must have atleast one node");
		}
		Stacks<Node> stack = new StacksImpl<Node>();
		while(true)
		{
			while(temp!=null)
			{
				stack.push(temp);
				temp = temp.right;
			}
			temp = stack.pop();
			if(k==1) return temp.key;
			temp= temp.left;
			--k;
		}
	}

	@Override
	public T searchKthSmallest(int k) {
		
		Node temp=root;
		if(root== null)
		{
			throw new IllegalArgumentException("tree must have atleast one node");
		}
		Stacks<Node> stack = new StacksImpl<Node>();
		while(true)
		{
			while(temp!=null)
			{
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			if(k==1) return temp.key;
			temp= temp.right;
			k--;
		}
	}

	
	
	
	
	class Node {
		Node right;
		Node left;
		T key;

		public Node(Node right, T value, Node left) {
			super();
			this.right = right;
			this.key = value;
			this.left = left;
		}

		public Node(T value) {
			super();
			this.key = value;
			this.left = null;
			this.right = null;
		}

	}

}
