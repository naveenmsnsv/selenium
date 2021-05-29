package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAnArrayListInDescendingOrder 
{

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<>(Arrays.asList("India", "Pakistan", "Nepal", "Bangladesh","Afganistan"));
		System.out.println("By default the arraylist is: ");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After sorting in ascending order: ");
		System.out.println(a1);
		System.out.println("After sorting in descending order: ");
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
		
		

	}

}
