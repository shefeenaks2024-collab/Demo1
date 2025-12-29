package abstractpack;

public class Abscreditcard extends AbstractPayment{
	
	
double amt;
	double  makePayment(double amount)
	{
		this.amt=amount;
		return amount;
		
	}
	
	void creditcard()
	{
		System.out.println("Credit card payment of Rs " + amt +"is processed");
	}

}
