package FisFosDemo;

import java.io.File;

public class FileRename {
	public static void main(String[] args) {
		File f = new File("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/Notes.txt");
		File f1 = new File("/home/fawzan/eclipse-workspace/FileHandling/src/FisFosDemo/NotesRenamed.txt");
		
		boolean renameTo = f.renameTo(f1);
		System.out.println(renameTo);
		if(renameTo==true) {
			System.out.println(f.getName());
			System.out.println(f.getName());
		}
	}
}
