package Loops;

import java.util.Scanner;

public class pra22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int pos=0;
		int neg=0;
		int zero=0;
		
		for(int i=0;i<=5;i++) {
			System.out.println("Enter a Number");
			int n=s.nextInt();
			
			if(n>0) {
				System.out.println("Positive");
				pos++;
			}
			else if(n<0) {
				System.out.println("Negative");
				neg++;
			}		
			else {
				System.out.println("Zero");
				zero++;
			}
		}
		System.out.println("Positive " + pos);
		System.out.println("Negative " + neg);
		System.out.println("Zero " + zero);

	}

}
