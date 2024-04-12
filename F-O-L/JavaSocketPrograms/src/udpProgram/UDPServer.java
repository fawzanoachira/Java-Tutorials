package udpProgram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(5000);
		System.out.println("Server ready");
		
		byte[] buf = new byte[1024];
		DatagramPacket d = new DatagramPacket(buf, buf.length);
		
		ds.receive(d);
		
		String s = "Hiiiiiiiiiiiiii";
		DatagramPacket d1 = new DatagramPacket(s.getBytes(),s.length(),d.getAddress(),d.getPort());
		ds.send(d1);
		ds.close();
 	}
}
