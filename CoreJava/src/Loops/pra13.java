package Loops;

import java.util.Scanner;

public class pra13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++){
				System.out.print(i*j+" ");
			}
			System.out.println("  ");
		}
	}

}
