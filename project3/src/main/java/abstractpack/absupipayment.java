package abstractpack;

public class absupipayment extends AbstractPayment {
	
	
	double amt;
	double  makePayment(double amount)
	{
		this.amt=amount;
		return amount;
		
	}
	
	void upipayment()
	{
		{
			System.out.println("upi  payment of Rs " + amt +"is processed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		absupipayment ab2=new absupipayment();
		ab2.makePayment(100.89);
		ab2.paymentsuccess();
		ab2.upipayment();
		
		
		Abscreditcard ab1=new Abscreditcard();
		ab1.makePayment(200.67);
		ab1.creditcard();
	}

}
