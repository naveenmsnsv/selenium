package collectionsdemo;

public class Diagonal 
{

	public static void main(String[] args) 
	{
		int[][] arr = { { 1, 2, 3, 4, 3}, { 1, 2, 3, 2, 7 }, { 9, 2, 5, 9, 2 }, { 1, 3, 5, 7, 6 }, { 6, 7, 8, 1, 0 } };
		System.out.println("Array is: ");
		display(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[0].length; j++)
			{
				if (i + j == arr.length - 1)
					sum = sum + arr[i][j];
			}
		}
		System.out.println("Sum of the minor diagonal is " + sum);
	}

	private static void display(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++) 
			
			 {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
