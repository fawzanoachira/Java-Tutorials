package disDosDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DisDosString {
	public static void main(String[] args) throws IOException{
		
//		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/noted.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeUTF("hello");
//		dos.close();
//		fos.close();
//		
//		FileInputStream fis1 = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/noted.txt");
//		DataInputStream dis1 = new DataInputStream(fis1);
//		System.out.println(dis1.readUTF());
//		dis1.close();
//		fis1.close();
		
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/noted.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeChars("hello");
		dos.close();
		fos.close();
		
		FileInputStream fis1 = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/noted.txt");
		DataInputStream dis1 = new DataInputStream(fis1);
		int i;
		while((i=dis1.readChar())!=0) {
			System.out.println((char)i);
		}
		dis1.close();
		fis1.close();
	}
}
