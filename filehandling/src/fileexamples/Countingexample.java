package fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;

public class Countingexample {

	public static void main(String[] args)
	{
		BufferedReader br=null;
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		
		try
		{
			br=new BufferedReader(new FileReader("e.txt"));
			String cline=br.readLine();
			while(cline!=null)
			{
				lineCount++;
				
				String[]word=cline.split(" ");
				wordCount=wordCount+word.length;
				
				
				for(String s:word)
				{
					charCount=charCount+word.length;
					
				}
				cline=br.readLine();	
				
				System.out.println("words are: "+wordCount);
				System.out.println("charcter are: "+charCount);

				System.out.println("line are: "+lineCount);
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		  
		}
	}


