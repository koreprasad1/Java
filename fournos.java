import java.util.Scanner;
public class fournos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         int a = in.nextInt();
         System.out.print("Input second number: ");
         int b = in.nextInt();
		 System.out.print("Input third number: ");
         int c = in.nextInt();
         System.out.print("Input fourth number: ");
         int d = in.nextInt();
         if(a == b && b == c && c==d )
         {
        	 System.out.println("Numbers are Equal");
         }
         else
         {
        	 System.out.println("Numbers are not Equal");
         }
	}

}
