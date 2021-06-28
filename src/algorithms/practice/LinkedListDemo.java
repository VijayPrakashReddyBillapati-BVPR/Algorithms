package algorithms.practice;

import algorithms.practice.linkelist.LinkedLists;
import algorithms.practice.linkelist.LinkedListsImpl;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedLists<Integer> list = new LinkedListsImpl<Integer>();
		for(int i= 2; i<5 ; i++)
		{
			list.insertFirst(i);
			
		}
	}

}
