package mi.com.designPattern.bridge;

public class Test {
	public static void main(String[] args) {
		//销售联想笔记本
		Comcupter2 c = new Laptop2(new Lenove());
		c.sale();
	}
}
