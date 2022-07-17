package Day7;

public class Phone_Demo {

	public static void main(String[] args) {
		
		//Creating Object
		Phone phone1 = new Phone("iphone",1500000,"white");
		Phone phone2 = new Phone("samsung",390000,"black");
//		Phone phone3 = new Phone("xiaomi",800000,"cyan");
		
		System.out.println("\n------- Phone 1 Info -------\n");
		System.out.println("Brand : " + phone1.brand);
		System.out.println("Color : " + phone1.color);
		System.out.println("Price : " + phone1.price + " ks");
		
		phone1.call();
		phone1.sendSms();
		
		System.out.println("\n------- Phone 2 Info -------\n");
		System.out.println("Brand : " + phone2.brand);
		System.out.println("Color : " + phone2.color);
		System.out.println("Price : " + phone2.price + " ks");
		
		phone2.call();
		phone2.sendSms();
		
		Phone.shop = "abc";
		System.out.println("Phone2's shop name : " + Phone.shop);
	}

}
