package mi.com.designPattern.strategy;

public class NewCustomerFewStategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("不打折，原价");
		return standarPrice;
	}

}
