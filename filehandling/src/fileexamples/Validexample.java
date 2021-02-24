package fileexamples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Validexample {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("a.txt");
		f.mkdir();
		if(f.exists())
		{
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getFreeSpace());
			
			
		}
	}

}
