package Conditionalstatment;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		System.out.println("enter an num");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
