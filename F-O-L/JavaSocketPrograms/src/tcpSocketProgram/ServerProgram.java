package tcpSocketProgram;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(5000);
			Socket a = s.accept();
			DataInputStream dis = new DataInputStream(a.getInputStream());
			String r = dis.readUTF();
			System.out.println(r);
			System.out.println("server running successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
