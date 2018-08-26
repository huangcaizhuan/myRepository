package mi.com.designPattern.facade;

/**
 * 质检局
 * @author John
 *
 */
public interface ZhiJianJu {

	void orgCodeCertificate();//办理质检证
}

class  AreaZhiJianJu implements ZhiJianJu{

	@Override
	public void orgCodeCertificate() {
		System.out.println("某区办理质检证");
	}
	
}