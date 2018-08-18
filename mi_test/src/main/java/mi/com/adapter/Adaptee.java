package mi.com.adapter;

/**
 * 适配器（类适配器）
 * @author John
 *
 */
public class Adaptee extends Adapter implements Target{

	public void hadleRequest() {
		super.request();
	}

}
