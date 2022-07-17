package Day8;

public class SingletonClass {
	public static void main(String[] args) {
		Database_Config obj = Database_Config.getInstance();
		System.out.println(obj);
		
		Database_Config obj2 = Database_Config.getInstance();
		System.out.println(obj2);
	}
}
