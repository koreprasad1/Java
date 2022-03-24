import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner io = new Scanner(System.in);
		  System.out.println("Input the radius of the circle: ");
		  double r = io.nextDouble();
		  System.out.println("Perimeter is " + (2 * r * Math.PI));
		  System.out.println("Area is " + (Math.PI * r * r));
	}

}
