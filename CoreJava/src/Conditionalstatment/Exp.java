package Conditionalstatment;

import java.util.Scanner;

public class Exp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter an year");
		int n = s.nextInt();
		
		System.out.println("enter an salary");
		double salary = s.nextDouble();

		double pct;

		if (n > 10) {
			pct = 0.20;
		} else if (n >= 6) {
			pct = 0.15;
		} else if (n >= 3) {
			pct = 0.10;
		} else {
			pct = 0.05;
		}

		System.out.println("Bonus: " + (salary * pct));
		System.out.println("Total Salary: " + (salary + (salary * pct)));
		
	}
}
