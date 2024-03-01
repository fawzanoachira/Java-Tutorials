package disDosDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DisDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/note.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		dis.close();
		fis.close();
	}
}
