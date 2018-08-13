package mi.com.designPattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private static Config config;
	static{
		try {
			config = new Config();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	private Properties properties;
	public static Config getIntance() {
		return  config;
	}
	private Config() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(new File("F:\\workspace\\ThinkingInOO\\src\\singleton\\config.properties")));
	}
	public String getProperties(String name) {
		return properties.getProperty(name);
	}
}
