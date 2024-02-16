package lambdaExpression;

@FunctionalInterface
interface Myclass{
	public String getName();
}

public class Main {
	
	public static void main(String[] args) {
		Myclass m = ()->"hello";
		System.out.println(m.getName());
	}
}
