package Arrays;

import java.util.Scanner;

public class pra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		String pass[]=new String[4];
				
	  for(int i=0;i<pass.length;i++) {
		  pass[i]=s.next();
	  }
	  
	 System.out.println(" ");
	 
	  for( String p:pass) {
		  System.out.println(p);
	  }
	}

}
