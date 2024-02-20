package anonymousClass;

import java.util.Comparator;

public class Sample2 {
	public static void main(String[] args) {
		Comparator c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return 0;
			}
		};
	}
}
