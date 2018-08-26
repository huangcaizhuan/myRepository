package mi.com.designPattern.decorator;

/**
 * 抽象控件
 * @author John
 *
 */
public interface ICar {
 void move();
}

class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑的");
	}
	
}

class SuperCar implements ICar{
	protected ICar icar;
	@Override
	public void move() {
		icar.move();
	}
	public SuperCar(ICar icar) {
		super();
		this.icar = icar;
	}
	
}

class FlyCar extends SuperCar{
	
	public FlyCar(ICar icar) {
		super(icar);
	}
	public void fly() {
		System.out.println("天上飞");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}
//具体装饰角色
class WaterCar extends SuperCar{
	
	public WaterCar(ICar icar) {
		super(icar);
	}
	public void swim() {
		System.out.println("水上游");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}


class AICar extends SuperCar{
	
	public AICar(ICar icar) {
		super(icar);
	}
	public void autoMove() {
		System.out.println("自动陆地上跑");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}








