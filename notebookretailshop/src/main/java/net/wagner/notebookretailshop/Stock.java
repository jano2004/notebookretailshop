package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private Stock instance;
	
	static PC pc;
	
	List<Computer> computers;
	
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
		computers.remove(computer);
	}
}
         