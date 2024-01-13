package interface_projects;

public interface Sample1 {
	public default void test() {
		System.out.println("hello in Sample1");
	}
	
	public static void test1() { //declaration of static methods in interface in java after jdk 8
		System.out.println("static concrete methd interface in Sample 1");
	}
}
