package Loops;

public class pra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				//Reversing number
				
				int i=34567;
				int r=0;
				
				while(i>0) {
					int rm=i%10;
					r=r*10+rm;
					i=i/10;
				}
				System.out.println("count is " +r);

			}
	}

