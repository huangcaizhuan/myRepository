package mi.com.designPattern.templateMethod;

/**
 * 模板方式模式
 * @author John
 *
 */
public abstract class BankTemplatMethod {
	//取号
	public void takeNumber() {
		System.out.println("取号排队。。。。。。");
	}
	
	//办理具体业务，钩子方法
	public abstract void transact();
		
	public void evaluate() {
		System.out.println("反馈评分");
	}
	
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
