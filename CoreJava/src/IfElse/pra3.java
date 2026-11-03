package IfElse;

import java.util.Scanner;
//Finding a leap years
public class pra3 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a num");
int a=s.nextInt();

if(a%400==0) {
	System.out.println("it a leap year");
}
else if(a%100==0){
	System.out.println("Not a leap year");
}
else if(a%4==0)
	System.out.println("It a leap year");
	}


}
