package customizedException;

class NotEligibleForVote extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public NotEligibleForVote(String message) {
		super();
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
}

public class CustomException {
	
	public void checkAge(int age) {
		if(age>=18) {
			System.out.println("u can vote");
		}
		else {
			throw new NotEligibleForVote("u are not eligible");
		}
	}
	
	public static void main(String[] args) {
		CustomException m = new CustomException();
//		try {
//			m.checkAge(17);
//		}
//		catch(NotEligibleForVote e) {
//			System.out.println(e.getMessage());
//		}
		m.checkAge(17);
	}
}
