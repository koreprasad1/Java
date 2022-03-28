package CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Convert_AtoL_Demo {

	public static void main(String[] args) 
	{
		String[] array = {"Payal", "Priyanka", "Prasad", "Jeevan"};
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		for(String name : array)
		{
			list.add(name);
			Iterator<String> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
