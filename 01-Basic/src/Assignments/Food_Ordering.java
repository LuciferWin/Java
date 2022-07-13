package Assignments;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Food_Ordering {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] Townships = {"Botahtaung", "Tarmwe", "Bahan", "Lathar"};
		int [] Times = {15, 30, 10, 45};
		String [] Menus = {"Pizza", "Burger", "Milk Tea", "Spicy Noodle"};
		String [] Orders = {"Order Now", "Preorder"};
		
//		Menu
		System.out.println("****** Available Menu ******");
		for(var i = 0 ; i < 4 ; i ++) {
			System.out.println( i+1 + ". "+ Menus[i]);
		}
		
		System.out.print("Please choose item : ");
		int SelectedMenu = sc.nextInt();
		if(SelectedMenu >= 1 && SelectedMenu <= 4) {
			System.out.print(SelectedMenu +  ". " + Menus[SelectedMenu-1]);
		}else {
			while(SelectedMenu < 1 || SelectedMenu > 4) {
				System.out.print("Please choose item : ");
				SelectedMenu = sc.nextInt();
				if(SelectedMenu >= 1 && SelectedMenu <= 4) {
					System.out.print(SelectedMenu + ". "+ Menus[SelectedMenu-1]);
					break;
				}
				SelectedMenu = 0;
			}
		}
		System.out.println();
		
//		Deliver
		System.out.println("\n****** Deliveriable Township ******");
		for(var i = 0 ; i < 4 ; i++) {
			System.out.println( i+1 + ". "+ Townships[i]);
		}
		
		System.out.print("Please choose township : ");
		int SelectedTownwship = sc.nextInt();
		if(SelectedTownwship >= 1 && SelectedTownwship <= 4) {
			System.out.print(SelectedTownwship +  ". " + Townships[SelectedTownwship-1]);
		}else {
			while(SelectedTownwship < 1 || SelectedTownwship > 4) {
				System.out.print("Please choose township : ");
				SelectedTownwship = sc.nextInt();
				if(SelectedTownwship >= 1 && SelectedTownwship <= 4) {
					System.out.print(SelectedTownwship + ". "+ Townships[SelectedTownwship-1]);
					break;
				}
				SelectedTownwship = 0;
			}
		}
		System.out.println();
		
		
//		Order
		System.out.println("\n****** Order Type ******");
		for(var i = 0 ; i < 2 ; i++) {
			System.out.println( i+1 + ". "+ Orders[i] + "?");
		}
		System.out.print("Please choose 1 or 2 : ");
		int SelectedOrder = sc.nextInt();
		if(SelectedOrder == 1 || SelectedOrder == 2) {
			if(SelectedOrder == 1) {
				System.out.println("\n****** Your Order Information ******");
				System.out.println("Item Name : " + Menus[SelectedMenu]);
				System.out.println("Address : " + Townships[SelectedTownwship]);
				System.out.println("Duration : " + Times[SelectedTownwship] + " mins");
				LocalTime ArrTime = LocalTime.now().plus(Duration.of(Times[SelectedTownwship], ChronoUnit.MINUTES));
				System.out.println("Arrival Time : " + ArrTime);
				System.out.println("****** Thank you for your ordering ******");
				System.exit(0);
			}
			if(SelectedOrder == 2) {
				System.out.print("Enter deliver date (Maximum Plus days = 3) : ");
				int DeliverDate = sc.nextInt();
				if(DeliverDate < 1 || DeliverDate > 3) {
					while(DeliverDate < 1 || DeliverDate > 3) {
						System.out.print("Enter deliver date (Maximum Plus days = 3) : ");
						DeliverDate = sc.nextInt();
						if(DeliverDate >= 1 && DeliverDate <= 3) {
							System.out.println("\n****** Your Order Information ******");
							System.out.println("Item Name : " + Menus[SelectedMenu]);
							System.out.println("Address : " + Townships[SelectedTownwship]);
							LocalDate ArrDate = LocalDate.now().plusDays(DeliverDate);
							DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
							System.out.println("Arrival Date : " + ArrDate.format(f1));
							System.out.println("****** Thank you for your ordering ******");
							break;
						}
						DeliverDate = 0;
					}
					System.exit(0);
				}
				if(DeliverDate >= 1 && DeliverDate <= 3) {
					System.out.println("\n****** Your Order Information ******");
					System.out.println("Item Name : " + Menus[SelectedMenu]);
					System.out.println("Address : " + Townships[SelectedTownwship]);
					LocalDate ArrDate = LocalDate.now().plusDays(DeliverDate);
					DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
					System.out.println("Arrival Date : " + ArrDate.format(f1));
					System.out.println("****** Thank you for your ordering ******");
					System.exit(0);
				}
			}
			
		}
		if(SelectedOrder != 1 || SelectedOrder != 2) {
			while(SelectedOrder < 1 || SelectedOrder > 3) {
				System.out.print("Please choose 1 or 2 : ");
				SelectedOrder = sc.nextInt();
				if(SelectedOrder == 1 || SelectedOrder == 2) {
					if(SelectedOrder == 1) {
						System.out.println("\n****** Your Order Information ******");
						System.out.println("Item Name : " + Menus[SelectedMenu]);
						System.out.println("Address : " + Townships[SelectedTownwship]);
						System.out.println("Duration : " + Times[SelectedTownwship] + " mins");
						LocalTime ArrTime = LocalTime.now().plus(Duration.of(Times[SelectedTownwship], ChronoUnit.MINUTES));
						System.out.println("Arrival Time : " + ArrTime);
						System.out.println("****** Thank you for your ordering ******");
						System.exit(0);
					}
					if(SelectedOrder == 2) {
						System.out.print("Enter deliver date (Maximum Plus days = 3) : ");
						int DeliverDate = sc.nextInt();
						if(DeliverDate < 1 || DeliverDate > 3) {
							while(DeliverDate < 1 || DeliverDate > 3) {
								System.out.print("Enter deliver date (Maximum Plus days = 3) : ");
								DeliverDate = sc.nextInt();
								if(DeliverDate >= 1 && DeliverDate <= 3) {
									System.out.println("\n****** Your Order Information ******");
									System.out.println("Item Name : " + Menus[SelectedMenu]);
									System.out.println("Address : " + Townships[SelectedTownwship]);
									LocalDate ArrDate = LocalDate.now().plusDays(DeliverDate);
									DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
									System.out.println("Arrival Date : " + ArrDate.format(f1));
									System.out.println("****** Thank you for your ordering ******");
									break;
								}
								DeliverDate = 0;
							}
							System.exit(0);
						}
						if(DeliverDate >= 1 && DeliverDate <= 3) {
							System.out.println("\n****** Your Order Information ******");
							System.out.println("Item Name : " + Menus[SelectedMenu]);
							System.out.println("Address : " + Townships[SelectedTownwship]);
							LocalDate ArrDate = LocalDate.now().plusDays(DeliverDate);
							DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
							System.out.println("Arrival Date : " + ArrDate.format(f1));
							System.out.println("****** Thank you for your ordering ******");
							System.exit(0);
						}
					}
				}
				SelectedOrder = 0;
			}
		}

		
		sc.close();
		
	}

}
