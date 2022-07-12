package net.wagner.notebookretailshop;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Data;

public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static Stock st = new Stock();
	static Random rndm = new Random();
	static StockConfig stc = new StockConfig();

	public static void main(String[] args) {
		
		System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");
		
		if(scanner.nextLine().contains("nb")) {
			stc.AddNotebookToStock();
		}
		if (scanner.nextLine().contains("pc")) {
			stc.AddPCToStock();
		}
			
		System.out.println("Der Bestand liegt bei " + " Notebooks and " + "PCs!");
	}
} 
