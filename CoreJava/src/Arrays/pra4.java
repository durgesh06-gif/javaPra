package Arrays;

public class pra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price[]= {2300,3400,3450,4500,5600};
		//Finding max min sum average
		int max=price[0];
		int min=price[0];
		int sum=price[0];
		
		for(int p:price) {
			if(p>max)
				max=p;
			else if(p<max)
				min=p;
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("");
		
		for(int s:price) {
			sum=sum+s;
		}
		System.out.println(sum);
		System.out.println("Average: "+sum/price.length);
	}

}
