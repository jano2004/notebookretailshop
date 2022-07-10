package net.wagner.notebookretailshop;

public class StockConfig {	
	public void AddNotebookToStock(){
		for(int i = 0; i < 10; i++) {
			Notebook nb = new Notebook(1, 14, "blue", "DE", "macAdress");
			}
		}
	public void AddPCToStock() {
		for (int i = 0; i < 10; i++) {
			PC pc = new PC(1, "16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD");
		}
	}
}
