package mi.com.designPattern.prototype;

public class LapTop implements Cloneable{
	public LapTop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	protected Object clone() throws CloneNotSupportedException{
		Object object = super.clone();
		return object;
	}
}
