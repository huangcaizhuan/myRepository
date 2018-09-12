package mi.com.designPattern.state;

/**
 * 已预订
 * @author John
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已被预订");
	}

}
