package ExceptionsHandling;

public class InvalidUser extends RuntimeException {
	// creating custom run time Execption 
	public void InvalidUser() {		
	}

   public InvalidUser(String message) {
		super(message);
	}
}
