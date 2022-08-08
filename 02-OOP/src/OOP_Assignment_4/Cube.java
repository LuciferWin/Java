package OOP_Assignment_4;

public class Cube implements Shape{
	int x;
	
	public double Volume(int x) {
		double V = x * x * x;
		return V;
	}

	@Override
	public double Area(int x) {
		double A = x * x;
		return A;
	}
}
