package instanceOfproblems;

public class Main {
	public static void main(String[] args) {
		Admin a = new Admin();
		Customer c = new Customer();
		Login l = new Login();
		
		l.login(c);
		l.login(a);
	}
}
