package java_intermediate2;

public class Typecasting {
	public static void main(String[] args) {
		//byte 1 byte
		//short 2 byte
		//int 4 byte
		//long 8 byte
		//float 4 byte
		//double 8 byte
		//char 2 byte
		//boolean 1 bit
		
//		byte a = 10;
//		short b = a; //widening 
//		
//		int c = 10;
//		double d = a; //widening
//		System.out.println(a+" "+b);
//		System.out.println(c+" to "+d);
//		
//		double e =10;
//		int f = (int)e; //narrowing
//		System.out.println(e+" to "+f);
//		
//		char g = 'a';
//		int h = g; //widening  
//		System.out.println(g+" to "+h);
//		
//		int i = 65; 
//		char j = (char)i; //narrowing
//		System.out.println(i+" to "+j);
//		
//		int k = 10; //same bit length conversion
//		float l = k;
//		System.out.println(k+" to "+l);
//		
//		float m = 10;
//		int n = (int)m;
//		System.out.println(m+" to "+n);
//		
		
		System.out.println("A"+"B");
		System.out.println("A"+20);
		System.out.println('A'+'B');
		System.out.println('A'+20);
		
		System.out.println(20); //compiler assumes as integer
		System.out.println(20.0); //compiler assumes as double
		
		float o = (float)20.0;
		System.out.println(o);
		
		//floating point number assignation
		float p = 20.0f; 
		float q = 20.0F;
		
		System.out.println(p+" "+q);
		
		long r = 123456789012l;
		long s = 123456789012L;
		System.out.println(r+" "+s);
	}
}
