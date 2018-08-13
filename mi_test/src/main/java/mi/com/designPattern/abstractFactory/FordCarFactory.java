package mi.com.designPattern.abstractFactory;

import mi.com.designPattern.simplefactory.FordCar;

public class FordCarFactory implements AbstractCarFactory{
	public FordCar newCar() {
		return new FordCar();
	}
}
