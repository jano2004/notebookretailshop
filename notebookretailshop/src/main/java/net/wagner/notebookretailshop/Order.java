package net.wagner.notebookretailshop;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class Order {

	static Stock stock = Stock.getInstance();
	static Computer computer;
	LocalDateTime datetime;
	
	public void getInstanceOfNotebook(String color, String layout, int monitorSizeInInches) throws SQLException {
		for (int i = 0; i < stock.computers.size(); i++) {
			if (!stock.computers.isEmpty() && stock.computers.get(i) instanceof Notebook notebook) {
				if (notebook.getColor().equals(color) && notebook.getLayout().equals(layout)
						&& notebook.getMonitorSizeInInches() == monitorSizeInInches) {
					stock.removeNotebookFromStock(notebook);
					System.out.println("Your notebook is ordert! " + datetime);
					break;
				}
			}
		}
	}

	public void getInstanceOfPC(String ram, String cpu, String gpu, String mainboard, String psu, String drives) throws SQLException {
		for (int i = 0; i < stock.computers.size(); i++) {
			if (!stock.computers.isEmpty() && stock.computers.get(i) instanceof PC pc) {
				if (pc.getCpu().equals(cpu) && pc.getDrives().equals(drives) && pc.getGpu().equals(gpu)
						&& pc.getMainboard().equals(mainboard) && pc.getPsu().equals(psu) && pc.getRam().equals(ram)) {
					stock.removePCFromStock(pc);
					System.out.println("Your PC is ordert! " + datetime);
					break;
				}
			}
		}
	}
}
