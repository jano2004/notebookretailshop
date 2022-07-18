package net.wagner.notebookretailshop;

import java.time.LocalDateTime;

public class Order {
	
	static Stock stock = Stock.getInstance();
	
	private static LocalDateTime datetime;
	private Computer oredertItem;
	
	@SuppressWarnings("unlikely-arg-type")
	public String askForNotebookInStock(int monitorsizeInInches, String color, String layout, String macAdress) {
		Notebook notebookToFind = new Notebook(0, monitorsizeInInches, color, layout, macAdress);
		if(stock.computers.equals(notebookToFind)) {
			stock.removeNotebookFromStock(notebookToFind);
		}
		return ("Your Notebook with color " + color + ", size " + monitorsizeInInches + " and layout " + layout + " was reserved for you on " + datetime + " !");
	}
	@SuppressWarnings("unlikely-arg-type")
	public String askForPCInStock(String ram, String cpu, String gpu, String mainboard, String psu, String storrage) {
		PC pcToFind = new PC(0, ram, cpu, gpu, mainboard, psu, storrage);
		if(stock.computers.equals(pcToFind)) {
			stock.removePCFromStock(pcToFind);
		}
		return ("Your PC with " + ram + ", a " + cpu + " and a " + gpu + " on  a "+ mainboard +  " and  a " + storrage + "was reserved for you on " + datetime + " !");
	}
}
