package Conditionalstatment;

import java.util.Scanner;

public class Exp7 {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
		
		System.out.println("enter an num");
		int n=s.nextInt();
		
		if(n>=0 && n<=35) {
			System.out.println("C Grade");
		}
		else if(n>=36 && n<=74) {
			System.out.println("B  Grade");
		}
		else if(n>=75 && n<=100) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("plz enter vaild marks");
		}
	}

}
