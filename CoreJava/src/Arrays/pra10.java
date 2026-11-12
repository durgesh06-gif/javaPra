package Arrays;

import java.util.Scanner;

public class pra10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int seats[][]= {
				{0,0},
				{1,0},
				{0,0},
				{1,1}
		};
		
		int availableSeats=0;
		
		for(int i=0;i<seats.length;i++)
		{
			for(int j=0;j<seats[i].length;j++)
			{
				if(seats[i][j]==0)
				{
					System.out.print("["+i+"]["+j+"]    ");
					availableSeats++;
				}
				else
				{
					System.out.print("[XXXX]    ");
					
				}
			}
			
			System.out.println();
		}
		
		
		System.out.println("Available Seats:"+availableSeats);
		
		System.out.println("======================");
		
		System.out.println("Enter how many seats you want to book??");
		int seatsToBook = sc.nextInt();
		
		if(seatsToBook>availableSeats)
		{
			System.out.println
			("Available seats are only "+availableSeats+" Enter value between 1 to "+availableSeats);
		}
		else
		{
			for(int i=1;i<=seatsToBook;i++)
			{
				System.out.println("Enter row and col to book");
				int row = sc.nextInt();
				int col = sc.nextInt();
				
				if(seats[row][col]==1)
				{
					System.out.println("It is booked");
					i--;
					
				}
				else
				{
					seats[row][col]=1;
				}
				
				
			}
		}
		
		System.out.println("======================");
		
		
		for(int i=0;i<seats.length;i++)
		{
			for(int j=0;j<seats[i].length;j++)
			{
				if(seats[i][j]==0)
				{
					System.out.print("["+i+"]["+j+"]    ");
					availableSeats++;
				}
				else
				{
					System.out.print("[****]    ");
					
				}
			}
			
			System.out.println();
		}
		
		
	}

}