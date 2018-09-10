package mi.com.designPattern.command;

/**
 * 命令的发起者
 * @author John
 *
 */
public class Invoke {
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	/**
	 * 业务方法，用于命令调用
	 */
	public void call() {
		command.execute();
	}
}
