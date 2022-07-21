package net.wagner.notebookretailshop;
import lombok.Getter;
@Getter 
class Notebook extends Computer {
	

	private String color;
	private String layout;
	private int monitorSizeInInches;
	
Notebook(int id, 
	String color, 
	String layout,
	int monitorSizeInInches,
	String macAddress) {
	this.id = id;
	this.color = color;
	this.monitorSizeInInches = monitorSizeInInches;
	this.macAddress = macAddress;
	this.layout = layout;
	}
}
