package udpProgram;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getLocalHost());
	}
}
