package exceptn;

import java.rmi.AlreadyBoundException;

public class Multiplecatch {

	public static void main(String[] args) {
		
		try {
			
		
		int ar[]=new int[5];
		ar[8]=30/0;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
System.out.println("Rest");
	}

}
