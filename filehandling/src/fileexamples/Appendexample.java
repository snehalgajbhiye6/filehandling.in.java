package fileexamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appendexample {

	public static void main(String[] args) throws IOException
	{
		FileWriter f=null;
		BufferedWriter b=null;
		PrintWriter p=null;
		try
		{
			f=new FileWriter("copy.txt",true);
			b=new BufferedWriter(f);
			p=new PrintWriter(b);
			
			p.println(" ");
			p.println("jarvi");
			p.println("soft");
			
			
			b.close();
			p.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
