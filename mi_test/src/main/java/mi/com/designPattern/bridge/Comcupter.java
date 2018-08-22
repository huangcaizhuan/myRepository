package mi.com.designPattern.bridge;

public interface Comcupter {
	void sale();
}
class Desktop implements Comcupter{

	public void sale() {
		System.out.println("销售台式机");
	}
}

class Laptop implements Comcupter{

	public void sale() {
		System.out.println("销售笔记本");
	}
}

class Pad implements Comcupter{

	public void sale() {
		System.out.println("销售平板电脑");
	}
}

class LenoveDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}

class LenoveLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}

class LenovePad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售联想平板电脑");
	}
}


class ShenzhouDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售神州台式机");
	}
}

class ShenzhouLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售神州笔记本");
	}
}

class ShenzhouPad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售神州平板电脑");
	}
}

class DellDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}

class DellLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}

class DellPad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售戴尔平板电脑");
	}
}