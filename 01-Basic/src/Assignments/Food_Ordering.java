package Assignments;

import java.util.Scanner;

public class Food_Ordering {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] Townships = {"Botahtaung", "Tarmwe", "Bahan", "Lathar"};
		int [] Times = {15, 30, 10, 45};
		String [] Menus = {"Pizza", "Burger", "Milk Tea", "Spicy Noodle"};
		
//		Menu
		System.out.println("****** Available Menus ******");
		for(var i = 0 ; i < 4 ; i ++) {
			System.out.println( i+1 + ". "+ Menus[i]);
		}
		
		int SelectedMenu;
		
		do{
			System.out.print("Please choose item : ");
			SelectedMenu = sc.nextInt();
			if(SelectedMenu >= 1 || SelectedMenu <= 4 ) {
				break;
			}
		}
		while(SelectedMenu <= 0 || SelectedMenu >= 5);
		
		sc.close();
		
//		while(SelectedMenu <= 0 || SelectedMenu >=5) {
//			System.out.print("Please choose item : ");
//			SelectedMenu = sc.nextInt();
//			if(SelectedMenu >= 1 || SelectedMenu <= 4 ) {
//				break;
//			}
//		}
//		
		System.out.println(SelectedMenu);
		
		
		
	}

}
