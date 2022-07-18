package net.wagner.notebookretailshop;

public class StockConfig {	
	
	static Stock stock = Stock.getInstance();
	
	public void addNotebookToStock() {
			for (int i = 0; i < 10; i++) {
				Notebook nb = new Notebook(1, 15, "red", "DE", "macAdress");
				stock.addComputer(nb); 
			}
	}
	
	public void addPCToStock() {
		for(int i = 11; i < 21; i++) {
			PC pc = new PC(2, "16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD");
			stock.addComputer(pc);
		}
	}
}
