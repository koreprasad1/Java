
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int [5];

		try
		{
		a [2] = 30/0 ;
		a [8] = 25 ;
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
