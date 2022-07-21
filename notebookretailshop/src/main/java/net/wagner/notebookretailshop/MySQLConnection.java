package net.wagner.notebookretailshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnection {

	Notebook notebook;
	public Connection addNotebookToStock() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computershop", "root", "1234");
		return con;
	}
}
