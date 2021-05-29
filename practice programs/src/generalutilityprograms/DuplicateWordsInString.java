package generalutilityprograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString 
{

	public static void main(String[] args) 
	{
		 
        Object inputString;
        String [] words = ((duplicateWords) inputString). Split (" ");
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String word : words)
        {
            if(wordCount.containsKey(word.toLowerCase()))
            {
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            else
            {
                
                wordCount.put(word.toLowerCase(), 1);
            }
        }
 
        Set<String> wordsInString = wordCount.keySet();
 
        for (String word : wordsInString)
        {
 
            if(wordCount.get(word) > 1)
            {
         
                System.out.println(word+" : "+wordCount.get(word));
            }
        }
    }
 
    public static void main1(String[] args)
    {
        duplicateWords("Bread butter and bread");
 
        duplicateWords("Java is java again java");
 
        duplicateWords("Super Man Bat Man Spider Man");
    }

	private static void duplicateWords(String string) 
	{
		
		
	}

	


	}



