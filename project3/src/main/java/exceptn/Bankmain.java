package exceptn;

public class Bankmain extends BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankmain b=new Bankmain();
		b.bankamount(1000);
		try {
			b.withdraw(2000);
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Transaction completed");
		}
	}

}
//3 files created  1.Insufficient Eception,2.BankAcc,3.Bankmain for the question which tasleena gives 