package fileexamples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader 
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("a.txt");
		if(f.exists())
        {
			System.out.println(f.canExecute());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getAbsolutePath());
			
		FileReader fr=new FileReader(f);
		int i;
		while((i=fr.read())!=-1)
		{
			char c=(char)i;
			System.out.print(c);
		}
        }
		
		else {
			System.out.println("file not found");
		}
	}
}
