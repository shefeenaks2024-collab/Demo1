package collectionpack;

import java.util.ArrayList;

public class ArryLstforeach {

	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		
		for(String i:fruits)
		{
			System.out.println(i);
		}

	}

}
