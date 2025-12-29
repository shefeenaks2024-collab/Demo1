package collectionpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>fruits=new HashSet<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("apple");
		
		System.out.println(fruits);
	}

}
