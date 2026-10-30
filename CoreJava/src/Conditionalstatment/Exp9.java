package Conditionalstatment;

import java.util.Scanner;

public class Exp9 {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
		
		System.out.println("enter an char");
		char c=s.next().charAt(0);
					
	if(c>=65 && c<=90) {
		System.out.println("IT IS Uppercase");
	}
	else if(c>=97 && c<=122) {
		System.out.println("It Is lowercase");
	}
	else {
		System.out.println("Invalid output");
	}
	}

}
