package algorithms.practice.Example;

public class Main {
	

	public static void main(String[] args) {
		
		String nuts[] = {"@", "#", "$", "%", "^", "&"};
		String bolts[] = {"$", "%", "&", "^", "@", "#"};
		
		System.out.println("NutsnBolts or KeysnLocks using QuickSort");
		
		NutsnBolts<String> obj = new NutsnBolts<String>();
		obj.sortNutsAndBolts(nuts, bolts, null);

		printArray(nuts);
		printArray(bolts);
		
		System.out.println("\n"+"NutsnBolts or KeysnLocks using HashMap");
		
		KeysnLocks<String> obj1 = new KeysnLocks<String>();
		obj1.findKeyLocksMatch(nuts, bolts);
		printArray(nuts);
		printArray(bolts);

	}

	private static void printArray(String[] array) {
		
		for (String ch : array){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
	}

}
