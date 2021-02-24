package fileexamples;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;

public class FileInOutexample {

	public static void main(String[] args) 
	{
		/*try (FileInputStream fi=new FileInputStream("c.txt");){
			
		    int i;
		    while((i=fi.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		} catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}*/
		
		
		try(			FileOutputStream fo=new FileOutputStream("c.txt");
) {
			
				byte b=67;
				fo.write(b);
			
           }
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
		}
				
				
	}

}
