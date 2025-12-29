package abstractpack;

public class Abscircle extends AbsGraphicObj {
	
	
	void showshape()
	{
		System.out.println("Implementing functionality of Abstract method in the parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abscircle ab=new Abscircle();
		ab.showshape();
		ab.display();
	}

}
