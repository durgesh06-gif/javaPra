package Arrays;

public class pra13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[][]= {
				{-1,2},{-3,-5}
		};
		int a2[][]= {
				{2,6},{6,5}
		};
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(a1[i][j]+a2[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
