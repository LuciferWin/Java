package Day10;

class K extends A{
	int j;
	
	public K() {
		System.out.println("B's default constructor");
	}
	
	public K(int b) {
		super(100);
		System.out.println("B's argrment constructor");
		
	}
}
