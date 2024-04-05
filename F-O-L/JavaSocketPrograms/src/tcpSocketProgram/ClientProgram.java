package tcpSocketProgram;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {
		try {
			
			Socket s = new Socket("localhost",5000);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("hello");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
