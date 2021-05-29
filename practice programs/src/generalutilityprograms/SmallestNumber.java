package generalutilityprograms;

import java.util.Scanner;

public class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int[] a;
		int min = Integer.MAX_VALUE;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = ip.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) 
		{
			System.out.print("Enter array[" + i + "]: ");
			a[i] = ip.nextInt();
			if (a[i] <= min)
				min = a[i];
		}
		System.out.println("The largest element in the array is " + min);
		ip.close();	

	}

}
