package javageo;

public class JavaGeo {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		
		
		shapes[0] = new Circle(2);
		shapes[0].setColor(" Blue ");
		
		shapes[1] = new Square(2);
		shapes[1].setColor( "Red ");
		
		for (Shape s:shapes) {
			System.out.println("Cor: " + s.getColor() + "Area: "+ s.getArea());
		}
		
	}

}
	public abstract class Shape{
		String color;
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return color;
		}
		
		public abstract double getArea();
		
	}
	
	public class Circle extends Shape{
		
		protected double r;
		
		Circle(double radius){
			
			r =radius;
	}
		
		
		@Override
		public double getArea() {
			return Math.PI * Math.pow(r, 2);
		}
	}
	
	public class Square extends Shape {
		
		
		protected double l;
		
		Square(double sideLength) {
		
			l = sideLength;
			
		}
		
		@Override
		public double getArea() {
			return Math.PI *Math.pow(1, 2);
		}
	}


