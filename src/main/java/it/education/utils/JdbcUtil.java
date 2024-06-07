package it.education.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static Connection buildConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/employee";
		String UID = "root";
		String PWD = "password";
		Connection dbConnection = DriverManager.getConnection(URL, UID, PWD);
		return dbConnection;

	}
}