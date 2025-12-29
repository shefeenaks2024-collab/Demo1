package exceptn;

public class Thrw {
	
	
	public static void validate(int age) 
	{
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
		}
		else
		{
			System.out.println("person is eligible for vote");
		}
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		validate(15);

	}

}
