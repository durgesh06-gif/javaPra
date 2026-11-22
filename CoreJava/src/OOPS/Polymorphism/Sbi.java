package OOPS.Polymorphism;

public class Sbi extends Bank {

	@Override
	public void rules() {
		System.out.println("SBI rule");
		System.out.println("kyc must done");
		super.rules();
	}
}
