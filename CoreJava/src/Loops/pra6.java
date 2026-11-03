package Loops;

import java.util.Scanner;

public class pra6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				//Reversing number palindrom
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
				int i=s.nextInt();
				int o=i;
				int r=0;
				
				while(i>0) {
					int rm=i%10;
					r=r*10+rm;
					i=i/10;
				}
				if(o==i) {
				System.out.println(  "   palindrome ");
				}
				else {
					System.out.println(  " not palindrome ");
				}
			}
	
}

