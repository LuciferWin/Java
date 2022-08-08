package OOP_Assignment_4;

public class Circle implements Shape{
	int radius;
	
	@Override
	public double Area(int radius) {
		double A = Math.PI * (radius * radius);
		return A;
	}
	
	@Override
	public double Volume(int x) {
		return 0;
	}

}
