package Loops;
import java.math.BigInteger;
import java.util.Scanner;

public class pra18 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        BigInteger n = s.nextBigInteger();

        if (n.isProbablePrime(100)){
            System.out.println(n + " is prime");
        }
        else {
            System.out.println(n+ " not prime");
        }
    }

}
