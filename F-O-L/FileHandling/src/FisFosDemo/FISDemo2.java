package FisFosDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notes.txt");
		System.out.println(f.exists());
		
		if(f.exists()) {
			System.out.println("Name of file: "+f.getName());
			System.out.println("Path of file: "+f.getAbsolutePath()+" "+f.getCanonicalPath());
			System.out.println("File readable: "+f.canRead());
			System.out.println("File writable: "+f.canWrite());
			System.out.println("File length: "+f.length());
		}
		
		
		
	}
}
