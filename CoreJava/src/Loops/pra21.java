package Loops;

import java.util.Scanner;

public class pra21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		
		char c;
		
		do {
			System.out.println("Enter a  1 Number");
			int a=s.nextInt();
			
			System.out.println("Enter a  2 Number");
			int b=s.nextInt();
			
		    System.out.println(a+b);
		    
			System.out.println(" DO u want to Continue enter y/n");
		     c=s.next().charAt(0);
		}
		while(c=='y');
	}
}
