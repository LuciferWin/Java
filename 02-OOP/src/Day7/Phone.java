package Day7;

public class Phone {

	// Fields
	String brand;
	String color;
	int price;
	
	static String shop;
	
	//Constructor
	public Phone (String brand, int price, String color) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//Methods
	public void call() {
		System.out.println("Phone calling can be made at here");
	}
	
	public void sendSms() {
		System.out.println("Message can be sent at here");
	}

}
