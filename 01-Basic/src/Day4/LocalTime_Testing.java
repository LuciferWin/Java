package Day4;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTime_Testing {

	public static void main(String[] args) {
		
//		Create
		LocalTime now = LocalTime.now();
		LocalTime time1 = LocalTime.of(4, 36, 22);
		LocalTime time2 = LocalTime.parse("06:45:56");
		
		System.out.println("Current Time : " + now);
		System.out.println("Time 1 : " + time1);
		System.out.println("Time 2 : " + time2);
		
		
//		LocalDateTime
		LocalDateTime obj1 = LocalDateTime.now();
		LocalDateTime obj2 = LocalDateTime.of(2022, Month.JANUARY, 16, 10, 30);
		
		System.out.println("Current Date & Time : " + obj1);
		System.out.println("OBJ 2 : " + obj2);

	}

}
