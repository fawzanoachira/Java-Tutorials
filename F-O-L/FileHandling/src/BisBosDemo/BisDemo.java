package BisBosDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BisDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/BisBosDemo/hello.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "hello world";
		bos.write(s.getBytes());
		bos.close();
		fos.close();
	}
}
