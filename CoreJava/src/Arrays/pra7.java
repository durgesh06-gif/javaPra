package Arrays;

public class pra7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multi dimision array
		
		int marks[][]= {{12,34,55},{34,46,77},{23,67,89}};
		System.out.println(marks.length);
		System.out.println(marks[2][1]);
		
		System.out.println("========================");
		
		for(int a[]:marks)
		{
			for(int n:a)
			{
				System.out.println(n);
			}
		}
		System.out.println("========================");

		for(int i=0;i<marks.length;i++) {
		   for(int j=0;j<marks[i].length;j++) {
			   System.out.println(i+" "+j+" = " +marks[i][j]);
		   }
		}
	}

}
