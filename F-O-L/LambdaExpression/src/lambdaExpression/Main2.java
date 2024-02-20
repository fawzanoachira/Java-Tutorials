package lambdaExpression;

public class Main2 {
	public static void main(String[] args) {
		Runnable r = ()->{
			try {
				for(int i = 1;i<=5;i++) {
					Thread.sleep(1000);
					System.out.println(i);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}
