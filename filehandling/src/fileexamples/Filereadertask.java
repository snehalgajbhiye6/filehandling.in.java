package fileexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereadertask {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
        File f=new File("e.txt");	
        
        if(f.exists())
        {
        	FileReader r=new FileReader(f);
        	
        	int i;
        	while((i=r.read())!=-1)
        	{
        		char c=(char)i;
        		System.out.print(c);
        	}
        }
    }
}
