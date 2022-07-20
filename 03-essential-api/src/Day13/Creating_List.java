package Day13;

import java.util.ArrayList;
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
		System.out.println(list3);
	}
}
