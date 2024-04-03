package rMI;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_SquaredClient {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry r = LocateRegistry.getRegistry("localhost",2581);
		RMI_SquaredInterface s = (RMI_SquaredInterface) r.lookup("squared");
		System.out.println(s.getSquare(4));
		System.out.println(s.getSquareRoot(25));
	}
}
