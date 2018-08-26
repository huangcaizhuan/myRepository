package mi.com.designPattern.proxyPattern.staticProxy;

public class ProxyStar implements Star{
	private Star Star;
	
	public ProxyStar(Star star) {
		super();
		Star = star;
	}

	public void confer() {
		System.out.println("ProxyStar.confer....");
	}

	public void signContract() {
		System.out.println("ProxyStar.signContract....");
	}

	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket....");		
	}

	public void sing() {
		Star.sing();
		//System.out.println("ProxyStar.sing....");			
	}

	public void collectMoney() {
		System.out.println("ProxyStar(周杰伦).collectMoney....");		
	}
}
