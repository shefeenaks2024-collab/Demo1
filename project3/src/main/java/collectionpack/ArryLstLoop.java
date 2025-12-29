package collectionpack;

import java.util.ArrayList;

public class ArryLstLoop {

	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
	}

	
	
	
}