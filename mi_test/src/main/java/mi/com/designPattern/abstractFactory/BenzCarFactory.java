package mi.com.designPattern.abstractFactory;

import mi.com.designPattern.simplefactory.BenzCar;

public class BenzCarFactory implements AbstractCarFactory{
	public BenzCar newCar() {
		return new BenzCar(300000);
	}
}
