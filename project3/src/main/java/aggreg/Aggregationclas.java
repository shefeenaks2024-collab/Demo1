package aggreg;

public class Aggregationclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Authorz au=new Authorz("basheer",250);
		Book bk=new Book("bookname-ABC",200,au);
		System.out.println(bk.name);
		System.out.println(bk.price);
		System.out.println(bk.auth.authname);
		System.out.println(bk.auth.age);
		
		//to print new book details
		
		Book bk1=new Book("Kanav",100,au);
		System.out.println(bk1.name);
		System.out.println(bk1.price);
		System.out.println(bk1.auth.authname);
		System.out.println(bk1.auth.age);
		
		//To  print new author details 
		Authorz au1=new Authorz("MT",270);
		Book bk2=new Book("Kanav",100,au1);
		System.out.println(bk2.name);
		System.out.println(bk2.price);
		System.out.println(bk2.auth.authname);
		System.out.println(bk2.auth.age);

	}

}
