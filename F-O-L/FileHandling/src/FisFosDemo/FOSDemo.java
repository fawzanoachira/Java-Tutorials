package FisFosDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notes.txt");
		String s = "hii how r u";
		byte[] bytes = s.getBytes();
		fos.write(bytes);
		fos.close();
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notes.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
}
