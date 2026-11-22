package Encapsulation;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setId(123);
		System.out.println(user.getId());
		
		user.setId("ash");
		System.out.println(user.getName());
		
		user.setAge(20);
		System.out.println(user.getAge());
		
	}

}
