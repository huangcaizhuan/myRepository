package mi.com.designPattern.abstractFactory;

import mi.com.designPattern.simplefactory.Car;

public class FourS {
	private AbstractCarFactory carFactory;

	public AbstractCarFactory getCarFactory() {
		return carFactory;
	}

	public void setCarFactory(AbstractCarFactory carFactory) {
		this.carFactory = carFactory;
	}
	
	public Car sellCar() {
		return carFactory.newCar();
	}
}
