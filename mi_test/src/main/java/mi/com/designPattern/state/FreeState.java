package mi.com.designPattern.state;

/**
 * 空闲状态
 * @author John
 *
 */
public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("空闲状态、、、");
	}

}
