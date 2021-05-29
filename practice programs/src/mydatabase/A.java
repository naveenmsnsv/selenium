package mydatabase;
 public class A 
{
	   int x=100;
	 public void m1()
	{
		System.out.println("iam in m1 classA");
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
