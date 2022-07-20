package Day12;

public class HasRS {
	public static void main(String[] args) {
		Author author = new Author("Mya Than Thint", "Myaing");
		Book book = new Book("War & Peace", 10000, author);
		
		System.out.println("Book Name : " + book.name);
		System.out.println("Book Price : " + book.price);
		System.out.println("----------Author Detail---------");
		System.out.println("Author Name : " + book.author.name);
		System.out.println("Native Town : " + book.author.native_town);
	}
}

class Author {
	String name;
	String native_town;
	
	public Author(String name, String town) {
		this.name = name;
		this.native_town = town;
	}
}

class Book {
	String name;
	int price;
	Author author;
	
	public Book(String name, int price, Author auth) {
		this.name = name;
		this.price = price;
		this.author = auth;
	}
}