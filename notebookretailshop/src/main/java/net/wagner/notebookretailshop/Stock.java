package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private Stock instance;
	
	static PC pc;
	
	private List<Computer> computers;
	
	Stock() {
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
		for (int i = 0; i < getStockSize(); i++){
			if (computers.get(i) == computer) {
				computers.remove(computer);
				i = getStockSize();
			}
		}
	}
}
         