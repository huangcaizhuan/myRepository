package mi.com.designPattern.bridge;

/**
 * 电脑类型
 * @author John
 *
 */
public class Comcupter2 {
	protected Brand brand;
	public Comcupter2(Brand b) {
		this.brand = b;
	}
	public void sale() {
		brand.sale();
	}
}

class Desktop2 extends Comcupter2 {
	public  Desktop2(Brand b) {
		super(b);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}

class Laptop2 extends Comcupter2 {
	public  Laptop2(Brand b) {
		super(b);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}
