package CollectionTest;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(1, "Prasad");
			map.put(2, "Priyanka");
			map.put(3, "Nikhil");
			map.put(4, "Sayali");
			
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey()+ " " +m.getValue());
			}
	}

}
