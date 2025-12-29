package exceptn;

public class Egclass1excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Before ");
		try
		{
		int num=4/0;
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("Error");
		}
		System.out.println("rest");
		

	}

}
