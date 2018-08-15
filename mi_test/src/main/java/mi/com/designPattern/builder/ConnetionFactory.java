package mi.com.designPattern.builder;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class ConnetionFactory {
	private BasicDataSource dataSourse;
	
	public Connection openConnetion() throws SQLException {
		return dataSourse.getConnection();
	}
}
