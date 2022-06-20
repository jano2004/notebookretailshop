package net.wagner.notebookretailshop;
import java.util.Scanner;

public class MainJava {
	static int bestand;
	static boolean bestellung;
	public static void main(String[] args) {
		Data d1 = new Data();
		bestand = d1.groesse.size(); 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bestand: " + bestand + "\nMöchtest du einen Schuh bestellen? J/N: " );

		String input = in.nextLine();
		in.close();
		
		if(input.contains("J")){
			System.out.println("Welche Schuhgroesse möchtest du bestellen: ");
		}
		else if(input.contains("N")) {
			System.out.println("O.K.");
		}
	}
}
