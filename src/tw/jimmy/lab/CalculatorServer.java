package tw.jimmy.lab;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
	private Integer servicePort;
	private String serviceName;
	private String serviceHost;
	private Registry registry;
	private Calculator cal;

	public CalculatorServer(Integer servicePort, String serviceHost,
			String serviceName) {
		super();
		this.servicePort = servicePort;
		this.serviceHost = serviceHost;
		this.serviceName = serviceName;
		try {
			this.registry = LocateRegistry.createRegistry(this.servicePort);
			cal = new CalculatorImpl();
			String serviceUri = "rmi://" + serviceHost + ":" + servicePort
					+ "/" + serviceName;
			Naming.rebind(serviceUri, cal);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		new CalculatorServer(2020, "localhost", "CalculatorService");
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getServiceHost() {
		return serviceHost;
	}

	public Registry getRegistry() {
		return registry;
	}

}