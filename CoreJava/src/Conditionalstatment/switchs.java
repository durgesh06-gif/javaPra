package Conditionalstatment;

import java.util.Scanner;

public class switchs {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    
    System.out.println("Enter three year num: ");
    int n = s.nextInt();
    
    switch (n) {
    case 1:
    	System.out.println("jan");
    	break;
    case 2:
    	System.out.println("feb");
    	break;
    case 3:
    	System.out.println("march");
    	break;
    case 4:
    	System.out.println("april");
    	break;
    case 5:
    	System.out.println("may");
    	break;
    case 6:
    	System.out.println("june");
    	break;
    }
}
}
