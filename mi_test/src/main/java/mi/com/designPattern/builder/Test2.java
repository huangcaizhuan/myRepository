package mi.com.designPattern.builder;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Test2 {
	public static void main(String[] args) throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306://test");
		dataSource.setUsername("root");
		dataSource.setPassword("root1234");
		Connection connection = (Connection) dataSource.getConnection();
		PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement("insert into test(id,name) values(?,?)");
		pStatement.setLong(1, 1l);
		pStatement.setString(2, "kity");
		pStatement.executeUpdate();
		pStatement.close();
		connection.close();
	}

}
