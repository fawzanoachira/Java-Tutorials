package instanceOfproblems2;

public class Main {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		
		Food f = h.orderFood(3);
		if(f instanceof Idli) {
			Idli i = (Idli)f;
			i.orderMaking();
			System.out.println("delivered idli");
		}
		if(f instanceof Chappathi) {
			Chappathi c = (Chappathi)f;
			c.orderMaking();
			System.out.println("delivered Chappathi");
		}
		if(f instanceof Dosa) {
			Dosa d = (Dosa)f;
			d.orderMaking();
			System.out.println("delivered Dosa");
		}
	}
}
