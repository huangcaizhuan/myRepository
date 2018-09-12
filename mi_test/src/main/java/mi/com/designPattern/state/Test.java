package mi.com.designPattern.state;

public class Test {
	public static void main(String[] args) {
		Context c = new Context();
		c.setState(new FreeState());
		
		c.setState(new BookedState());
	}
}
