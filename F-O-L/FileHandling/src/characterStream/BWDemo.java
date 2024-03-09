package characterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BWDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\ARAMAM\\eclipse-workspace\\CharacterStream\\src\\characterStream\\notes2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("helloo");
		bw.close();
		fw.close();
		
		FileReader fileReader = new FileReader("C:\\Users\\ARAMAM\\eclipse-workspace\\CharacterStream\\src\\characterStream\\notes2.txt");
		BufferedReader br = new BufferedReader(fileReader);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
		fileReader.close();
	}
}
