package first_project;

class single{
	void display() {
		System.out.println("Single level");
	}
}

class multi_level extends single{
	void display1() {
		System.out.println("multilevel");
	}
}

public class Inheritance extends multi_level  {
	
	void display3() {
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		
		single d = new single();
		
		d.display();
		
		multi_level m = new multi_level();
		
		m.display();
		m.display1();
		
		Inheritance s = new Inheritance();
		
		s.display();
		s.display1();
		s.display3();
	}
	
//	class single{
//		void display() {
//			System.out.println("Single level");
//		}
//	}
//
//	public class Inheritance extends single  {
//		public static void main(String[] args) {
//			Inheritance s = new Inheritance();
//			
//			s.display();
//		}
	
}
