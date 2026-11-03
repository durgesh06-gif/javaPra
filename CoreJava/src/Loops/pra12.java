package Loops;

import java.util.Scanner;

public class pra12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		int a=0;
		int b=1;
		
		for(int i=1;i<=n;i++) {
			int c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}

}
