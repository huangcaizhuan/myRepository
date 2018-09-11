package mi.com.designPattern.strategy;

public class Test {
	public static void main(String[] args) {
		Strategy s = new OldCustomerManyStategy();
		Context c = new Context(s);
		
		c.pringPrice(99);
	}
}
