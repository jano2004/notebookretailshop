package net.wagner.notebookretailshop;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private static Stock instance;
	
	static Notebook notebook;
	
	static PC pc;
	
	List<Computer> computers;
	
	private Stock() {
		computers = new ArrayList<>();
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
	
	void removeNotebookFromStock(Computer notebookToFind) {
			computers.remove(notebookToFind);
	}
	
	void removePCFromStock(Computer pcToFind) {
			computers.remove(pcToFind);
	}
}
         