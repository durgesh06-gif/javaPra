package Arrays;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String flight[]= {"indigo","spicejet","vistara"};
		//printing length
		System.out.println(flight.length);
		//finding value store in index
		System.out.println(flight[0]);
		
		System.out.println("");
		
		//using for loop to find the value in side array
		for(int i=0;i<flight.length;i++) {
			System.out.println(i+" "+flight[i]);
		}
		
		System.out.println(" ");
		
		//inhance array to find the value
		for(String name:flight) {
			System.out.println(name);
		}
	}

}
