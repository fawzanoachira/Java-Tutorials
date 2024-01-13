package first_project;

class A{
	A(int a){
		this(10.6);
		System.out.println(1);
	}
	
	A(double b){
		System.out.println(2);
	}
}

class B extends A{
	B(int a){
		this();
		System.out.println(3);
	}
	
	B(){
		super(10);
		System.out.println(4);
	}
}

public class InheritanceBalance {
	public static void main(String[] args) {
		B b = new B(2);
	}
}
