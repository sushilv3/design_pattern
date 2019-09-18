package proxy;

public class ClientProxy {
	public static void main(String[] args) {
		IInternet pxi = new ProxyInternet();
		
		try {
//			pxi.connectionTo("abc.com");
			pxi.connectionTo("pratices.com");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
