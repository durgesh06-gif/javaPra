package OOPS.inheritance;

public class Manager extends Employee {

	int bonus;
	
	public Manager(int id, int salayr, String name, int bonus) {
		super(id, salayr, name);
		this.bonus = bonus;
	}

	void assigntask() {
		System.out.println("task assign");
	}
	
	void reviewtak() {
		System.out.println("task review");
	}
	
	void approvetask() {
		System.out.println("task assign");
	}
}
