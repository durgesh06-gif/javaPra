package OOPS.Abstraction;

public class Classic implements Restauarant {

	@Override
	public void menu() {
		System.out.println("order");
	}

	@Override
	public void order() {
System.out.println("desert");		
	}

	@Override
	public void bill() {
System.out.println("Amount");		
	}

}
