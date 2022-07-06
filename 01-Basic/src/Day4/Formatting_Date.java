package Day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatting_Date {

	public static void main(String[] args) {
		
//		Predefined
		DateTimeFormatter format1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter format2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter format3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime date_time = LocalDateTime.now();
		
		System.out.println("----------Using Predefined Constants----------");
		String output = date.format(format1);
		System.out.println(output);
		System.out.println("Time Format : " + format2.format(time));
		System.out.println("DateTime Format : " + date_time.format(format3)+"\n\n");

//		Custom Pattern
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm:ss");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy 'at' hh:mm:ss a");
		
		System.out.println("----------Using Custom Pattern----------");
		System.out.println("Current date : " + date.format(f1));
		System.out.println("Current time : " + f2.format(time));
		System.out.println("Current date_time : " + date_time.format(f3));
		
//		Localized Style
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); //SHORT, MEDIUM, FULL, LONG
		DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); // MEDIUM
		DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); //SHORT
		
		System.out.println("\n----------Using Localized Style----------");
		System.out.println("Current Date : " + date.format(f4));
		System.out.println("Current Time : " + time.format(f5));
		System.out.println("Current Date Time : " + date_time.format(f6));
		
		
		
	}

}
