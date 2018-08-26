package mi.com.designPattern.facade;

/**
 * 外观模式
 * @author John
 *
 */
public class RegisterFacade {

	public void register() {
		GongShangJu gsj = new AreaGongShangJu();
		gsj.checkName();
		
		ZhiJianJu zjj = new AreaZhiJianJu();
		zjj.orgCodeCertificate();
		
		ShuiWuJu swj = new AreaShuiWuJu();
		swj.taxtCertificate();
		
		 Bank b= new ChinaBank();
		 b.openAccount();
	}
}
