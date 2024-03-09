package characterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FWDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\ARAMAM\\eclipse-workspace\\CharacterStream\\src\\characterStream\\notes.txt");
		fw.write("its great to start");
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\ARAMAM\\eclipse-workspace\\CharacterStream\\src\\characterStream\\notes.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}
