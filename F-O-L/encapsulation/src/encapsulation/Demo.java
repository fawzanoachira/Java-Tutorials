package encapsulation;

public class Demo {
	public static void main(String[] args) {
		EncapsulationProject s = new EncapsulationProject();
		System.out.println(s.getSalary());
		
		s.setSalary(10000);
		System.out.println(s.getSalary());
	}
}
