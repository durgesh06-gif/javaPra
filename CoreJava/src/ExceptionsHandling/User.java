package ExceptionsHandling;



public class User {
	// use of throw keyword
	public void vote(int age) {
		if(age>18) {
			System.out.println("your r eligible to vote");
		}
		else {
			throw new InvalidUser("invaild age");
		}
		
		public void user(String name) throws UserNotFound {
			if(name.equals("grey")) {
				System.out.println("your r eligible to vote");
			}
			else {
				throw new UserNotFound("invaild name");
			}
	}
}
