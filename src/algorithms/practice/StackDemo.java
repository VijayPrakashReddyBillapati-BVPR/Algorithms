package algorithms.practice;

import algorithms.practice.stacks.Stacks;
import algorithms.practice.stacks.StacksImpl;

public class StackDemo {

	public static void main(String[] args) {
		Stacks<Integer> stacks = new StacksImpl<Integer>();
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		for (int i=0; i<=10 ; i++) {
			stacks.push(3+i);
		}
		System.out.println(stacks.size());
		
		for (int i=0; i<=10 ; i++) {
			stacks.pop();
		}
	}

}
