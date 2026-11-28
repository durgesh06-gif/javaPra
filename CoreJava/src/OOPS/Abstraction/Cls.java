package OOPS.Abstraction;

public class Cls implements Interface,Inter {

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);		
	}

	@Override
	public void sub(int a, int b) {
			System.out.println(a-b);		
	}
	
}
