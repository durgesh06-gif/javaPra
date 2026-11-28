package ExceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class par6 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fs = new FileInputStream("xyz.jpg");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}

	}

}
