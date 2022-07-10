package net.wagner.notebookretailshop;

public class PC {
	private String ram;
	private String cpu;
	private String gpu;
	private String mainboard;
	private String psu;
	private String drives;
	
	PC(int id, 
		String ram,
		String cpu, 
		String gpu,
		String mainboard,
		String psu,
		String drives) {
		
		this.ram = ram;
		this.cpu = cpu;
		this.gpu = gpu;
		this.mainboard = mainboard;
		this.psu = psu;
		this.drives = drives;
	}
}
