package OOPS.Polymorphism;

public class Calcu {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b,double c) {
		System.out.println(a+b+c);
	}
	public void mul(double a, double b,double c) {
		System.out.println(a*b*c);
	}
	
	public void mul(double a, double b) {
		System.out.println(a*b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void sub(int a, double b) {
		System.out.println(a-b);
	}
}
