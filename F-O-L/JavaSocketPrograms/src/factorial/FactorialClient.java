package factorial;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
	public static void main(String[] args) {
		System.out.println("Client Started");
		try {
			Socket s = new Socket("localhost",5000); //Client Socket Creation
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Setting Reader
			System.out.println("Enter a Number: ");
			int num = Integer.parseInt(br.readLine()); //Reading Value
			System.out.println(num);
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true); //Setting Writer
			pw.println(num); //Writing value and sending it to server
			BufferedReader buf = new BufferedReader(new InputStreamReader(s.getInputStream())); //Setting reader for
																								//incoming value
			String line = buf.readLine(); //Reading value
			System.out.println(line);
			
			buf.close();
			pw.close();
			br.close();
			s.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
