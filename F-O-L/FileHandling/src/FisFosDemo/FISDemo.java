package FisFosDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
	public static void main(String[] args) throws IOException {
//		File f = new File("/home/fawzan/Desktop/j/abc.txt");
//		try {
//			if(f.createNewFile()) {
//				System.out.println("FIle created successfully");
//			}
//			else {
//				System.out.println("file already exists");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileInputStream fis = new FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notes.txt");
//		int read1 = fis.read();
//		int read2 = fis.read();
//		int read3 = fis.read();
//		int read4 = fis.read();
//		int read5 = fis.read();
//		System.out.println((char)read1+""+(char)read2+""+(char)read3+""+(char)read4+""+(char)read5);
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		
		
		
		
		
	}
}
