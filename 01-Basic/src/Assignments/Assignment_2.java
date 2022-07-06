package Assignments;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {

		double [] [] laptopList = {
				{230.21, 400.21, 294.2, 693.33, 340.44, 691.99 },
				{529.48, 920.483, 676.66, 1594.65, 783.012, 1591.577},
				{552.504, 960.504, 706.08, 1663.99, 817.056, 1660.776},
				{690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97}
		};
		
		
		int g = 0;
		int h = 0;
		String coreCount = "";
		String [] cores = {"core i3", "core i5", "core i7", "core i9"};
		String [] brands = {"Lenovo", "HP", "Samsung", "Acer", "Dell", "Asus"};
		System.out.println("\n\t----------------------------------------------Laptop List----------------------------------------------\n");
		System.out.print("\tBrands\t\t");
		for(var b = 0 ; b < 6 ; b++) {
			System.out.print(brands[b] + "\t\t");
		}
		System.out.println();
		
		for(var j = 0; j < 4 ; j++) {
			System.out.print("\t" + cores[j] + "\t\t");
			for(var c = 0; c < 6 ; c++) {
				System.out.print(laptopList[j][c] + "\t\t");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\tEnter The Brand You Want To Buy : ");
		String brand = sc.nextLine();
		
		for( var s = 0 ; s < 6 ; s++ ) {
			if(brands[s].equalsIgnoreCase(brand)) {
				System.out.print("\tEnter The core number You Want TO Buys (core i3, core i5, core i7, core i9): ");
				coreCount = sc.nextLine();
				g = s ;
				break;
			}
		}
		
		for ( var u = 0 ; u < 4 ; u++ ) {
			if(cores[u].equalsIgnoreCase(coreCount)) {
				h = u ;
			}
		}
		
		System.out.println("\t$ " + laptopList[h][g]);
		
		System.out.print("\tEnter Currency Exchange US dollar to MMK : ");
		double rate = sc.nextDouble();
		
		System.out.print("\tTotal Price in MMK is : " + (rate * laptopList[h][g]) + " kyats");
		sc.close();
		
	}

}
