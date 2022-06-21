package net.wagner.notebookretailshop;

public class Bestandcheck {
	Data d = new Data();
	private int bestand = d.bestandsliste.size();
	
	public boolean Check() {
		if (bestand > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}