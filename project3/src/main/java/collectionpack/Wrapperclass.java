package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>arr=new ArrayList<Integer>();
arr.add(1);
arr.add(2);
arr.add(3);
System.out.println(arr);
	
	
	
	
	Iterator<Integer> it = arr.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
	

