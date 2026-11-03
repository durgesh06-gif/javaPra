package Loops;

import java.util.Scanner;

public class pra15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ip = 5;
		int sum = 0;
		
		System.out.println("Enter " + ip + " positive numbers:");
		
		for (int i = 1; i <= ip; i++) {
			System.out.print("Number " + i + ": ");
			int num = s.nextInt();
			
			while (num <= 0) {
				System.out.println("Invalid input! Please enter a positive number (greater than 0).");
				System.out.print("Number " + i + ": ");
				num = s.nextInt();
			}
			
			sum += num;           
		}
		
		double average = sum / (double) ip;
		
		System.out.println("\nResults:");
		System.out.println("Sum is : " + sum);
		System.out.println("The average is: " + average);
		
		s.close();
	}
}
