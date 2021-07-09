package algorithms.practice.search.redblackbst;

public class Demo {

	public static void main(String[] args) {
		RedBlackBST<String, Integer> rbt = new RedBlackBSTImpl<String, Integer>();
		for (int i = 0; i < 5; i++) {
			rbt.put("vjy", i * 5);
		}

		System.out.println(rbt.get("vjy"));
		System.out.println(rbt.get1("vjy"));
	}

}
