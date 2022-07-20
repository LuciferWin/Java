package Day12;

import java.time.LocalDate;

public class Has_A_RS_2 {
	public static void main(String[] args) {
		SaleRecord[] record = new SaleRecord[3];
		
		var p1 = new Product("Coffee", 3500);
		var p2 = new Product("Juice", 2500);
		
		record[0] = new SaleRecord(1001, 10, LocalDate.now(), p1);
		record[1] = new SaleRecord(1002, 8, LocalDate.now(), p2);
		record[2] = new SaleRecord(1003, 9, LocalDate.now(), p1);
		
		System.out.println("No \t SaleDate \t Product \t Price \t Qty \t Sub Total");
		System.out.println("------------------------------------------------------------------");
		
		for(var i = 0 ; i < record.length ; i++ ) {
			record[i].showData();
		}
	}
}

class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

class SaleRecord {
	int id;
	int saleQty;
	LocalDate saleDate;
	Product product;
	
	public SaleRecord(int id, int saleQty, LocalDate saleDate, Product product) {
		super();
		this.id = id;
		this.saleQty = saleQty;
		this.saleDate = saleDate;
		this.product = product;
	}
	
	void showData() {
		System.out.print(id + "\t");
		System.out.print(saleDate + "\t ");
		System.out.print(product.name + "\t\t");
		System.out.print(product.price + "\t  ");
		System.out.print(saleQty + "\t ");
		System.out.print((product.price * saleQty) + " ks\n");
	}
}