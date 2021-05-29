package mydatabase;
class Parent
{
	public void workhard()
	{
		System.out.println("Parent: wakeup early,goto college....");
	}
	public void care()
	{
		System.out.println("atmost care...");
	}
}
public class Child extends Parent
{
	public void workhard()
	{
		System.out.println("Child: wakeup any time,goto Bar....");
	}
	public void love()
	{
		System.out.println("iam in love...");
	}
	public static void main(String[] args) 
	{
		Parent obj=new Parent();
		obj.care();
		obj.workhard();
		
		Child obj1=new Child ();
		obj1.workhard();
		obj1.care();
		obj1.love();
	}
}
