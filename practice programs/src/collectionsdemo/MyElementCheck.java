package collectionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//m: How to find does vector contains all list elements or not?
public class MyElementCheck 
{

	public static void main(String[] args) 
	{
		Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
	}
}

