import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner io = new Scanner(System.in);
		  System.out.println("Input the Length : ");
		  double l = io.nextDouble();
		  System.out.println("Input the Breadth: ");
		  double b = io.nextDouble();
		  System.out.println("Perimeter is " + 2 * (l + b));
		  System.out.println("Area is " + (l * b));
		  
	}

}
