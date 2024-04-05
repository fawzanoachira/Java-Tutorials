package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
	
	static int calculateFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Waiting for client");
		
		try {
			ServerSocket ss = new ServerSocket(5000); //Creating Server Socket
			Socket accept = ss.accept(); //Accept Client Socket and making connection
			System.out.println("Connection Established");
			BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream())); //Setting Reader for
																									//Incoming Value
			int num = Integer.parseInt(br.readLine()); //Reading Value
			System.out.println(num);
			int calculateFactorial = calculateFactorial(num);
			System.out.println(calculateFactorial);
			PrintWriter writer = new PrintWriter(accept.getOutputStream()); //Setting Writer
			writer.println("Factorial of the "+num + " is " + calculateFactorial); //Writing value and sending it
			
			writer.close();
			br.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
