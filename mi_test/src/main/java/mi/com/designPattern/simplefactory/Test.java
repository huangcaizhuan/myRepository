package mi.com.designPattern.simplefactory;

public class Test {
	public static void main(String[] args) {
		FordCar fordCar = new FordCar();
		Family family = new Family(fordCar);
		family.goOut();
	}
}
