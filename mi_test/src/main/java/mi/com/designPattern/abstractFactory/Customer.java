package mi.com.designPattern.abstractFactory;

import mi.com.designPattern.simplefactory.Car;

public class Customer {
	private Car car;
	public Car getCar() {
		return car;
	}
	public void byCar(FourS fourS) {
		this.car = fourS.sellCar();
	}
}
