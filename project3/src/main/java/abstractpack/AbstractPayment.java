package abstractpack;

abstract class AbstractPayment {
	
	abstract double makePayment(double amount);
	
	void paymentsuccess()
	{
		System.out.println("Payment completed successfully");
	}

}
