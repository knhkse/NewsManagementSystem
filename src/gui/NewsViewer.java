package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NewsViewer extends JPanel{
	
	WindowFrame frame;
	
	public NewsViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("TITLE");
		model.addColumn("DATE");
		model.addColumn("CATEGORY");
		model.addColumn("LINK ADDRESS");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
