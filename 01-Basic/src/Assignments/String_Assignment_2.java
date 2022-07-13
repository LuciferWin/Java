package Assignments;

import java.util.Scanner;

public class String_Assignment_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence : ");
		String sentences = sc.nextLine();
		
		if(sentences.contains("?")) {
			System.out.println("The sentence you enter is 'Question Type'.");
			if((sentences.startsWith("Wh") || sentences.startsWith("wh")) && sentences.contains("do")) {
					System.out.println("Your question is 'Simple Present Tense'.");
			}
			
			if(sentences.startsWith("Do") || sentences.startsWith("do")) {
				System.out.println("Your question is 'Simple Present Tense'.");
			}
			
		}else {
			System.out.println("The sentence you enter is not 'Question Type'.");
		}
		
		

		sc.close();
		
	}

}
