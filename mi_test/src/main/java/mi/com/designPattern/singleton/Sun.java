package mi.com.designPattern.singleton;

public class Sun {
	
	private static Sun sun = new Sun();
	
	public static Sun getInstance() {
		return sun;
	}
	private int tem;
	private int size;
	
	private Sun() {
		
	}
	public int getTem() {
		return tem;
	}

	public void setTem(int tem) {
		this.tem = tem;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void light() {
		System.out.println("������â�����մ�ء�������");
	}
}
