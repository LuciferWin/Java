package Assignments;

import java.util.Scanner;

public class Assignment_1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String h1 = "You take care your health well!";
		String h2 = "You are very hardworking!";
		String h3 = "You are abnormal!";
		
		while(true) {
			double BedTimeHour = 0;
			double BedTimeMinute = 0;
			double TotalBedTime = 0;
			double WakeTimeHour = 0;
			double WakeTimeMinute = 0;
			double TotalWakeTime = 0;
			double Total = 0;
			double Standard = 12 ;
			
			System.out.print("When do you go bed? Enter Hours : ");
			BedTimeHour = sc.nextDouble();
			System.out.print("Enter Minutes : ");
			BedTimeMinute = sc.nextDouble();
			
			System.out.print("When do you get up? Enter Hours : ");
			WakeTimeHour = sc.nextDouble();
			System.out.print("Enter Minutes : ");
			WakeTimeMinute = sc.nextDouble();
			
			TotalBedTime = BedTimeHour + (BedTimeMinute / 60);
			TotalWakeTime = WakeTimeHour + (WakeTimeMinute / 60);
			
			Total = (Standard - TotalBedTime) + TotalWakeTime;
			
			if(Total < 5) {
				System.out.println(h2);
			}else if(Total >= 5 && Total <= 8) {
				System.out.println(h1);
			}else if(Total > 8) {
				System.out.println(h3);
			}
			
			
			System.out.println("Enter 'exit' to Exit, Enter '0' to Continue !");
			String Quest = sc.next();
			
			if(Quest.equals("exit")) {
				System.out.println("-----End Of Program-----");
				break;
			}else if(Quest.equals("0")){
				System.out.println("-----You Choosed To Continue-----");
				continue;
			}
		}
		
		sc.close();

	}

}
