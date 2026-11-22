package Encapsulation;

public class User {

	private int id;
	private String name;
	private int age;
	
	public void setId(int id) {
		if(id>99 && id<1000 ) {
			this.id=id;
		}
		else {
			System.out.println("enter three dight num");
		}
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
}
