package Test;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectangle rect = new Rectangle();
		rect.setValues(7,4.5);
		
		System.out.println("The Area of Rectangle is "+rect.getArea());
		
		Triangle Tri = new Triangle();
		Tri.setValues(6, 4);
		
		System.out.println("The Area of Triangle is "+Tri.getArea());
		
		Circle circ = new Circle();
		circ.setRadius(5);
		
		System.out.println("The Area of Circle is "+circ.getArea());
	}

}
