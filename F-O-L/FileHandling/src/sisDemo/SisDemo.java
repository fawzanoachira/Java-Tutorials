package sisDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SisDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/sisDemo/Notes.txt");
		FileInputStream fis2 = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/sisDemo/Notes1.txt");
		SequenceInputStream sis = new SequenceInputStream(fis, fis2);
		
		int i;
		while((i=sis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
