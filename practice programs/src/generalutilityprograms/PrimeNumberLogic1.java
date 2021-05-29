package generalutilityprograms;

import java.util.Scanner;

public class PrimeNumberLogic1 
{

	public static void main(String[] args)
	{
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;  
			}
		}
		if(count==2)
		{
			System.out.println(n+"is a prime Number");
		}
		else
		{
			System.out.println(n+"is not a prime Number");
		}

	}

}
