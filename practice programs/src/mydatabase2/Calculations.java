package mydatabase2;

public class Calculations 
{
	int a,b,result;
	
	
	public Calculations(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		result= a + b;
		System.out.println("Add of a&b is:" + result);
	}
	public void sub()
	
	{
		result=a-b;
		System.out.println("Sub of a&b is:" + result);
	}
	public static void main(String[] args) 
	{
		Class1 c=new Class1(10,20);
		c.add();
		c.sub();
		
		
	
	}

}
