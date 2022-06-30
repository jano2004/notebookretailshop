package net.wagner.notebookretailshop;

public class StockConfig {
	static Stock st = new Stock();
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
		{
			st.stock.add(0);
		}
	}	
}
