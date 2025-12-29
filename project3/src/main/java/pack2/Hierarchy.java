package pack2;

class Three{
	void threeshow()
	{
		System.out.println("Three");
	}
}

class Two extends Three {
	void Twoshow()
	{
		System.out.println("Two");
	}
}
public class Hierarchy extends Three {
	
	void Fourshow()
	{
		System.out.println("Four");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchy h=new Hierarchy();
		h.Fourshow();
		h.threeshow();
		Two t=new Two();
		t.Twoshow();
		t.threeshow();
	}

}
