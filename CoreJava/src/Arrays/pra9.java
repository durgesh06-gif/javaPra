 package Arrays;

import java.util.Scanner;

public class pra9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int seats[][] = { {0, 1}, {1, 1}, {0, 0}, {1, 0} };
        int abl = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.println("Available");
                    abl++;
                } else {
                    System.out.println("Not available XXXX");
                }
            }
        }

        System.out.println("==============");
        System.out.println("Total available seats: " + abl);
        System.out.println("==============");

        System.out.println("Enter number of seats to book:");
        int n = s.nextInt();

        if (n <= abl && n > 0) {
            int booked = 0;
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j] == 0 && booked < n) {
                        seats[i][j] = 1; 
                        booked++;
                        abl--;
                        System.out.println("Seat [" + i + "][" + j + "] booked successfully.");
                    }
                }
            }
            System.out.println("Remaining available seats: " + abl);
        } else {
            System.out.println("Please enter a valid number of seats (1 to " + abl + ").");
        }
    }
}
