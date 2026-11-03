package IfElse;

import java.util.Scanner;

public class pra2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b) {
			System.out.println("greate"+a);
		}
		else if(b>a){
			System.out.println("b is greate"+b);
		}
		
		else {
			System.out.println("equal");
		}
	}

}
