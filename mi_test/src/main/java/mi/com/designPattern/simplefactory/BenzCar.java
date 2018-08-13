package mi.com.designPattern.simplefactory;

public class BenzCar implements Car{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public BenzCar(int price) {
		super();
		this.price = price;
	}

	public Car newCar() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
