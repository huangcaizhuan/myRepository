package mi.com.designPattern.simplefactory;

public class Family {
	private FordCar fordCar;

	public Family(FordCar fordCar) {
		super();
		this.fordCar = fordCar;
	}
	public void goOut() {
		System.out.println("---ȫ���Լݳ���---");
		fordCar.run();
		System.out.println("��Ŀ���");
	}
}
