package mi.com.designPattern.strategy;

/**
 * 负责交互
 * @author John
 *
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void pringPrice(double s) {
		System.out.println("报价为："+strategy.getPrice(s));
	}
}
