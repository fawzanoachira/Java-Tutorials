package BisBosDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BosDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/BisBosDemo/hello.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] allBytes = bis.readAllBytes();
		for (int i = 0; i < allBytes.length; i++) {
			System.out.print((char)allBytes[i]);
		}
		bis.close();
		fis.close();
	}
}
