package mi.com.prototype;

import java.io.IOException;

/**
 * new创建对象和克隆创建对象的时间比较
 * @author John
 *
 */
public class Prototype {
	
	public static void testNew(int size) {
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			LapTop top = new LapTop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new 的方式："+(end-start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		LapTop top = new LapTop();
		for(int i=0;i<size;i++) {
			LapTop t = (LapTop) top.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("clone的方式："+(end-start));
	}
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		testNew(1000);
		testClone(1000);
	}
}
