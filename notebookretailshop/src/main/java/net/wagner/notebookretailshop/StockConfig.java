package net.wagner.notebookretailshop;

public class StockConfig {	
	
	Stock st;
	
	public void addNotebookToStock() {
		var stock = st.getInstance();
			for (int i = 0; i < 10; i++) {
				Notebook nb = new Notebook(1, 15, "red", "DE", "macAdress");
				st.addComputer(nb); 
			}
	}
	
	public void addPCToStock() {
		var stock = st.getInstance();
		for(int i = 11; i < 21; i++) {
			PC pc = new PC(2, "16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD");
			st.addComputer(pc);
		}
	}
}
