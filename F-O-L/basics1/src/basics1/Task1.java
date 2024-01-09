package basics1;

class Account{
	String bankName, custName, emailId;
	double phoneNo, balance;
	
	public void deposit(int amount) {
		System.out.println("Deposited amount: " + amount);
	}
	
	public void withdraw(int amount) {
		System.out.println("Withdrawed amount: " + amount);
	}
	
	public void checkBalance() {
		
	}
	
	public void accountDetails() {
		System.out.println("Customer Name: " + custName);
		System.out.println("Email Id: " + emailId);
		System.out.println("Phone No: " + phoneNo);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Balance: " + balance);
	}
}

public class Task1 {
	public static void main(String[] args) {
		new Account().accountDetails();
	}
}
