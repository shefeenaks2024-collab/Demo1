package collectionpack;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayLstColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		//get
		
		System.out.println(fruits.get(0));
		
		//replace
		
		System.out.println(fruits.set(0, "mango"));
		
		System.out.println(fruits);
		
		//remove()
		
		fruits.remove(1);
		
		System.out.println(fruits);
		
		//size
		
		System.out.println(fruits.size());
		
		//contains
		
		System.out.println(fruits.contains("apple"));
		
		//isEmpty
		
		System.out.println(fruits.isEmpty());
		
		//clear()
		
		fruits.clear();
		System.out.println(fruits);
		
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		//sort
		
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
		
	}

}
