package functionalInterface;

public class TypesImplements implements Types{
	public static void main(String[] args) {
		TypesImplements t = new TypesImplements();
		Types.test2();
		t.test();
		t.test1();
	}

	@Override
	public void test() {
		System.out.println("abstract method in interface overrided");
	}
}	
