package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private Stock instance;
	
	static Notebook notebook;
	
	static PC pc;
	
	private static List<Computer> computers;
	
	public Stock() {
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
	
	void addAll(List<Computer>computers) {
		computers.addAll(computers);
	}
	
	public int getStockSize() {
		return computers.size();
	}
	
	void removeNotebook() {
		for (int i = 0; i < getStockSize(); i++){
			if (computers.get(i) == notebook) {
				computers.remove(i);
				i = getStockSize();
			}
		}
	}
	
	void removePC() {
		for (int i = 0; i < getStockSize(); i++){
			if (computers.get(i) == pc) {
				computers.remove(i);
				i = getStockSize();
			}
		}
	}
}
         