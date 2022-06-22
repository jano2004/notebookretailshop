package net.wagner.notebookretailshop;
import java.util.Scanner;

public class MainJava {
	
	
	static Data d = new Data();
	static Bestandcheck bc = new Bestandcheck();
	static GroesseVorhanden gv = new GroesseVorhanden();
	static int timepast = 0;
	
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		boolean bestandcheck = false;
		boolean groesseVorhanden = false;
		boolean removefrombestand = false;
		boolean bestandauffuellen = false;
		
		
		String JoN = "N";
		
		String input2 = "";
		int input2int = 0;
		int timeinseconds = 10;
		
		System.out.println("Möchtest du einen Schuh kaufen? J/N: ");
		String input1 = scanner.nextLine();
		
		
		//Bestandcheck ob ausreichend Ware vorhanden ist
		if(input1.contains("J") || input1.contains("j")) {
			bestandcheck = bc.Check();
		}
		else if(input1.contains("N") || input1.contains("n")) {
			bestandauffuellen = BestandAuffuellen(bestandauffuellen);
		}
		else {
			System.out.println("Gebe einen gültigen Buchstaben an!");
		}
		

		if(bestandauffuellen) {
			do {
					
			SchuhHinzufuegen();
			System.out.println("Möchtest du noch mehr Schuhe in den Bestand aufnehmen? J/N: ");
			JoN = scanner.nextLine();
				
			} while (JoN.contains("J") || JoN.contains("j"));
		}
			
			
			
			if(!bestandauffuellen) {
				if(bestandcheck = true) {
					Abrechnung(bestandcheck, input2, input2int, groesseVorhanden, removefrombestand);
					System.out.println("\nDer Bestand liegt bei " + d.bestandsliste.size() + " Schuhen");
				}
			}
			
			for(int i = 0; i < timeinseconds; i++) {
				System.out.flush();
				int t = ThreadSleep()/1000;
				String timecomplet = Timecalculator(t);
				System.out.flush();
				System.out.println("Der Schuh kann max. 10 Minuten reservieren sein: "+ timecomplet);
			}

			scanner.close();
	}
	
	

	
	static void Abrechnung(boolean bestandcheck, String input2, int input2int, boolean groesseVorhanden, boolean removefrombestand) {
		//Bestandcheck ob gewünschte Schuhgröße vorhanden ist
		
		if(bestandcheck) {
			System.out.println("Welche Schugröße möchtest du bestellen? ");
			
			input2 = scanner.nextLine();
			input2int = Integer.parseInt(input2);
			
			groesseVorhanden = gv.GroesseIstVorhanden(input2int);
		}
		
		
		
		//Aus Bestand entfernen
		if(groesseVorhanden) {
			for(int i = 0; i <= d.bestandsliste.size(); i++) {
				if(d.bestandsliste.get(i) == input2int) {
					d.bestandsliste.remove(i);
					i = d.bestandsliste.size();
					removefrombestand = true;
				}
			}
		}
		
		
		
		//Ausgabe ob Schuh bestellt werden konnte
		if(removefrombestand) {
			System.out.println("Dein Schuh mit der Schuhgroesse " + input2int + " wurde auf dich reserviert!");
		}
		else if(!removefrombestand) {
			System.out.println("Dein Schuh konnte nicht auf dich reserviert werden!");
		}
	}
	
	
	static boolean BestandAuffuellen(boolean bestandauffuellen) {
		System.out.println("Möchten sie stattdessen den Bestand auffüllen? J/N: ");
		String input3 = scanner.nextLine();
		
		if(input3.contains("J") || input3.contains("j")) {
			bestandauffuellen = true;
		}
		else if(input3.contains("N") || input3.contains("n")) {
			bestandauffuellen = false;
		}
		else {
			System.out.println("Gebe einen gültigen Buchstaben an!");
		}
		return bestandauffuellen;
	}


	static void SchuhHinzufuegen() {
		
		int groesse;
		int anzahl;
		
		System.out.println("Welche Groesse sollen die/soll der Schuh haben? ");
		groesse = (Integer.parseInt(scanner.nextLine()));
		
		System.out.println("Wie viele Schuhe mit dieser Groesse möchtest du hinzufügen? ");
		anzahl = (Integer.parseInt(scanner.nextLine()));
		
		for(int i = 0; i < anzahl; i++) {
			d.bestandsliste.add(groesse);
		}
	}


	static int ThreadSleep() throws InterruptedException {
			long start = System.currentTimeMillis();
		    Thread.sleep(1000);
		    timepast += System.currentTimeMillis()-start;   
		    return timepast;
	}


	static String Timecalculator(int t) {
		double time = t;
		int timemin = (int) (time/60);
		int timedec=(int) ((time/60-timemin)*60);
		if(timedec<10) {
		return("0"+timemin+":0"+timedec);
		}
		else {
			return("0"+timemin+":"+timedec);
		}
	}
} 
