package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class MethodHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>fruits=new HashSet<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
	
		
		Set<String>morefruits=new HashSet<>();
		
		
		
		morefruits.add("orange");
		morefruits.add("kiwi");
		morefruits.add("litchi");
		
		fruits.addAll(morefruits);
		
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		fruits.retainAll(morefruits);
		System.out.println(fruits);
	}

}
