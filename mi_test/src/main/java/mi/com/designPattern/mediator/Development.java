package mi.com.designPattern.mediator;

public class Development implements Department{
	private MyMediator m;//中介者
	public Development(MyMediator m) {
		super();
		this.m = m;
		m.register("Development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，。没钱了，需要资金支持");
	}

}
