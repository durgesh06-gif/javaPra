package Arrays;

import java.util.Scanner;

public class pra6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		String flight[]= {"indigo","spicejet","vistara"};
		int ablset[]= {12,7,4};
		
		System.out.println("enter the set u want to book");
		int set=s.nextInt();
		
		for (int i=0;i<flight.length;i++) {
			if(ablset[i]>=set)
			System.out.println(flight[i]);
			System.out.println(ablset[i]);
		}
		
	}

}
