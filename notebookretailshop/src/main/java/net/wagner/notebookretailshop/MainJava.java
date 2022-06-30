package net.wagner.notebookretailshop;
import java.util.Scanner;

public class MainJava {
	
	static Notebook nb = new Notebook();
	static Scanner scanner = new Scanner(System.in);
	static NotebookConfig nbc = new NotebookConfig();
	static Stock st = new Stock();
	static StockConfig stc = new StockConfig();
	static String notebookColor = null;
	static String notebookLayout = null;
	static int notebookSize = 0;
	static String fillUpStock = null;
	static int fillUpStockAmount = 0;
	static boolean fillUpStockOrBuyShoe = false;
	
	public static void main(String[] args) {
		
		System.out.println("would you like to order a shoe or do you want to fill up the stock");
		fillUpStock = scanner.nextLine();	
		
		FillUpStockOrBuyShoe(fillUpStock);
		
		scanner.close();
		
		CheckOutMessage(notebookColor, notebookSize, notebookLayout);
	}
	
	public static String NotebookColor() {
		String scanner_input = scanner.nextLine(); 
		String output = null;
		System.out.println();
		for(int i = 0; i < 5; i++) {
			if(nbc.color[i] == scanner_input) {
				output = scanner_input;
			}
			else {
				output = null;
			}
		}
		return output;
	}
	
	public static int NotebookSize() {
		int scanner_input = Integer.parseInt(scanner.nextLine()); 
		System.out.println();
		int output = 0;
		System.out.println();
		for(int i = 0; i < 4; i++) {
			if(nbc.inch[i] == scanner_input) {
				output = scanner_input;
			}
			else {
				output = 0;
			}
		}
		return output;
	}
	
	public static String NotebookLayout() {
		String scanner_input = scanner.nextLine(); 
		System.out.println();
		String output = null;
		System.out.println();
		for(int i = 0; i < 4; i++) {
			if(nbc.layout[i] == scanner_input) {
				output = scanner_input;
			}
			else {
				output = null;
			}
		}
		return output;
	}
	
	public static void CheckOutMessage(String notebookColor, int notebookSize, String notebookLayout) {
		if(notebookColor != null && notebookSize != 0 && notebookLayout != null) {
			System.out.println("your notebook in color " + notebookColor
			+ " and the monitorsize of " + notebookSize
			+ " is reserved to you with the layout" + notebookLayout);
			st.stock.remove(0);
		}
	}
	
	public static void FillUpStockOrBuyShoe(String fillUpStock) {
		if(fillUpStock.contains("J") || fillUpStock.contains("j")) {
			System.out.println("what color should the laptop be? blue/red/black/silver:");
			notebookColor = NotebookColor();
			
			System.out.println("what size should the laptop be? 12 Zoll/13 Zoll/14 Zoll/15 Zoll/16 Zoll");
			notebookSize = NotebookSize();
			
			System.out.println("what layout would you like to use? DE/EN:");
			notebookLayout = NotebookLayout();
		}
		
		else if(fillUpStock.contains("N") || fillUpStock.contains("n")) {
			System.out.println("how many notebooks do you wnat to add to the stock?");
			fillUpStockAmount = Integer.parseInt(scanner.nextLine());
		}
	}
} 
