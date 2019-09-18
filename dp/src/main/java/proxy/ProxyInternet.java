package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet{
	private IInternet internet = new RealInternet();
	private static List<String> bannedSites;

	
	
	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ghi.com");
		bannedSites.add("jkl.com");
		bannedSites.add("mno.com");
		
	}
	
	@Override
	public void connectionTo(String serverHost) throws Exception {
	if(bannedSites.contains(serverHost.toLowerCase())) {
		throw new Exception("Access Denied");
	}
	internet.connectionTo(serverHost);
		
	}

}
