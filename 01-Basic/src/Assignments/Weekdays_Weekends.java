package Assignments;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Weekdays_Weekends {

	public static void main(String[] args) {
		
		String[] WeekDays = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
		String[] Weekends = {"SATURDAY", "SUNDAY"};
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy");
		DayOfWeek currentDay = date.getDayOfWeek();
		
		for(int i = 0 ; i < 5 ; i++ ) {
			if(currentDay.toString().equalsIgnoreCase(WeekDays[i])) {
				System.out.println(date.format(f1));
				System.out.println("***********************");
				System.out.println("I have no time. I am studying Programming Lanuage!");
				break;
			}
		}
		
		for(int j = 0 ; j < 2 ; j++) {
			if(currentDay.toString().equalsIgnoreCase(Weekends[j])) {
				System.out.println(date.format(f1));
				System.out.println("***********************");
				System.out.println("Today is my holiday!");
				break;
			}
		}
		
	}

}
