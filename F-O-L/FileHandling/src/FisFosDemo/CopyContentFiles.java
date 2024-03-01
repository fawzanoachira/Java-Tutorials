package FisFosDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFiles {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notesss.txt");
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Note.txt");
		int i;
		while((i = fis.read())!=-1) {
			fos.write(i);
		}
	}
}
