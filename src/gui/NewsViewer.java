package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import manager.NewsManager;

public class NewsViewer extends JPanel{
	
	WindowFrame frame;
	
	NewsManager newsManager;
	
	public NewsViewer(WindowFrame frame, NewsManager newsManager) {
		this.frame = frame;
		this.newsManager = newsManager;
		
		//System.out.println("***"+newsManager.size()+"***");
		
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
