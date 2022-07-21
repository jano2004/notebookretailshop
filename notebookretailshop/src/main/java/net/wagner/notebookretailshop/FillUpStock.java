package net.wagner.notebookretailshop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FillUpStock {
	
	static MySQLConnection mysqlconnection = new MySQLConnection();
	static StockConfig stockConfig = new StockConfig();
	
	
	Notebook notebook;
	
	
		
	public void addComputerToStock() throws SQLException {
		Statement stmt = mysqlconnection.addNotebookToStock().createStatement();
		ResultSet rsNotebook = stmt.executeQuery("select id, color, layout, monitorSizeInInches, macAdress from notebook");
		
		while (rsNotebook.next()) {
			int id = rsNotebook.getInt("id");
			String color = rsNotebook.getString("color");
			String layout = rsNotebook.getString("layout");
			int monitorSizeInInches = rsNotebook.getInt("monitorSizeInInches");
			String macAdress = rsNotebook.getString("macAdress");
			
			stockConfig.addNotebookToStock(id, color, layout, monitorSizeInInches, macAdress);
		}
		
		ResultSet rsPC = stmt.executeQuery("select id, ram, cpu, gpu, mainboard, psu, drives, macAdress from pc");
		
		while (rsPC.next()) {
			int id = rsPC.getInt("id");
			String ram = rsPC.getString("ram");
			String cpu = rsPC.getString("cpu");
			String gpu = rsPC.getString("gpu");
			String mainboard = rsPC.getString("mainboard");
			String psu = rsPC.getString("psu");
			String drives = rsPC.getString("drives");
			String macAdress = rsPC.getString("macAdress");
			
			stockConfig.addPCToStock(id, ram, cpu, gpu, mainboard, psu, drives, macAdress);
		}
	}
}
