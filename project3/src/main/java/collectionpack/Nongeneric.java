package collectionpack;

import java.util.ArrayList;

public class Nongeneric {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("hello");
		list.add(100);
		list.add(9.7F);
		String s=(String)list.get(0);
		int num=(int)list.get(1);
		float re=(float)list.get(2);
		System.out.println(list);
				
		

	}

}
