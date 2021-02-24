package fileexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyexample {

	public static void main(String[] args) throws IOException
	{
		
			BufferedReader br=new BufferedReader(new FileReader("e.txt"));
			String s1=br.readLine();
			br.close();
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("copy.txt"));
			bw.write(s1);
			bw.close();
		
	}

}
