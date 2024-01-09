package instanceOfproblems2;

public class Hotel {
	public Food orderFood(int choice) {
		if(choice == 1) {
			Idli l = new Idli();
			return l;
		}
		else if(choice == 2){
			Dosa d = new Dosa();
			return d;
		}
		else {
			Chappathi c = new Chappathi();
			return c;
		}
	}
}
