package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Buffer {

	public static void main(String[] args) throws IOException {

		StringBuffer buffer = new StringBuffer("Java Programming");
		buffer.append(" Language");
		System.out.println("After Append, buffer : " + buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("After Insert, buffer : " + buffer);
		
		buffer.replace(0, 4, "Python");
		System.out.println("After Replace, buffer : " + buffer);
		
		System.out.println("index of 'Language' :" + buffer.indexOf("Language"));
		System.out.println("substring : " + buffer.substring(7));
		System.out.println("NO of characters : " + buffer.length());
		
//		int mark = 100;
//		System.out.println("You got " + mark + " marks!");
//		if(mark >= 50) {
//			System.out.println("Exam Fail");
//		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
		reader.close();
		
	}

}
