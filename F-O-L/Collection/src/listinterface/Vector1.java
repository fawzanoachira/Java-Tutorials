package listinterface;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector a = new Vector();
//		Vector a = new Vector(7); //initializing capacity
//		Vector a = new Vector(4, 4); //initializing capacity and infcrementaion value 
									 //new capacity=currentcapacity+incremented value
//		Vector a = new Vector();
		
		a.add(10);
		a.add(30);
		a.add(10);
		a.add(null);
		a.add("sree");
//		a.add(10);
//		a.add(30);
//		a.add(10);
//		a.add(null);
//		a.add("sree");
//		a.add(40);
		
		for(Object v:a) {
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println(a.capacity());
	}
}
