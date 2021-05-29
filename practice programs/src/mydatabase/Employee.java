package mydatabase;

public class Employee 
{
	int eno;
	String ename;

	public Employee ()
	{
		System.out.println("iam in default constructor....");
	}
	public Employee(int eno, String ename) 
	{
		this.eno=eno;
		this.ename=ename;
	}
	
	public Employee(int eno) 
	{
		super();
		this.eno = eno;
	}
	public static void main(String[] args)
	{
		Employee e1 =new Employee(1745,"ravilella");
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(1744,"vinodkumar");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(1748);
		System.out.println(e3.eno);
		
	}

}
