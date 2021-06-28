package algorithms.practice.linkelist;

import java.io.Serializable;

import algorithms.practice.linkelist.queue.LinkedListImpl.Node;


@SuppressWarnings({ "serial" })
public class LinkedListsImpl<T> implements LinkedLists<T>,Serializable{
	
	private Node head = null;
	int size =0;
	private Node first = null;
	private Node last = null;
	
	
	@Override
	public void insertFirst(T data) {
		Node f = first;
		Node first = new Node(data);
		if(f==null)
		{
			last =  first;
		}else {
			f.prev = first;
		}
		size++;
	}
	
	@Override
	public void insertLast(T data) {
		Node l = last;
		Node last = new Node(data);
		if(l==null)
		{
			first = last;
		}else {
			l.next= last;
		}
		size++;
	}
	


	@Override
	public T unlinkFirst() {
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

	@Override
	public T unlinkLast() {
		T data = last.data;
		last= last.prev;
		if(isEmpty())
		{
			first= last;
		}else {
			last.next=null;
		}
		size--;
		return data;
	}

	@Override
	public void linkBefore(T e, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printlist() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		T[] result = (T[]) new Object[size];
		 int i = 0;
		 for (Node x = first; x != null; x = x.next)
		 result[i++] = x.data;
		 return result;
	}
	public String toString() {
		String data="";
		 for (Node x = first; x != null; x = x.next) {
			 data+=String.valueOf(x.data);
		 }
		 
		 return data;
	}

	class Node {
		
		T data;
		Node prev;
		Node next;
		
		public Node(T data) {
			this.data = data;
		}
	}

	@Override
	public int size() {
		return size;
	}
	
}
