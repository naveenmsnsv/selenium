package collectionsdemo;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object>a = new ArrayList<Object>();
		a.add(10);
		a.add("vinod");
		a.add(12.2f);
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println( a.indexOf("vinod"));
		
		a.add(60);
		System.out.println(a);
		a.add(1, "vinod");
		System.out.println(a);
		a.set(2, "kumar");
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("kumar"));
		System.out.println(a.subList(2, 7));
		System.out.println(a.remove(3));
		a.remove(1);
		System.out.println(a);

	}

}
