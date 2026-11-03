package Loops;

import java.util.Scanner;

public class pra1 {

	public static void main(String[] args) {

		//While loops
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int a=s.nextInt();
		int b=s.nextInt();
	
		while(a<=b) {
			System.out.println(a);
			a++;
		}
	}

}
