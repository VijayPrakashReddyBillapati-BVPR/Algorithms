package algorithms.practice;

import algorithms.practice.queues.Queues;
import algorithms.practice.queues.QueuesImpl;

public class QueuesDemo {

	public static void main(String[] args) {
		Queues<Integer> q = new QueuesImpl<Integer>();
		
		for(int i = 0; i<10;i++)
		{
			q.enqueue(i);
		}
		
		System.out.println("size "+q.size());
		System.out.println("peek "+q.peek());
		
		
		System.out.println("************************* dequeue  ***********************************");
		for(int i = 0; i<12;i++)
		{
			System.out.println(q.dequeue());
		}
		
		System.out.println("size "+q.size());
		System.out.println("peek "+q.peek());
	}

}
