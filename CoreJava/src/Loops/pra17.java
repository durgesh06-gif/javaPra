package Loops;
import java.util.Scanner;

public class pra17{
    //Finding prime number
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
         int n=s.nextInt();

         boolean prime=true;

        for (int i = 2; i <=(n/2); i++) {
            if (n%i==0) {
                prime=false;
                break;
            }
        }
if(prime && n!=1){
    System.out.println(n+ " is prime");
        }
else {
    System.out.println(n+ " not prime");
}
    }
}
