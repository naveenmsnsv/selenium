package mydatabase2;

public class EmployeeChild extends Employee  
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(1234,"vinodkumar",12.98f);
		this.city = city;
		System.out.println(this.city);
	}

	public static void main(String[] args) 
	{
		EmployeeChild ec=new EmployeeChild("Hyderabad");

	}

}
