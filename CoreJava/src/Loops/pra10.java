package Loops;

public class pra10{
	//printing alpha 
	
    public static void main(String[] args) {
        System.out.println("Lowercase alphabets:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        
        System.out.println("\n"); 

        System.out.println("Uppercase alphabets:");
        for (char ch = 65; ch <= 90; ch++) {
            System.out.print(ch + " ");
        }
    }
}
