package mi.com.designPattern.mediator;

public class Test {
	public static void main(String[] args) {
		MyMediator m = new Pressident();
		
		Market market = new Market(m);
		Development de = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
		
	}
}
