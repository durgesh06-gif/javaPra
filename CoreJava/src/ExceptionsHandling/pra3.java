package ExceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number");
			int n=s.nextInt();			
			int n1=s.nextInt();
			
			System.out.println(n/n1);
			}
		catch (InputMismatchException e) {
			System.out.println("invalid iput");
				}
		catch (ArithmeticException e) {
			System.out.println("cant div by zero");
				}
				
		System.out.println("thankyou");
			

	}

}

