package mi.com.designPattern.mediator;

public interface MyMediator {
	void  register(String dname,Department d);

	void command(String dname);
}
