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
	static FillUpStock fillUpStock = new FillUpStock(stockConfig);

	public static void main(String[] args) throws SQLException {
		String runThroughAgain;
		fillUpStock.addComputerToStock();

		do {


			System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");

			String whickTypeOfComputer = scanner.nextLine();

			if (whickTypeOfComputer.contains("nb")) {
				order = new Order();

				System.out.println("Which color would you like to order?");
				String color = scanner.nextLine();
				System.out.println("Which layout would you like to order?");
				String layout = scanner.nextLine();
				System.out.println("Which size would you like to order?");
				int monitorSizeInInches = Integer.parseInt(scanner.nextLine());
				order.getInstanceOfNotebook(color, layout, monitorSizeInInches);
			}

			else if (whickTypeOfComputer.contains("pc")) {
				order = new Order();
				System.out.println("Which size of RAM would you to have like in your pc?");
				String ram = scanner.nextLine();
				System.out.println("Which CPU would you like in to have your pc?");
				String cpu = scanner.nextLine();
				System.out.println("Which GPU would you like in to have your pc?");
				String gpu = scanner.nextLine();
				System.out.println("Which mainboard would you like to have in your pc?");
				String mainboard = scanner.nextLine();
				System.out.println("Which powersuplyunit would you like to have in your pc?");
				String psu = scanner.nextLine();
				System.out.println("Which storagedrive would you like to have in your pc?");
				String drives = scanner.nextLine();
				order.getInstanceOfPC(ram, cpu, gpu, mainboard, psu, drives);
			} else {
				System.out.println("Error");
			}

			System.out.println("The stock: " + stock.computers.size());

			System.out.println("Would you like to order an other notebook or pc? Y/N: ");
			runThroughAgain = scanner.nextLine();



		} while (runThroughAgain != "Y");
		scanner.close();
	}
}
