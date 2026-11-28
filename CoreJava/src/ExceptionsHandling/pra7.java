package ExceptionsHandling;


public class pra7  {
	public static void main(String[] args) {
		
		User user = new User();
		user.vote(12);
		try {
			user.user("ash");
		} catch (UserNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

