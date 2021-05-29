package mydatabase;

public class B extends A
{
	public void m2()
	{
		System.out.println("iam in m2 classB");
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		B b=new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
	}

}
