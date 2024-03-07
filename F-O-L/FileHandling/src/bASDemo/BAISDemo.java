package bASDemo;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BAISDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/bASDemo/notes.txt");
		byte[] allBytes = fis.readAllBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(allBytes);
		
		int i;
		while((i=bais.read())!=-1) {
			System.out.print((char)i);
		}
		bais.close();
		fis.close();
	}
}
