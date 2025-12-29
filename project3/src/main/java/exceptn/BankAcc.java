package exceptn;

public class BankAcc {

	int amt;
	
	public  void  bankamount(int acc)
	{
		this.amt=acc;
		System.out.println("Bank Amount is "+amt);
	}
	
	
	public void withdraw(int withdamt) throws InsufficientException
	{
		int bal=amt-withdamt;
		
		if(bal<0)
		{
			throw new InsufficientException("Withdrawal failed,Insufficient Balance");
			
		}
		else
		{
			
			System.out.println("Balance remaining is "+bal);
		}
	}
}
