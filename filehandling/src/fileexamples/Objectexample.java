package fileexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objectexample {

	public static void main(String[] args) {

		Emplyoeee e = new Emplyoeee();
		e.setId(101);
		e.setName("Snehal");

		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("d.txt"));) {
			o.writeObject(e);
			System.out.println("Object write");
		} catch (Exception a) {
			System.out.println(a);
		}

		/*try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("d.txt"));) {
			Emplyoeee ee = (Emplyoeee) oi.readObject();
			System.out.println(ee);
		} catch (Exception n) {
			n.printStackTrace();
			System.out.println("Object read");
		}*/

	}

}
