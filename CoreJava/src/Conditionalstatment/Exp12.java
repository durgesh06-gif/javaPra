package Conditionalstatment;

import java.util.Scanner;

public class Exp12 {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
		
		System.out.println("enter an num");
		int a= s.nextInt();
		int b= s.nextInt();
		
		System.out.println("+ , - , * , /");
		char c=s.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println("add is" +(a+b));
			break;
		case '-':
			System.out.println("sub is" +(a-b));
			break;
		case '*':
			System.out.println("multly is" +(a*b));
			break;
		case '/':
			System.out.println("div is" +(a/b));
			break;
			default:
			{
				System.out.println("invauld input");
			}
		}
	}

}
