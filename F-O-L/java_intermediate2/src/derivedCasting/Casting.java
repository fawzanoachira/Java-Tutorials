package derivedCasting;

class Sample{
	
}

class Demo extends Sample{
	
}

public class Casting {
	public static void main(String[] args) {
		 Demo d = new Demo();
		 Sample s = d; //upcasting
		 System.out.println(s);
	}
}
