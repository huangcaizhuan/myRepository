package mi.com.designPattern.command;

public interface Command {
	/**
	 * 这是一个返回结果为空的方法。
	 * 实际项目中，可以设计多个不同方法
	 */
	void execute();
}
class ConcreteCommand implements Command{

	private Receiver receiver;//命令真正执行者
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.action();
	}
	
}
