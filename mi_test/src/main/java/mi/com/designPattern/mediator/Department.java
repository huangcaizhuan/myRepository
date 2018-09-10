package mi.com.designPattern.mediator;

/**
 * 同事类的接口
 * @author John
 *
 */
public interface Department {
	void selfAction();//做本部门的事情
	void outAction();//做总经理发出的申请
}
