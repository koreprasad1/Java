import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner io = new Scanner(System.in);
		  System.out.println("Input the Side Length : ");
		  double s = io.nextDouble();
		  System.out.println("Perimeter is " + (s * s));
		  System.out.println("Area is " + (4 * s));
	}

}
