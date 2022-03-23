import java.util.Scanner;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Temperature in Fahrenheit");
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = (A-32)*5/9;
System.out.println("Temperature in Celcius is :"+B);
	}

}
