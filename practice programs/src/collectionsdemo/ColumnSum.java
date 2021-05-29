package collectionsdemo;

public class ColumnSum
{

	public static void main(String[] args) 
	{
				int[][] arr = { { 1, 2, 3 ,}, { 3, 8,  0 }, { 9,  7, 1 } };
				System.out.println("Array is: ");
				display(arr);
				int sum = 0;
				for (int i = 0; i < arr[0].length; i++)
				{
					for (int j = 0; j < arr.length; j++) 
					{
						sum = sum + arr[j][i];
					}
					System.out.println("Sum of " + (i + 1) + " column: " + sum);
					sum = 0;
				}
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


