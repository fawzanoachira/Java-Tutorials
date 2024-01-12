package listinterface;

import java.util.ArrayList;
import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(30);
		a.add(10);
		a.add(null);
		a.add("sree");
		
		Vector v = new Vector(a); //fourth cinstructor of vector with Collection c as argument.
		for(Object f:v) {
			System.out.print(f+" ");
		}
	}
}
