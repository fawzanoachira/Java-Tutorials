package disDosDemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo{
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/disDosDemo/note.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(1);
		dos.close();
		fos.close();
	}
}
