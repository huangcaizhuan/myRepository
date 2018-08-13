package mi.com.designPattern.simplefactory;

import java.io.IOException;
import java.util.Properties;
/**
 * �򵥹���ģʽ
 * @author John
 *
 */
public class CarFactory {
	private static Properties config = new Properties();
	static {
		try {
			config.load(CarFactory.class.getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Car newCar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = config.getProperty("Car");
		Class<Car> clazz = (Class<Car>) Class.forName(className);
		Car car =clazz.newInstance();
		return car;
	}
	/*
	public static Car newCar(String carBrand) {
		if(carBrand.equals("ford")) {
			return new FordCar();
		}else if(carBrand.equals("honda"){
			return new HondaCar();
		}else {
			return null;
		}
	}*/
}
