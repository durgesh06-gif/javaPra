package ExceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filehandling {

	public static void readmain() throws FileNotFoundException {
		new FileInputStream("xyz.png");
	}
}
