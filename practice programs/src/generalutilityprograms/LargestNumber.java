package generalutilityprograms;

import java.util.Scanner;

public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int[] arr;
		int max = Integer.MIN_VALUE, 
		secondMax = Integer.MIN_VALUE;
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = ip.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) 
		{
			System.out.print("Enter array[" + i + "]: ");
			arr[i] = ip.nextInt();
			if (arr[i] >= max) 
			{
				secondMax = max;
				max = arr[i];
			} else if (secondMax >= arr[i])
				secondMax = arr[i];

		}
		System.out.println("The largest element in the array is " + max);
		System.out.println("The Second largest element in the array is " + secondMax);
		ip.close();

		}
	}
