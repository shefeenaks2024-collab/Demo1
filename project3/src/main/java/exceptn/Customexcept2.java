package exceptn;

public class Customexcept2 {

	public static void validate1(int age) throws Customexcep 
	{
		if(age<18)
		{
			throw new Customexcep("Invalid age");
		}
		else
		{
			System.out.println("person is eligible for vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validate1(13);
} catch (Customexcep e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
