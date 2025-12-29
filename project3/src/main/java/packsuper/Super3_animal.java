package packsuper;

public class Super3_animal extends Super3_sound{
	
	
	void sound()
	{
		System.out.println("All Animal make sound ");
	}
	
	void display()
	{
		super.sound();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super3_animal s3=new Super3_animal();
		s3.sound();
		s3.display();
	}

}
