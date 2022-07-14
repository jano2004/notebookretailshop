package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private Stock instance;
	
	static Notebook notebook;
	
	static PC pc;
	
	List<Computer> computers;
	
	private Stock() {
		computers = new ArrayList<>();
	}
	
	public Stock getInstance() {
		if(this.instance == null) {
			this.instance = new Stock();
		}
		return this.instance;
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
	
	void removeNotebookFromStock() {
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i) == (notebook = new Notebook(1, 15, "red", "DE", "macAdress"))) {
				computers.remove(i);
				i = computers.size();
			}
		}
	}
	
	void removePCFromStock() {
		for (int i = 0; i < computers.size(); i++) {
			if (computers.get(i) == (pc = new PC(2, "16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD"))) {
				computers.remove(i);
				i = computers.size();
			}
		}
	}
}
         