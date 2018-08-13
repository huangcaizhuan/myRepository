package mi.com.designPattern.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
	public void printConfig() throws FileNotFoundException, IOException {
		/*Properties properties = new Properties();
		properties.load(new FileInputStream(new File("F:\\workspace\\ThinkingInOO\\src\\singleton\\config.properties")));
		String name= properties.getProperty("name");
		String age= properties.getProperty("age");
		System.out.println(name+"..."+age);*/
		
		Config config= Config.getIntance();
		String name= config.getProperties("name");
		String age= config.getProperties("age");
		System.out.println(name+"..."+age);
		
				
	}
}
