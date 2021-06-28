package algorithms.practice.linkelist.stack;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedListImpl<Integer>();
		for(int i= 1 ; i<10; i+=2)
		{
			list.push(i*3);
		}
		for(int i= 1 ; i<10; i++)
		{
			System.out.println(list.pop());
		}
		

	}

}
