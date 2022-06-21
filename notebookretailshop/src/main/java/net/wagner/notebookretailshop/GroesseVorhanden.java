package net.wagner.notebookretailshop;

public class GroesseVorhanden {
	Data d = new Data();
	
	public boolean GroesseIstVorhanden(int input) {
		if(d.bestandsliste.contains(input)) {
			return true;
		}
		else {
			return false;
		}
	}
}

