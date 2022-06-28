package Day2;

import java.util.Scanner;

public class Switch_Expression {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		
		System.out.print("Enter Food Name : ");
		String name = sc.nextLine();
		
//		String category = switch(name) {
//				case "burger", "pzza", "sandwich" -> "Fast Food";
//				case "milk tea", "yougurt" -> "Dessert";
//				case "mohinga" -> "Burmese Food";
//				case "sushi" -> "Japanese Food";
//				default -> "Unknown";
//		};
		
		var category = switch(name) {
			case "burger", "pizza","saandwich" -> {
				if(name.equals("pizza")) 
					System.out.println(name + " is an Italian Food");
					yield "Fast Food";
			}
			case "milk tea", "yougurt" -> {
				yield "Dessert";
			}
			case "mohinga" -> "Burmese Food";
			case "sushi" -> "Japanese Food";
			default -> "Unknown";
		};
		
		System.out.println(name + " is " + category);
		
		sc.close();
		
	}

}
