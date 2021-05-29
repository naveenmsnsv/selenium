package generalutilityprograms;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = new String("vinodkumarreddy");
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.codePointAt(6));
		
		String s2=new String("Vinodkumarreddy");
		System.out.println(s2.compareTo(s1));
		System.out.println(s2.isEmpty());
		System.out.println(s2.contentEquals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.contentEquals(s1));
		System.out.println(s2.endsWith(s1));
		System.out.println(s2.hashCode());
		System.out.println(s2.indexOf(2));
		System.out.println(s2.substring(5, 10));
		System.out.println(s2.contains(s1));
		
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println(s1);
		
		String s3=new String("  vinodkumar");
		System.out.println(s3.trim());
		System.out.println(s3.replace('v', 'B'));
		
		String s4=new String("vinod kumar reddy");
		String[] str = s4.split(" ");

		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		

	}

}
