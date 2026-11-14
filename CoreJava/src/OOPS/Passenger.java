package OOPS;

public class Passenger {
    String Name;
    String Email;
    int seatnum;
    String dest;
    String depi;
    int Age;
    
    void printdetail() {
    	System.out.println(Name);
    	System.out.println(Email);
    	System.out.println(Age);
    	System.out.println(seatnum);
    	System.out.println(depi);
    	System.out.println(dest);
 	
    }
    
    void sedetail() {
    	Name="Nisha";
		Email="nisha@gmail.com";
		Age=25;	
		depi="mumbai";
		dest="tokyo";
		seatnum=54;
    }
}
