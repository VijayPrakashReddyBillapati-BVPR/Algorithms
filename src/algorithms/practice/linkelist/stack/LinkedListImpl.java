package algorithms.practice.linkelist.stack;

import java.util.Iterator;

public class LinkedListImpl<T> implements LinkedList<T> {
	
	private Node first = null;


	@Override
	public void push(T data) {
		Node old_node = first;
		first = new Node(data);
		if(old_node != null)
		{
			first.next=old_node;
		}else {
			first.next = null;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if(!isEmpty())
		{
			T item = first.data;
			first = first.next;
			return item;
		}else {
			return (T) "Stack is Empty";
		}
	}

	@Override
	public boolean isEmpty() {
		
		return first==null;
	}
	
	
	class Node{
		T data;
		Node next;
		Node(T data)
		{
			this.data = data;
		}
	}

}
