package net.wagner.notebookretailshop;
import java.util.List;

public class StockConfig {	
	
	static Stock st = new Stock();

	
	public void addNotebookToStock() {
		var stock = st.getInstance();
			for (int i = 0; i < 10; i++) {
				Notebook nb = new Notebook(1, 15, "red", "DE", "macAdress");
				st.addNotebook(nb); 
			}
	}
	
	public void addPCToStock() {
		var stock = st.getInstance();
		for(int i = 0; i < 10; i++) {
			PC pc = new PC(1, "16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD");
			stock.addPC(pc);
		}
	}
}
