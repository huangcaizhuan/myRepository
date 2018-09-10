package mi.com.designPattern.mediator;

public class Finacial implements Department{

	private MyMediator m;//中介者
	public Finacial(MyMediator m) {
		super();
		this.m = m;
		m.register("Finacial", this);
	}
	@Override
	public void selfAction() {
		System.out.println("给钱");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作。钱太多了，怎么花");
		
	}

}
