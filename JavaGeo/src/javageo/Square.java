package javageo;


public class Square extends Shape {
	
	protected double l;
	
	public Square(double sideLength) {
	
		l = sideLength;
		
	}
	
	@Override
	public double getArea() {
		return Math.PI *Math.pow(l, 2);
	}
}

