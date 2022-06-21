package net.wagner.notebookretailshop;
import java.util.Scanner;

public class MainJava {
	static int bestand;
	static boolean bestellung = false;
	static String groesse;
	
	
	public static void main(String[] args) {
		Data d = new Data();
		int bestand = d.groesse.size();
		boolean moeglich = Bestellungmoeglich(bestand);
		boolean janein = Bestellungjanein(moeglich);
		int groessevorhanden = Groessevorhanden(janein);
		Removegroesse(groessevorhanden);
		
	}
	public static boolean Bestellungmoeglich(int bestand) {
		if(bestand > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static boolean Bestellungjanein(boolean moeglich) {
		if(moeglich) {
			Scanner input = new Scanner(System.in);
			System.out.println("Möchtest du einen Schuh bestellen? J/N:");
			String janein = input.next();
			input.close();
			if(janein.contains("J")) {
				moeglich = true;
			}
			else if(janein.contains("N")) {
				moeglich = false;
			}
			else {
				moeglich = false;
			}
		}
		return moeglich;
	}
	
	
	public static int Groessevorhanden(boolean janein) {
		Data d = new Data();
		int groesse = 0;
		if(janein) {
			Scanner input = new Scanner(System.in);
			System.out.println("Möchtest du einen Schuh bestellen? J/N:");
			groesse = input.nextInt();
			input.close();
				if(!d.groesse.contains(groesse)) {
					groesse = 0;
				}
		}
		return groesse;
	}
	
	
	public static void Removegroesse(int groessevorhanden) {
		Data d = new Data();
		for(int i = 0; i < d.groesse.size(); i++) {
			if(d.groesse.get(i) == groessevorhanden) {
				d.groesse.remove(i);
				i = d.groesse.size();
			}
		}
	}
	
}
