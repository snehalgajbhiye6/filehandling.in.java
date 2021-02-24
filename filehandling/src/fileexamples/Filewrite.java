package fileexamples;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args)  
	{
    
	try (FileWriter fw = new FileWriter("b.txt");){

	       String s="this is java lecture";
	       fw.write(s);
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
       
	}

}
