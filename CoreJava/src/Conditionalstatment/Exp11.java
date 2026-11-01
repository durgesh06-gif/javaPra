package Conditionalstatment;

import java.util.Scanner;

public class Exp11 {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
		
		System.out.println("enter an char");
		char c=s.next().charAt(0);
		
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
			default:
			System.out.println("consonant");	

		}
	}

}
