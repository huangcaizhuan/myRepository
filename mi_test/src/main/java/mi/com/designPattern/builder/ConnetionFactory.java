package mi.com.designPattern.builder;

import com.mysql.jdbc.Connection;

public class ConnetionFactory {
	private DataSourse dataSourse;
	
	public Connection openConnetion() {
		return dataSourse.getConnection();
	}
}
