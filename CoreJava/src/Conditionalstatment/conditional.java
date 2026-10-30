package Conditionalstatment;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {

		int bal=1000;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter an amount");
		int amout=s.nextInt();
		
		if(amout>bal) {
			System.out.println("inst bal");
		}
		else {
			bal-=amout;
			System.out.println(bal);
		}
		
	}

}
