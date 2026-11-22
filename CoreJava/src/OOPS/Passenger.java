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
    
    Passenger(String Name,String Email,int seatnum,String dest,String depi,int Age) {
    	  this.Name=Name;
    	  this.Email=Email;
    	  this.seatnum=seatnum;
    	  this.dest=dest;
    	  this.depi=depi;
    	  this.Age=Age;
    }
    
   void setdetail (String Name,String Email,int seatnum,String dest,String depi,int Age) {
  	  this.Name=Name;
  	  this.Email=Email;
  	  this.seatnum=seatnum;
  	  this.dest=dest;
  	  this.depi=depi;
  	  this.Age=Age;
  }
}
