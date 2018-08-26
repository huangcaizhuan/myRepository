package mi.com.designPattern.proxyPattern.staticProxy;

import java.net.Proxy;

public class Test {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		
		proxy.collectMoney();
	}
}
