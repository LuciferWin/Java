package Day6;

public class Throwing {

	public static void main(String[] args) {
		
		try {
			checkMark(-1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}
	
	static void checkMark(int mark) {
		if(mark < 0 || mark > 100) {
//			ArithmeticException obj = new ArithmeticException("Invalid Mark");
//			throw obj;
			
			throw new ArithmeticException("Invalid Mark");
		}
	}

}
