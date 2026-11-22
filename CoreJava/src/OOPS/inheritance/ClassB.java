package OOPS.inheritance;

public class ClassB extends ClassA {

	public ClassB() {
		// TODO Auto-generated constructor stub
		System.out.println("super constructor");
		super(5);
	}
	
	void sub(int a,int b) {
		System.out.println(a-b);
	}
}
