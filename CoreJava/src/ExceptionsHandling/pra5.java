package ExceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a[]= {12,56,67,90};
		try {
		System.out.println("Enter the index of the array: ");
		int index = sc.nextInt();
		
		System.out.println("Value at index "+index+" is "+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("enter array which index is present");
		}
		catch (NullPointerException e) {
			System.out.println("invalid iput");
				}
		finally {
			sc.close();
			System.out.println("closed");
		}
		
		
	}

}
