package algorithms.practice.queues;

public class QueuesImpl<T> implements Queues<T> {

	int front = -1;
	int rear = -1;
	T[] store;
	int capacity;

	@SuppressWarnings("unchecked")
	public QueuesImpl() {
		store = (T[]) new Object[MAX];
		capacity = store.length;
	}

	@Override
	public boolean enqueue(T a) {

		if (rear >= capacity * 3 / 4) {
			reSize(capacity * 2);
		}
		if (front == -1) {
			front = 0;
		}

		store[++rear] = a;
		return true;
	}

	@SuppressWarnings("unchecked")
	private void reSize(int size) {
		T[] helper = store;
		int len = helper.length;
		int index=0;
		store = (T[]) new Object[size];
		for (int i = 0; i < len  ; i++) {
			if(helper[i]!=null)
			{
				store[index]=helper[i];
				index++;
			}
		}
		if(index>0)
		{
			front=0;
			rear = index-1;
		}
		helper = null;
		capacity = store.length;
	}

	@SuppressWarnings("unused")
	private void print(T[] store2) {
		for(int i=0;i<store.length;i++)
		{
			System.out.println(store2[i]);
		}
		
	}

	@Override
	public T dequeue() {
		T value = null;
		if (!isEmpty()) {

			value = store[front];
			store[front]=null;
			
			if (front >= rear) {
				front = -1;
				rear = -1;

			} else {
				front++;
			}
		} else {
			System.out.println("Queue is empty");
		}

		if (capacity / 4 > (rear - front)+1) {
			reSize(capacity / 4);
		}
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if(front>=0) {
		return store[front];
		}else
		{
			System.out.println("Empty");
			return (T) "-1";
		}
	}

	@Override
	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	@Override
	public int size() {

		return (rear - front)+1;
	}

	public boolean isFull() {
		if (front == 0 && rear == capacity) {
			return true;
		}
		return false;
	}

}
