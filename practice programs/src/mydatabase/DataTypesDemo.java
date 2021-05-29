package mydatabase;

public class DataTypesDemo 
{
	byte b = 127; //1 byte
	short s = -32768; // 2 bytes
	int i = 2147483647; // 4 bytes
	long  l = 2147483647; // 8 bytes
	
	float f = 12.34F; // 4 bytes
	double d = 34.34; // 8 bytes
	
	boolean bb = true;
	char ch = 'a'; // 2 bytes
	
	String str = "vinodkumarreddy";

	public static void main(String[] args) 
	{
		DataTypesDemo obj = new DataTypesDemo();
		System.out.println("Byte : "+ obj.b);
		System.out.println("Short : "+ obj.s);
		System.out.println("Int : "+ obj.i);
		System.out.println("Long : "+ obj.l);
		
		System.out.println("Float : "+ obj.f);
		System.out.println("Double : "+ obj.d);
		
		System.out.println("Boolean : "+ obj.bb);
		System.out.println("Char : "+ obj.ch);
		
		System.out.println("String : "+ obj.str);
		}
	}
