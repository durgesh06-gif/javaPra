package Loops;

import java.util.Scanner;

public class pra23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int prim=0;
		int ntpr=0;
		
		for(int j=0;j<=5;j++) {
			System.out.println("Enter a Number");
			int n=s.nextInt();
			
	         boolean prime=true;

	         for (int i = 2; i <=(n/2); i++) {
	             if (n%i==0) {
	                 prime=false;
	                 prim++;
	                 break;
	                 
	             }
	         }
	 if(prime && n!=1){
	     System.out.println(n+ " is prime");
	     ntpr++;
	         }
	 else {
	     System.out.println(n+ " not prime");
	 }
		}
		System.out.println("Prime " + prim);
		System.out.println("not prime" + ntpr);

	}

}
