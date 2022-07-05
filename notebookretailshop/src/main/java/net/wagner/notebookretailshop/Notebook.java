package net.wagner.notebookretailshop;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter 
class Notebook {
	static MainJava mj = new MainJava();

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

	public void setId(int id) {
		this.id = mj.id;
	}
	
	public void setColor(String color) {
		this.color = mj.color;
	}
	
	public void setMacAddress(String macAddress) {
		this.macAddress = mj.macAddress;
	}
	
	public void setMonitorSizeInInches(int monitorSizeInInches) {
		this.monitorSizeInInches = mj.monitorSizeInInches;
	}
	
	public void setLayout(String layout) {
		this.layout = mj.layout;
	}
}
