package Strings;

public class pra9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Nisha";
		String s2="nisha";
		
		System.out.println(s1.equals(s2));// case sensetive
		System.out.println(s1.equalsIgnoreCase(s2));


		s1=s1.toLowerCase();
		System.out.println(s1);
	}

}
