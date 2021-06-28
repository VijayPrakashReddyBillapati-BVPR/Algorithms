package algorithms.practice.linkelist.queue;

public class LinkedListImpl<T> implements LinkedList<T> {

	private Node first=null;
	private Node last= null;
	private int size= 0;
	
	@Override
	public boolean isEmpty() {
		
		return first==null;
	}

	@Override
	public boolean enqueue(T data) {
		Node old_last = last;
		last = new Node(data);
		last.next = null;
		if(isEmpty())
		{
			first = last;
		}else {
			old_last.next=last;
		}
		size++;
		return true;
	}


	@Override
	public T dequeue() {
		T item = first.data;
		first = first.next;
		if(isEmpty())
		{
			last = null;
		}else {
			first.prev = null;
		}
		size--;
		return item;
	}
	
	public String toString() {
		String data="";
		 for (Node x = first; x != null; x = x.next) {
			 data+=String.valueOf(x.data);
		 }
		 
		 return data;
	}
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[size];
		 int j = 0;
		 for (Node x = first; x != null; x = x.next) {
		 result[j++] = x.data;}
		 
		 return result;
	}

	public int size() {
		return size;
	}

	
	public class Node{
		T data;
		Node prev;
		Node next;
		Node(T data)
		{
			this.data = data;
		}
	}

}
