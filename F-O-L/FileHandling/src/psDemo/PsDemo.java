package psDemo;

import java.io.IOException;
import java.io.PrintStream;

public class PsDemo {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("/home/fawzan/eclipse-workspace/FileHandling/src/psDemo/nots.txt");
		ps.print("fawzan");
		ps.close();
	}
}
