
public class MultipleCatch1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int [5];

		try
		{
		a [2] = 30/0 ;
		//a [8] = 25 ;
		System.out.println(a[2]);
		String s1=null;
		System.out.println(s1.length());
		}
		catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticException Occured");
	}
		catch(ArrayIndexOutOfBoundsException aob)
		{

		System.out.println("ArrayIndexOutOfBoundsException Occured");
		}
		catch(Exception e)
		{
			System.out.println("ParentException Occured");
		}
		{
		System.out.println("Yaay!!! Exceptions cleared");

		}
	}

}
