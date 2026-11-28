package ExceptionsHandling;

import java.util.Scanner;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		System.out.println("Input is"+n);
		}
		catch (Exception e) {
	System.out.println("invalid iput");
		}
		
System.out.println("thankyou");
	}

}
