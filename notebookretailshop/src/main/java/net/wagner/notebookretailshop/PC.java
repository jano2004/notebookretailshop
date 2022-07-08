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
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getMainborad() {
		return mainboard;
	}
	public void setMainborad(String mainborad) {
		this.mainboard = mainborad;
	}
	public String getPsu() {
		return psu;
	}
	public void setPsu(String psu) {
		this.psu = psu;
	}
	public String getDrives() {
		return drives;
	}
	public void setDrives(String drives) {
		this.drives = drives;
	}
	
	
}
