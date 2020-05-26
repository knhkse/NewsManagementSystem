package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NewsViewer extends JFrame{
	
	public NewsViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("TITLE");
		model.addColumn("DATE");
		model.addColumn("CATEGORY");
		model.addColumn("LINK ADDRESS");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
