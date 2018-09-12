package mi.com.designPattern.state;

/**
 * 已入住
 * @author John
 *
 */
public class CheckedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已被入住");
	}

}
