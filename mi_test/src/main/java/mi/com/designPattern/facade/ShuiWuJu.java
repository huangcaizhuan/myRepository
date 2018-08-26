package mi.com.designPattern.facade;

/**
 * 税务局
 * @author John
 *
 */
public interface ShuiWuJu {

	void taxtCertificate();//办理税务登记
}

class  AreaShuiWuJu implements ShuiWuJu{

	@Override
	public void taxtCertificate() {
		System.out.println("某区办理税务登记");
	}
	
}