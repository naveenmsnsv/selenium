package mydatabase;

public class VariableTypes 
{
	//primitive variables
	int x = 100; // instance (or) instance-Global variable (or) non-static variable
	static String cname = "Global"; //static or static global variable
	public void m1()
	{
		int y = 200; // local variable
		System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	public static void m2()
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);		
	}
	
	public static void main(String[] args) 
	{
		// reference variable
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		
	}

}
