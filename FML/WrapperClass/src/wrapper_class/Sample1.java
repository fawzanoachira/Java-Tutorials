package wrapper_class;

public class Sample1 {
	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20.0";
		System.out.println(s1+s2);
		
		System.out.println("-----------------------");
		
		int i = Integer.parseInt(s1);
		double d = Double.parseDouble(s2);
		System.out.println(i+d);
	}
}
