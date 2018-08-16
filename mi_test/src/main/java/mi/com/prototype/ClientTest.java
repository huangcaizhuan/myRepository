package mi.com.prototype;

import java.util.Date;

/**
 * 浅克隆
 * @author John
 *
 */
public class ClientTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(123123122311l);
		Sheep s1 =new Sheep("lily",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		Sheep s2 =(Sheep) s1.clone();
		s2.setSname("kity");
		//时间改了
		date.setTime(9999999l);
		System.out.println("s1生日也变了："+s1.getBirthday());
		
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
	}
}
