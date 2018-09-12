package mi.com.designPattern.templateMethod;

public class Test {
	public static void main(String[] args) {
		
		//方法一：定义子类
		BankTemplatMethod btm = new DrawdMony();
		btm.process();
	
		//方法二：匿名内部类
		BankTemplatMethod btm1 = new BankTemplatMethod() {
			@Override
			public void transact() {
				System.out.println("我要存钱");
			}
		};
		btm1.process();
		
		BankTemplatMethod btm2 = new BankTemplatMethod() {
			@Override
			public void transact() {
				System.out.println("我要理财");
			}
		};
		btm2.process();
		
	}
}

//子类
class DrawdMony extends BankTemplatMethod{

	@Override
	public void transact() {
		System.out.println("我要取款");
	}
	
}
