package mi.com.designPattern.bridge;

/**
 * 品牌
 * @author John
 *
 */
public interface Brand {
	void sale();
}

class Lenove implements Brand{

	public void sale() {
		System.out.println("销售联想笔记本");
	}
}

class Dell implements Brand{

	public void sale() {
		System.out.println("销售戴尔");
	}
}
