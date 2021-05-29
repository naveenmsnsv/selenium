package mydatabase;

public interface Rbi 
{
	int x=100;
	public void withdrawl();
	public void deposit();
	public static void main(String[] args) 
	{
		//Rbi r==new Rbi();
		 Rbi i;
		 i=new HDFC1();
		 i.deposit();
		 i.withdrawl();
		 i=new ICICI1();
		 i.deposit();
		 i.withdrawl();
	}
}
