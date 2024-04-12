package udpProgram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		InetAddress i = InetAddress.getByName("localhost");
		
		DatagramPacket d = new DatagramPacket(new byte[0], 0,i,5000);
		
		ds.send(d);
		
		System.out.println("Client readiness sent to server. Waiting for data");
		
		byte[] buf = new byte[1024];
		
		DatagramPacket d2 = new DatagramPacket(buf, 1024);
		ds.receive(d2);
		
		String recieveData = new String(d2.getData(),0,d2.getLength());
		System.out.println("Recieved Data is "+recieveData);
		
		ds.close();
		
		
	}
}
