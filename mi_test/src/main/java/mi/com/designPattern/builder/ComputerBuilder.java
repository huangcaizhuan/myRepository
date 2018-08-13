package mi.com.designPattern.builder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputerBuilder {
	
	private static final String DEFAULT_OS = "windows";//����ϵͳ
	private static final String DEFAULT_ADMIN ="admin";
	private static final String DEFAULT_PASSWORD ="admin";
	private static final String DEFAULT_BROWSER ="IE";
	private static final String DEFAULT_OFFICE ="office2013";
	private static final String DEFAULT_CHAT ="msn";
	private static final String DEFAULT_LANGUAGE  ="EN";;
	private static final String DEFAULT_RESOLUTION ="1366*768";//�ֱ���
	
	private static final Map<String,List<String>> configurotionMap = new HashMap<String,List<String>>();
	static {
		configurotionMap.put("os", Arrays.asList("windows","linux"));
		
	}
	
	private String os;//����ϵͳ
	private String network;
	private String admin;
	private String password;
	private String browser;
	private String office;
	private String chat;
	private String language;
	private String resolution;//�ֱ���
	
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return  this;
	}
	public Computer build() {
		Computer computer = new Computer();
		computer.setOs("linux");
		computer.setBrowser("FireFox");
		
		return  computer;
	}
	
	public static class Computer {
		private String os;//����ϵͳ
		private String network;
		private String admin;
		private String password;
		private String browser;
		private String office;
		private String chat;
		private String language;
		private String resolution;//�ֱ���
		public String getNetwork() {
			return network;
		}
		public void setNetwork(String network) {
			this.network = network;
		}
		public String getAdmin() {
			return admin;
		}
		public void setAdmin(String admin) {
			this.admin = admin;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getOffice() {
			return office;
		}
		public void setOffice(String office) {
			this.office = office;
		}
		public String getChat() {
			return chat;
		}
		public void setChat(String chat) {
			this.chat = chat;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getResolution() {
			return resolution;
		}
		public void setResolution(String resolution) {
			this.resolution = resolution;
		}
		public String getBrowser() {
			return browser;
		}
		public void setBrowser(String browser) {
			this.browser = browser;
		}
		public String getOs() {
			return os;
		}
		public void setOs(String os) {
			this.os = os;
		}
	}
}
