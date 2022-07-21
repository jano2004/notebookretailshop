package net.wagner.notebookretailshop;
import java.sql.Statement;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter 
class Notebook extends Computer {
	
	private int id;
	private int monitorSizeInInches;
	private String layout;
	private String color;
	private String macAddress;
	
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
