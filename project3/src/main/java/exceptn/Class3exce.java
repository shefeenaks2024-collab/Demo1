package exceptn;

public class Class3exce {

	public static void main(String[] args) {
		try {
			int data=8/0;
			System.out.println(data);
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			finally {
				System.out.println("Executing finally block");
			}
			
			
			System.out.println("Rest of the code");
			
			System.out.println("Bye");

	}

}
