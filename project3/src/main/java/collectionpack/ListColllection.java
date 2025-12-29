package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListColllection {

	public static void main(String[] args) {
		
		List<String>fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		
		Iterator<String> it=fruits.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());This line not required 
			String result=it.next();
			System.out.println(result);
			
			if(result.equals("banana"))
			{
				it.remove();
			}
		}
		
		System.out.println(fruits);
		

	}

}
