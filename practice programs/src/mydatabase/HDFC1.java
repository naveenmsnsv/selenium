package mydatabase;

public class HDFC1 implements Rbi
{
	public static void main(String[] args) 
	{
		HDFC1 h = new HDFC1();
		h.deposit();
		h.withdrawl();
		
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam overriden withdrawl in HDFC1 ");
		
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("iam overriden DEPOSIT in HDFC1 ");
		
	}

}
