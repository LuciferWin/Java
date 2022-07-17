package Day8;

import java.time.LocalDate;

public class Copy_Constructor {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1961, 10, 16);
		Book b1 = new Book("Detective U San Shar", date, 6000);
		System.out.println(b1); // 31
		Book b2 = new Book(b1);
		System.out.println(b2);
		
		changePrice(b2);
		System.out.println("After change price , price = " + b2.price);
		int a = 100;
		changeValue(a);
		System.out.println("After change value , a = " + a);
	}

	private static void changeValue(int b) {
		b = 300;
		
	}

	private static void changePrice(Book b2) {
		b2.price = 10000;
	}
}

class Book {
	String title;
	LocalDate publishDate;
	int price;
	
	public Book(String title, LocalDate p_date, int price) {
		this.title = title;
		this.publishDate = p_date;
		this.price = price;
	}
	
	public Book(Book obj) {
		this.title = obj.title;
		this.publishDate = obj.publishDate;
		this.price = obj.price;
	}
	
	@Override
	public String toString() { // 9
		return "title = "  + this.title + ", date = " +
				this.publishDate + ", price = " + this.price;
	}
}