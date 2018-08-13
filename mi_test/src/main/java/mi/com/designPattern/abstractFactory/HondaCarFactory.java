package mi.com.designPattern.abstractFactory;

import mi.com.designPattern.simplefactory.HondaCar;

public class HondaCarFactory{
	public HondaCar newCar() {
		return new HondaCar();
	}
}
