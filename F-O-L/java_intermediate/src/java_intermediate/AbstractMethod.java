package java_intermediate;

abstract class abclass{
	/* In abstract class these we can create:-
	 * 1. abstract methods
	 * 2. Concrete methods
	 * 3. constructors
	 * 4. data members
	 */
	
	int a = 10;
	
	abstract public void test();
	
	void test2() {
		System.out.println("dfdsffgsd");
	}
	
	public abclass() {
		System.out.println("constructor");
	}
	
}

public class AbstractMethod extends abclass{
	
	@Override
	public void test() {
		
	}
	public AbstractMethod() {
		super();
	}
	public static void main(String[] args) {
		AbstractMethod m = new AbstractMethod();
		
		m.test2();
		System.out.println(m.a);
	}
}
