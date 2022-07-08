package net.wagner.notebookretailshop;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Data;

public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static Stock st = new Stock();
	static Random rndm = new Random();
	
	
	static int id = 0;
	static int monitorSizeInInches = 0;
	static String color = null;
	static String layout = null;
	static String macAddress = null;
	static Notebook nb;
	
	static String ram;
	static String cpu;
	static String gpu;
	static String mainboard;
	static String psu;
	static String drives;
	static PC pc;
	
	
	public static void main(String[] args) {
		
		System.out.print("Would you like to order a PC(pc) or a notebook(nb)? ");
		if(scanner.nextLine().contains("nb")) {
			System.out.println("Wich color would you like to order?");
			color = scanner.nextLine();
			System.out.println("Wich size should it be?");
			monitorSizeInInches =  Integer. parseInt(scanner.nextLine());
			System.out.println("Which layout would you like to use? DE/EN: ");
			layout = scanner.nextLine(); 	
			id = rndm.nextInt();
				
			nb = new Notebook(id, monitorSizeInInches, color, layout, macAddress);
		}
		
		
		if (scanner.nextLine().contains("pc")) {
			System.out.println("Which size of RAM would you like to have?");
			ram = scanner.nextLine();
			System.out.println("Which CPU would you like to use?");
			cpu = scanner.nextLine();
			System.out.println("Which GPU would you like to use?");
			gpu = scanner.nextLine();
			System.out.println("Which mainboard would you like to have?");
			mainboard = scanner.nextLine();
			System.out.println("Which powersuplyunit would you like to have?");
			psu = scanner.nextLine();
			System.out.println("Which drive-size would you like to have?");
			drives = scanner.nextLine();
			
			pc = new PC(id, ram, cpu, gpu, mainboard, psu, drives);
		}
		System.out.println("Der Bestand liegt bei " + st.getNotebooks() + "!");
		
	}
} 
