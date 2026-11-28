package OOPS.Abstraction;

public interface Restauarant {

	void menu();
	
	void order();
	
	void bill();
	
	default void meth() {
		
	}
	
    private void meth1() {
		
	}
	
	static  void meth2() {
		
	}
}
