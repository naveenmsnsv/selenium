package pack1;



public class Class1 
{
int a,b,result;
	
	
	public Class1(int a, int b) 
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
		
		Class1 c2=new Class1(100,200);
		c2.add();
		c2.sub();
	
	}

}
