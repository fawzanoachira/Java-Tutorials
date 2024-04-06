package rMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMI_SquaredServer extends UnicastRemoteObject implements RMI_SquaredInterface{
	protected RMI_SquaredServer() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		try {
		Registry r = LocateRegistry.createRegistry(2581);
		r.bind("squared", new RMI_SquaredServer());
		System.out.println("My RMI Application is ready and running");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
		

	@Override
	public double getSquare(double input) throws RemoteException{
		return input * input;
	}

	@Override
	public double getSquareRoot(double input) throws RemoteException{
		return Math.sqrt(input);
	}
}
