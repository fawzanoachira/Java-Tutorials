package first_project;

class Sample{
	void test1() {
		System.out.println("hiiiiiiiiiii");
	}
}

//class Sample1 extends Sample{
//	void test2() {
//		System.out.println("hiiiiiiiiiiidhdfhfd");
//		Sample s = new Sample();
//		s.test1();
//	}
//	
//	
//}

public class Relations extends Sample {
	
	void test() {
		System.out.println("sdbfdsbdshb");
	}
	
	public static void main(String[] args) {
		Sample ob = new Sample();
		ob.test1(); 
		
		System.out.println("--------------------");
		
		Relations ob1 = new Relations();
		ob1.test();
		ob1.test1();
		
//		Sample1 s = new Sample1();
//		s.test2();
	}
}
