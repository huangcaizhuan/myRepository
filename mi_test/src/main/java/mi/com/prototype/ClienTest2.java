package mi.com.prototype;

import java.util.Date;

/**
 * 深复制
 * @author John
 *
 */
public class ClienTest2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(123123122311l);
		Sheep2 s1 =new Sheep2("lily",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		Sheep2 s2 =(Sheep2) s1.clone();
		s2.setSname("kity");
		
		//时间改了
		date.setTime(9999999l);
		System.out.println("s1生日："+s1.getBirthday());
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
