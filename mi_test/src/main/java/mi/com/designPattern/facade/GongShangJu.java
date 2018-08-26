package mi.com.designPattern.facade;

/**
 * 工商局
 * @author John
 *
 */
public interface GongShangJu {

	void checkName();
}

class  AreaGongShangJu implements GongShangJu{

	@Override
	public void checkName() {
		System.out.println("某区工商局");
	}
	
}