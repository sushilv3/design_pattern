package proxy;

public class RealInternet implements IInternet {

	public RealInternet() {

	}

	@Override
	public void connectionTo(String serverHost) throws Exception {
		System.out.println("Connecting to " + serverHost);
	}

}
