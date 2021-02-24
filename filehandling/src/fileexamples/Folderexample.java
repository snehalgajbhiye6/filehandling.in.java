package fileexamples;

import java.io.File;
import java.io.IOException;

public class Folderexample {

	public static void main(String[] args) 
	{
	    File folder=new File("main");
	    folder.mkdir();
	    try
	    {
	    	if(folder.exists())
	    	{
	    		File file=new File("C:\\Users\\acer\\Desktop\\jarvisoft\\filehandling\\main\\file.txt");
	    		file.createNewFile();
	    		
	    	}
	    	else
	    	{
	    		System.out.println("file not found");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	
	}
}


