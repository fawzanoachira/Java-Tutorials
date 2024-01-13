package java_libraries;

public class Demo {
	public static void main(String[] args) {
		Demo n = new Demo();
		Demo m = n;
		Demo o = new Demo();
		
		System.out.println(n.hashCode());
		System.out.println(n);
		System.out.println(n.toString());
		System.out.println(m);
		
		System.out.println(n.equals(m));
		System.out.println(n.equals(o));
	}
}
