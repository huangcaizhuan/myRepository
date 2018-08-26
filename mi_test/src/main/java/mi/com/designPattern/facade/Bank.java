package mi.com.designPattern.facade;

/**
 * 银行
 * @author John
 *
 */
public interface Bank {

	void openAccount();//开户
}

class  ChinaBank implements Bank{

	@Override
	public void openAccount() {
		System.out.println("中国银行开户");
	}
	
}