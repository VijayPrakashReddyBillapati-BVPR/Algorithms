package algorithms.practice.stacks;

public class StacksImpl<T> implements Stacks<T> {
	
	
	int top;
	private T[] store;
	int capacity = MAX;
	
	
	@SuppressWarnings("unchecked")
	public
	StacksImpl()
	{
		top = -1;
		store = (T[]) new Object[MAX];
	}
	
	
	@Override
	public boolean push(T a) {
		if(top >= capacity*3/4)
		{
			reSize(capacity*2);
		}
		store[++top]=a;
		return true;
	}

	@Override
	public T pop() {
		if(top <= 0)
		{
			System.out.println("Stack Underflow");
		}
		T value = store[top];
		store[top--]=null;
		if(capacity/4 > top)
		{
			reSize(capacity/4);
		}
		return value;
	}

	@SuppressWarnings("unchecked")
	private void reSize(int size) {
		T[] helper = store;
		store = (T[]) new Object[size];
		for(int i=0;i<=top;i++)
		{
			store[i] = helper[i];
		}
		helper = null;
		capacity = store.length;
	}


	@Override
	public T peek() {
		
		return store[top];
	}

	@Override
	public boolean isEmpty() {
		
		return top<0;
	}

	@Override
	public int size() {
		
		return capacity;
	}
}
