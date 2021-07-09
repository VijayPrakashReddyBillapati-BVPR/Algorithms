package algorithms.practice.search.redblackbst;

public class RedBlackBSTImpl<key extends Comparable<? super key>, value> implements RedBlackBST<key, value> {

	Node root = null;
	public static final boolean RED = true;
	public static final boolean BLACK = false;

	@Override
	public void put(key key, value value) {
		root = put(root, key, value);
	}

	private Node put(Node root, key key, value value) {
		if (root == null)
			root = new Node(key, value, RED);
		int comp = root.key.compareTo(key);
		if (comp < 0)
			root.left = put(root.left, key, value);
		else if (comp > 0)
			root.right = put(root.right, key, value);
		else if (comp == 0)
			root.value = value;

		if(root.left!=null && root.right!=null)
		{
			if (isRed(root.right) && !isRed(root.left))
				root = rotateLeft(root);
			if (isRed(root.left) && isRed(root.left.left))
				root = rotateRight(root);
			if (isRed(root.left) && isRed(root.right))
				flipColors(root);
		}

		return root;
	}

	private void flipColors(Node root) {
		root.color = RED;
		root.left.color = BLACK;
		root.right.color = BLACK;
	}

	private Node rotateRight(Node root) {
		Node temp = root.left;
		root.left=temp.right;
		temp.right=root;
		temp.color=root.color;
		root.color=RED;
		return temp;
		
		
		
	}

	private boolean isRed(Node node) {
		
		return node.color==RED;
	}

	private Node rotateLeft(Node root) {
		Node temp = root.right;
		root.right=temp.left;
		temp.left=root;
		temp.color=root.color;
		root.color=RED;
		return temp;
		
	}

//	@Override
	public value get1(key key) {
		Node node = root;
		if (node != null) {
			int comp = node.key.compareTo(key);
			if (comp < 0)
				return get(node.left.key);
			else if (comp > 0)
				return get(node.right.key);
			else if (comp == 0)
				return node.value;

		}
		return null;
	}

	@Override
	public value get(key key) {
		Node node = root;
		while (node != null) {
			int comp = node.key.compareTo(key);
			if (comp < 0)
				node = node.left;
			else if (comp > 0)
				node = node.right;
			else if (comp == 0)
				return node.value;

		}
		return null;
	}

	class Node {
		key key;
		value value;
		Node left, right;
		boolean color;

		public Node(key key, value value, boolean color) {
			super();
			this.key = key;
			this.value = value;
			this.color = color;
		}
	}

}
