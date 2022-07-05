package net.wagner.notebookretailshop;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import lombok.Data;

public class MainJava {
	
	static Scanner scanner = new Scanner(System.in);
	static int id;
	static int monitorSizeInInches;
	static String color;
	static String layout;
	static String macAddress;
	static Random rndm = new Random();
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Would you like to order a Notebook? J/N: ");
		if(scanner.nextLine().contains("J") || scanner.nextLine().contains("j")) {
			System.out.println("Wich color would you like to order?");
			color = scanner.nextLine();
			System.out.println("Wich size should it be?");
			monitorSizeInInches =  Integer. parseInt(scanner.nextLine());
			System.out.println("Which layout would you like to use? DE/EN: ");
			layout = scanner.nextLine();
			id = rndm.nextInt();
		}
	}
} 
