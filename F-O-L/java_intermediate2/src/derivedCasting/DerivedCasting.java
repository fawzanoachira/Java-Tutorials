package derivedCasting;

class Demo1 implements Sample1{

	@Override
	public void check(Sample1 b) {
		System.out.println(b);
	}

	@Override
	public void check(Demo1 c) {
		System.out.println(c);
	}
	
}

public class DerivedCasting {
	public static void main(String[] args) {
		Sample1 m = new Demo1();
//		
		m.check(new Demo1());
//		m.check(new Sample1()); 
		
		if(m instanceof Sample1) {
			System.out.println(m+" instanceof");
		}
	}
}
