package anonymousClass;

interface Student{
	public String getName();
	public int getId();
}

public class Sample {
	public static void main(String[] args) {
		Student s = new Student() {
			
			@Override
			public String getName() {
				return "fawzan";
			}
			
			@Override
			public int getId() {
				return 7;
			}
		};
		
		System.out.println(s.getName()+" "+s.getId());
	}
}
