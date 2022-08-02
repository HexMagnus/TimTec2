package javageo;

public class Circle extends Shape{
	
	protected double r;
	
	public Circle(double radius){
		
		r =radius;
}
	
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
}