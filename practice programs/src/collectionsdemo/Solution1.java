package collectionsdemo;
//Insert all the collections elements to the specified position in ArrayList
import java.util.ArrayList;

public class Solution1 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(6);
		a1.add(4);
		a1.add(8);
		a1.add(3);
		a1.add(9);
		a1.add(1);
		
		ArrayList<Object> a2=new ArrayList<>();
		a2.add(23);
		a2.add(65);
		a2.add(8);
		a2.add(88);
		a2.add(343);
		
		System.out.println("currently arraylist 1 is: ");
		System.out.println(a1);
		System.out.println("currently arraylist 2 is: ");
		System.out.println(a2);
		a1.addAll(2, a2);
		System.out.println("currently arraylist 1 is: ");
		System.out.println(a1);
		System.out.println("currently arraylist 2 is: ");
		System.out.println(a2);
	
	}

}
