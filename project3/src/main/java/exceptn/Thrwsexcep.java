package exceptn;

public class Thrwsexcep {
	
	public static void validate1(int age) throws ArithmeticException,Exception
	{
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
		}
		else
		{
			System.out.println("person is eligible for vote");
		}
	}

	public static void main(String[] args) throws ArithmeticException, Exception  {
		// TODO Auto-generated method stub
validate1(13);
	}

}
