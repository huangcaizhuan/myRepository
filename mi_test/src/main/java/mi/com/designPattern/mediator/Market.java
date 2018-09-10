package mi.com.designPattern.mediator;

public class Market implements Department{

	private MyMediator m;//中介者
	public Market(MyMediator m) {
		super();
		this.m = m;
	}

	@Override
	public void selfAction() {
		System.out.println("跑去接项目");
		
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，项目承接的进度，需要资金支持");
		m.command("Finacial");//中介交互
	}

}
