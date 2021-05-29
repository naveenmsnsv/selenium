package mydatabase2;

public class Employee 
{
	int eno;
	String ename;
	float sal;
	public Employee()
	{
		System.out.println("i am default constructor...");
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.sal);
	
	}
	public Employee(int eno)
	{
		this();
		this.eno = eno;
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.sal);
	
	}

	public Employee(int eno, String ename)
	{
		this(1234);
		this.eno = eno;
		this.ename = ename;
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.sal);
	
	}
		public Employee(int eno, String ename, float sal) 
	{
		this(1234,"vinodkumar");
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.sal);
	
	}
	public static void main(String[] args) 
	{
				
		Employee e4 = new Employee(1234,"vinod kumar",12.98f);
		
	}

}
