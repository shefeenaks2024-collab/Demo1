package pack2;

public class Car {
	
	private String name="WAgnor";
	private void printcname()
	{
		System.out.println("Maruti");
	}
	

	public static void main(String[] args) {
		
		Car c=new Car();
		c.printcname();
		System.out.println(c.name);
	}

}
