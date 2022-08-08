package Day14;

import java.util.ArrayList;

public class ArrayList_Testing {
	public static void main(String[] args) {
//		Creating Empty ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		
//		Add an Element
		list.add(100);
		list.add(50);
		list.add(10);
		
		System.out.println("No of items : " + list.size());
		System.out.println(list);
		
//		add with specific index
		list.add(1, 400);
		System.out.println("After add, [1] : " + list.get(1));
		System.out.println("After add, [2] : " + list.get(2));
		
//		Display all items with for each
		list.forEach(num -> System.out.println(num));
	}
}
