package net.wagner.notebookretailshop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private static Stock instance;
	MySQLConnection mysqlconnection;
	
	
	List<Computer> computers;
	
	private Stock() {
		computers = new ArrayList<>();
		mysqlconnection = new MySQLConnection();
	}
	
	public static Stock getInstance() {
		if(instance == null) {
			instance = new Stock();
		}
		return instance;
	}
	
	void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	void addAll(List<Computer>computerInput) {
		computers.addAll(computerInput);
	}
	
	public int getStockSize() {
		return computers.size();
	}
	
	void removeComputer(Computer computer) {
		computers.remove(computer);
	}
	
	void removeNotebookFromStock(Computer notebookToFind) throws SQLException {
			computers.remove(notebookToFind);
			Statement stmt = mysqlconnection.createConnection().createStatement();
			stmt.executeUpdate("delete from notebook where id = "+ notebookToFind.id +";");
	}
	
	void removePCFromStock(Computer pcToFind) throws SQLException {
			computers.remove(pcToFind);
			Statement stmt = mysqlconnection.createConnection().createStatement();
			stmt.executeUpdate("delete from pc where id = "+ pcToFind.id +";");
	}
}
         