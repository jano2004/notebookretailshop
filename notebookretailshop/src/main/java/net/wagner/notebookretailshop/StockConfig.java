package net.wagner.notebookretailshop;

import java.sql.Statement;

public class StockConfig {

	static Stock stock = Stock.getInstance();

	public void addNotebookToStock(int id, String color, String layout, int monitorSizeInInches, String macAdress) {
		Notebook notebook = new Notebook(id, monitorSizeInInches, layout, color, macAdress);
		stock.addComputer(notebook);
	}

	public void addPCToStock(int id, String ram, String cpu, String gpu, String mainboard,
			String psu, String drives, String macAdress) {
		PC pc = new PC(id, ram, cpu, gpu, mainboard, psu, drives, macAdress);
		stock.addComputer(pc);
	}
}
