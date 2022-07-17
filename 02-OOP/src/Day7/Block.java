package Day7;

public class Block {

	static int Min_Length;
	String phone;
	
	public Block(String input) {
		System.out.println("This is arg constructor");
		this.phone = input;
	}
	
	public Block(){
		System.out.println("This is default constructor");
	}
	
	{//instance block
		System.out.println("This is instance block");
		phone = "Invalid Number";
	}
	
	static {
		System.out.println("This is static block");
		Min_Length = 11;
	}
	
	public static void main(String[] args) {
		Block obj1 = new Block("0256416");
		System.out.println("Object1 : " + obj1.phone);
		
		System.out.println("-----------------");
		
		Block obj2 = new Block();
		System.out.println("Object2 : " + obj2.phone);
	}
	
}
