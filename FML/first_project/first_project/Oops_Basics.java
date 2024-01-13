package first_project;

public class Oops_Basics {
	static String bankName = "sbi";
		   String custName;
		   String custEmail;
	
	public void hh(String name, String email) {
		custEmail = email;
		custName = name;
	}
	
	public void display() {
		System.out.println(custName);
		System.out.println(custEmail);
		System.out.println(bankName);
	}
	
	public static void main(String[] args) {
//		System.out.println("Hiiii");
		Oops_Basics obj = new Oops_Basics();
		
		obj.hh("fff","jhdbfsdjh");
		obj.display();
	}
}
