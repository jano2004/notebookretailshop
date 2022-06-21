package net.wagner.notebookretailshop;
import java.util.Scanner;

public class MainJava {
	public static void main(String[] args) {
		
		
		Data d = new Data();
		Bestandcheck bc = new Bestandcheck();
		GroesseVorhanden gv = new GroesseVorhanden();
		RemoveFromBestand rfb = new RemoveFromBestand();
		
		boolean bestandcheck = false;
		boolean groesseVorhanden = false;
		boolean removefrombestand = false;
		
		String input2 = "";
		int input21 = 0;
		
		System.out.println("Möchtest du einen Schuh kaufen? J/N: ");
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		
		
		
		//Bestandcheck ob ausreichend Ware vorhanden ist
		if(input1.contains("J")) {
			bestandcheck = bc.Check();
		}
		else if(input1.contains("N")) {
			System.out.println("O.K., aufwiedersehen");
		}
		else {
			System.out.println("Gebe einen gültigen Buchstaben an!");
		}
		
		
		
		//Bestandcheck ob gewünschte Schuhgröße vorhanden ist
		if(bestandcheck) {
			System.out.println("Welche Schugröße möchtest du bestellen? ");
			
			input2 = scanner.nextLine();
			input21 = Integer.parseInt(input2);
			
			groesseVorhanden = gv.GroesseIstVorhanden(input21);
		}
		
		
		
		//Aus Bestand entfernen
		for(int i = 0; i <= d.bestandsliste.size(); i++) {
			if(d.bestandsliste.get(i) == input21) {
				d.bestandsliste.remove(i);
				i = d.bestandsliste.size();
				removefrombestand = true;
			}
		}
		
		
		
		//Ausgabe ob Schuh bestellt werden konnte
		if(removefrombestand) {
			System.out.println("Dein Schuh mit der Schuhgroesse " + input21 + " wurde auf dich reserviert!");
		}
		else if(!removefrombestand) {
			System.out.println("Dein Schuh konnte nicht auf dich reserviert werden!");
		}
		scanner.close();
		
		
		
		System.out.println("\n" + d.bestandsliste.size());
	}
}

