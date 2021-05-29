package mydatabase;

public class ICICI1 implements Rbi
{

	public static void main(String[] args) 
	{
		ICICI1 i=new ICICI1();
		i.deposit();
		i.withdrawl();
		
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam overriden withdrawl in ICICI1 ");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overriden withdrawl in ICICI1 ");
		
	}

}
