package Day2;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Food Name : ");
		String name = sc.nextLine();
		String category;
		switch(name) {
		case "burger", "pizza", "sandwich" :
			category = "Fast Food";
			break;
		case "yougurt", "milk tea" :
			category = "Dessert";
			break;
		case "mohinga" :
			category = "Burmese Food";
			break;
		case "sushi" :
			category = "Japanese Food";
			break;
		default :
			category ="Unknown";
		}
		
		System.out.println(name + " is " + category);
		sc.close();
	}

}
