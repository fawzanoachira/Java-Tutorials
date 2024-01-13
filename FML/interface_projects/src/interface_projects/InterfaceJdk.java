package interface_projects;

public interface InterfaceJdk {
	public default void test() { //declaration of non static methods in interface in java after jdk 8
		System.out.println("hiiii from interfacejdk");
	}
	
	public static void test1() { //declaration of static methods in interface in java after jdk 8
		System.out.println("static concrete methd interface in Interfacejdk");
	}
}
