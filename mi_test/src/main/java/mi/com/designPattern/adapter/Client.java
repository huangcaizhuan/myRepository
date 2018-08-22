package mi.com.designPattern.adapter;

import org.omg.CORBA.TCKind;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

/**
 * 客户端类
 * @author John
 *
 */
public class Client{
	public void test1(Target t){
		t.hadleRequest();
	}
	public static void main(String[] args) {
		/*Client c = new Client();
		Adapter a= new Adapter();
		
		Target t = new Adaptee();
		
		c.test1(t);*/
		
		Client c = new Client();
		Adapter a= new Adapter();
		
		Target t = new Adaptee2(a);
		
		c.test1(t);
	}
}
