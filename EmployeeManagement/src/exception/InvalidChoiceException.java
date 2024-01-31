package exception;

public class InvalidChoiceException extends Exception{
	private String message;

	public InvalidChoiceException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
