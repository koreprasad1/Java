import java.util.Scanner;

public class largestnestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a, b, c;
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		if(a>=b)
		{
			if(a>=c)
				System.out.println("The Largest No. is "+a);
			
		}
		else
			System.out.println("The Largest No. is "+c);
		{
			if(b>=c)
				System.out.println("The Largest No. is "+b);
						
		}
	}

}
