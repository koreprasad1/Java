import java.util.Scanner;
public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Length in Inches");
Scanner sc = new Scanner(System.in);
double A = sc.nextInt();
double B = A/39.3700787;
System.out.println("Length in Meters is:"+B);
	}

}
