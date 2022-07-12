package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private Stock instance;
	
	private static List<Computer> computers;
	
	public Stock() {
		this.computers = new ArrayList<>();
	}
	
	public Stock getInstance() {
		if(this.instance == null) {
			this.instance = new Stock();
		}
		return this.instance;
	}
	
	void addNotebook(Notebook nb) {
		computers.add(nb);
	}
	
	void addPC(PC pc) {
		computers.add(pc);
	}
	
	void addAll(List<Computer>computers) {
		this.computers.addAll(computers);
	}
	
	public int getStockSize() {
		return this.computers.size();
	}
}
