package bASDemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BAOSDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/bASDemo/notes.txt");
		FileOutputStream fos2 = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/bASDemo/notes1.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write("hello".getBytes());
		baos.writeTo(fos);
		baos.writeTo(fos2);
	}
}
