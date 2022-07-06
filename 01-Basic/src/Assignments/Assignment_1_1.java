package Assignments;

import java.util.Scanner;

public class Assignment_1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int zero = 0, positive = 0, negative = 0;
		
		System.out.print("How many numbers do you want to type : ");
		int number = sc.nextInt();
		
		double [] anyNum = new double[number];
		
		for(int i = 0; i <= number-1; i++) {
			System.out.print(i+1 + ".Enter any number : ");
			anyNum[i] = sc.nextDouble();
		}
		
//		System.out.println(Arrays.toString(anyNum));
		
		for(int i = 0; i <= number-1; i++) {
			if(anyNum[i] < 0) {
				negative += 1;
			}else if(anyNum[i] == 0) {
				zero += 1;
			}else {
				positive += 1;
			}
		}
		
		System.out.println("Numbers of zero : " + zero);
		System.out.println("Numbers of positive number : " + positive);
		System.out.println("Numbers of negative number : " + negative);
		sc.close();
	}

}
