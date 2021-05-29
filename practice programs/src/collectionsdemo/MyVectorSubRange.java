package collectionsdemo;
import java.util.List;
//Program: How to get sub list from vector?
import java.util.Vector;

public class MyVectorSubRange 
{

	public static void main(String[] args) 
	{
		Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("vinod");
        vct.add("indu");
        vct.add("vamsi");
        vct.add("kumar");
        vct.add("naveen");
        System.out.println("Actual vector:"+vct);
        List<String> list = vct.subList(2, 4);
        System.out.println("Sub List: "+list);

	}

}
