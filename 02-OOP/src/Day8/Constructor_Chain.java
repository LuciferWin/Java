package Day8;

public class Constructor_Chain {
	public Constructor_Chain() {
		this(100);
		System.out.println("This is default constructor");
	}
	
	public Constructor_Chain(int i) {
		System.out.println("i = " + i);
	}
	
	public Constructor_Chain(int i, int j) {
		this(j);
		System.out.println("i = " + i + ", j = " + j) ;
	}
	
	public static void main(String[] args) {
		Constructor_Chain obj = new Constructor_Chain(100, 200);
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return ("Hello");
	}
}
