package Arrays;

import java.util.Scanner;

public class pra11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int tick[][]= {
				{0,0,1},{0,1,0},{1,0,0},
		};
		
         int pass=0;
		
		for (int i=0;i<tick.length;i++) {
			for(int j=0;j<tick[i].length;j++) {
				if(tick[i][j]==0) {
					System.out.print("O"+" ");
								}
				else {
					System.out.print("X"+" ");
				}
			}
			System.out.println();
		}
		System.out.println("===============");
		
		System.out.println("Enter X OR O");
		char value=s.next().charAt(0);
		if(value<pass) {
			for(int i=0;i<value;i++) {
				System.out.println("Enter X OR O");
				pass++;	
				
			}
		

		}
		System.out.println("======================");

		for (int i=0;i<tick.length;i++) {
			for(int j=0;j<tick[i].length;j++) {
				if(tick[i][j]==0) {
					System.out.print("O"+" ");
								}
				else {
					System.out.print("X"+" ");
				}
			}
	}

	}
}
