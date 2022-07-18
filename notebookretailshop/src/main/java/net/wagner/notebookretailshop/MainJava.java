package net.wagner.notebookretailshop;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Data;


public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static Stock stock = Stock.getInstance();
	static Random rndm = new Random();
	static StockConfig stockConfig = new StockConfig();
	static Notebook notebook;
	static Order order;
	
	public static void main(String[] args) {
		
		stockConfig.addNotebookToStock();
		stockConfig.addPCToStock();
		
		System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");
		
		if(scanner.nextLine().contains("nb")) {
			order = new Order();
			order.askForNotebookInStock(15, "red", "DE", "macAdress");
		}
		
		else if (scanner.nextLine().contains("pc")) {
			order = new Order();
			order.askForPCInStock("16GB", "AMD", "Nvidia", "Asus", "beQuiet", "SSD");
		}	
		else {
			System.out.println("Error");
		}
		
		System.out.println("The stock: " + stock.computers.size());
		
		scanner.close();
	}
} 
