package mi.com.designPattern.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("增加新的功能，飞行。。。。。");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		
		System.out.println("增加新的功能，水里游。。。。。");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		
		System.out.println("增加新的功能，智能。。。。。");
		AICar aiCar = new AICar(car);
		aiCar.move();
		
		
		System.out.println("增加新的里两个功能，飞行、水里游。。。。。");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
		
		
		try {
			Reader r = new BufferedReader(new InputStreamReader(new FileInputStream("222222.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
