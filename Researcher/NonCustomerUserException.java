package teamproject;

public class NonCustomerUserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonCustomerUserException() {
		
	}
	public NonCustomerUserException(String message) {
		super(message);
	}

}
