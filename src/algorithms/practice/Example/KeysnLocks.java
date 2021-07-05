package algorithms.practice.Example;

import java.util.HashMap;

public class KeysnLocks<T extends Comparable<? super T>> {

	public void findKeyLocksMatch(T[] nuts, T[] bolts)
	{
		if (nuts.length != bolts.length)
			return;
		if (nuts == null || bolts == null)
			return;
		match(nuts, bolts,nuts.length);
	}

	private void match(T[] nuts, T[] bolts,int length) {
		HashMap<T, Integer> hash = new HashMap<>();
		 
	    // creating a hashmap for nuts
	    for (int i = 0; i < length; i++)
	      hash.put(nuts[i], i);
	 
	    // searching for nuts for each bolt in hash map
	    for (int i = 0; i < length; i++)
	      if (hash.containsKey(bolts[i]))
	        nuts[i] = bolts[i];
		
	}
}
