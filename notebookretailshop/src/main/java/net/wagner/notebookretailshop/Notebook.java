package net.wagner.notebookretailshop;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter 
class Notebook {

	private int id;
	private String color;
	private String macAddress;
	private int monitorSizeInInches;
	private String layout;
	
@Builder
Notebook(int id, 
	int monitorSizeInInches,
	String color, 
	String layout,
	String macAddress) {
	this.id = id;
	this.color = color;
	this.monitorSizeInInches = monitorSizeInInches;
	this.macAddress = macAddress;
	this.layout = layout;
	}
}
