package java_intermediate;

public class GarbageCollection {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected");
	}
	
	public static void main(String[] args) {
//		new GarbageCollection(); //anonymous object creation. this is unreferenced object. it is a garbage.
		
		GarbageCollection g = new GarbageCollection();
		g = null; // nulling reference variable makes garbage.
		
//		GarbageCollection g1 = new GarbageCollection();
//		
//		g = g1; // assigning reference variable to another makes garbage.
		
		System.gc();
		System.out.println(g);
	}
}
