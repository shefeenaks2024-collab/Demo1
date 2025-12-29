package exceptn;

public class Class2exce {

	public static void main(String[] args) {
		
		try {
		int data=8/0;
		System.out.println(data);
		}
		finally {
			System.out.println("Executing finally block");
		}
		
		
		System.out.println("Rest of the code");
		
		System.out.println("Bye");

	}

}
