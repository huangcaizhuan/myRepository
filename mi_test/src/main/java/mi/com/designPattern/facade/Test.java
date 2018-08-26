package mi.com.designPattern.facade;

public class Test {
	public static void main(String[] args) {
		/*GongShangJu gsj = new AreaGongShangJu();
		gsj.checkName();
		
		ZhiJianJu zjj = new AreaZhiJianJu();
		zjj.orgCodeCertificate();
		
		ShuiWuJu swj = new AreaShuiWuJu();
		swj.taxtCertificate();
		
		 Bank b= new ChinaBank();
		 b.openAccount();*/
		
		new RegisterFacade().register();
		
	}
}
