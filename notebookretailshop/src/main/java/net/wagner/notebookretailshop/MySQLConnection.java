package net.wagner.notebookretailshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	private Connection con;
	
	public Connection createConnection() throws SQLException {
		if (con == null) {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computershop", "root", "1234");
		}
		return con;
	}
}
   