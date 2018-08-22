package mi.com.designPattern.adapter;

/**
 * 适配器（对象适配器方式）
 * @author John
 *
 */
public class Adaptee2  implements Target{
	private Adapter adapter;

	public void hadleRequest() {
		adapter.request();
	}

	public Adaptee2(Adapter adapter) {
		super();
		this.adapter = adapter;
	}

}
