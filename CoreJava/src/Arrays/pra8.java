package Arrays;

import java.util.Scanner;

public class pra8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int seats[][]= {
				{0,1},{1,1},{0,0},{1,0}
		};
		int abl=0;	
		
		for(int i=0;i<seats.length;i++) {
			for(int j=0;j<seats[i].length;j++) {
				if(seats[i][j]==0) {
					System.out.println("available");
					abl++;
				}
					else {
						System.out.println("Not available XXXX");
					}
			
				}
			}
		System.out.println("==============");
		System.out.println(abl);
		System.out.println("==============");

		System.out.println("Enter a seats Number");
		int n=s.nextInt();
		if(n>abl)
		{
			for(int i=0;i<=n;i++) {
				System.out.println("Enter a seats Number");
				int row=s.nextInt();
				int col=s.nextInt();

			}
		}
		else {
			System.out.println("plz enter available seats"+abl);
		}

		}
	}


