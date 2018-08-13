package mi.com.designPattern.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Sun sun = Sun.getInstance();
		System.out.println(sun);
		
		Sun sun2 = Sun.getInstance();
		System.out.println(sun2);
		sun.light();
		
		A a = new A();
		a.printConfig();
	}
}
