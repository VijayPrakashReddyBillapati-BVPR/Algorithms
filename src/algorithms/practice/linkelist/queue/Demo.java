package algorithms.practice.linkelist.queue;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedListImpl<Integer>();
		for(int i= 1 ; i<10; i+=2)
		{
			System.out.println("enqueue");
			list.enqueue(i*3);
		}
		
		for(int i= 1 ; i<3; i++)
		{
			System.out.println("dequeue ");
			list.dequeue();
		}

	}

}
