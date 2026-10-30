package Conditionalstatment;

import java.util.Scanner;

public class Exp8 {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
		
		System.out.println("enter an num");
		int n=s.nextInt();
		
		if(n<0) {
			System.out.println("negative");
		}
		else if(n<=0) {
			System.out.println("new");
		}
		else {
			System.out.println("positive");
		}
	}

}
