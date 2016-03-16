package tw.jimmy.lab;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

	private static final long serialVersionUID = 1L;

	// 這個實現必須有一個顯式的建構函式，並且要拋出一個RemoteException異常
	public CalculatorImpl() throws RemoteException {
		super();
	}
	
	public long add(long a, long b) throws RemoteException {
		return a + b;
	}

	public long sub(long a, long b) throws RemoteException {
		return a - b;
	}

	public long mul(long a, long b) throws RemoteException {
		return a * b;
	}

	public long div(long a, long b) throws RemoteException {
		return a / b;
	}
}
