package algorithms.practice.linkelist;

import algorithms.practice.linkelist.LinkedListsImpl.Node;

public interface LinkedLists<T> {

	
	public void insertFirst(T e);
	public void insertLast(T e);
	
	public void linkBefore(T e,int index);
	
	public T unlinkFirst();
	public T unlinkLast();
	
	public boolean isEmpty();
	public void printlist();
	public T[] toArray();
	public String toString();
	
	public int size();
	
	
}
