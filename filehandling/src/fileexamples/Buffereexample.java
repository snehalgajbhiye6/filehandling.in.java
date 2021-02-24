package fileexamples;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffereexample {

	public static void main(String[] args) throws IOException
	{
		/**try {
			BufferedReader br=new BufferedReader(new FileReader("a.txt"));
			System.out.println(br.read());
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			
		}*/
		
		String s="lecture";
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
)
		{
			bw.write(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
