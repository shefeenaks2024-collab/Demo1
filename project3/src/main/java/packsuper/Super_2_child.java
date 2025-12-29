package packsuper;


 class parent{
	int num=100;
}

public class Super_2_child extends parent{
	
	
	int num=200;
	void show()
	{
		System.out.println("childclass"+num);
		System.out.println("parentclass"+super.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_2_child obj=new Super_2_child();
		obj.show();
	}

}
