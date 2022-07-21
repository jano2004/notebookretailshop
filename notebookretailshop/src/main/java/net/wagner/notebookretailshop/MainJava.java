package net.wagner.notebookretailshop;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;


public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static Stock stock = Stock.getInstance();
	static Random rndm = new Random();
	static StockConfig stockConfig = new StockConfig();
	static Notebook notebook;
	static Order order;
	static MySQLConnection connection = new MySQLConnection();
	static FillUpStock fillUpStock = new FillUpStock();
	
	public static void main(String[] args) throws SQLException {	
		
		fillUpStock.addComputerToStock();
		
		System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");
		
		if(scanner.nextLine().contains("nb")) {
			order = new Order();
		}
		
		else if (scanner.nextLine().contains("pc")) {
			order = new Order();
		}	
		else {
			System.out.println("Error");
		}
		
		System.out.println("The stock: " + stock.computers.size());
		
		scanner.close();
	}
} 
