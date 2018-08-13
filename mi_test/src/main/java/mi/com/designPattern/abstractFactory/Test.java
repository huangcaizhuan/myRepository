package mi.com.designPattern.abstractFactory;

public class Test {
	
 public static void main(String[] args) {
		Customer customer = new Customer();
		
		FourS fourS = new FourS();
		
		AbstractCarFactory carFactory = new FordCarFactory();
		
		fourS.setCarFactory(carFactory);
		
		customer.byCar(fourS);
 	}
}
