package ExceptionsHandling;

public class pra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(5/3);
		System.out.println(25/3);
		try {
		System.out.println(5/0);
		}
		catch (Exception e) {
			System.out.println("cant div by zero");
		}
		System.out.println(35/3);
		
		System.out.println("codeew");
	}

}
