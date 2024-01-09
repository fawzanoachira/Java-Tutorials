package instanceOfproblems;

public class Login {
	public void login(Flipkart f) {
		if(f instanceof Admin) {
			System.out.println("Admin login successfully");
			Admin a = (Admin)f;
			
			a.addProducts();
			a.offers();
		}
		else {
			System.out.println("Customer login successfully");
			Customer c = (Customer)f;
			
			c.buyProduct();
			c.payment();
		}
	}
}
