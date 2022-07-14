package net.wagner.notebookretailshop;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Data;


public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static Stock st;
	static Random rndm = new Random();
	static StockConfig stc = new StockConfig();
	static Notebook notebook;

	public static void main(String[] args) {
		
		stc.addNotebookToStock();
		stc.addPCToStock();
		
		System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");
		
		
		if(scanner.nextLine().contains("nb")) {
			st.removeNotebookFromStock();
		}
		
		if (scanner.nextLine().contains("pc")) {
			st.removePCFromStock();
		}	
		
		System.out.println("Der Bestand liegt bei " + " Notebooks and " + "PCs!");
	}
} 
