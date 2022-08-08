package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Creating_List {
	public static void main(String[] args) {
		// Create immutable empty List
		List<String> list1 = List.of();
		System.out.println(list1);
		
		// Create Immutable data list
		List<String> list2 = List.of("John", "Seth", "Hanna");
		System.out.println(list2);
		
		// Create mutable empty list
		List<String> list3 = new ArrayList<String>();
		
		list3.add("Aung");
		list3.add("Maung");
		
		System.out.println("No of element: " + list3.size());
		
		Integer[] numbers = {100, 200, 300, 400};
		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(numbers));
		
		System.out.println("No of element in list4 : " + list4.size());
		
		System.out.println(list3);
	}
}
