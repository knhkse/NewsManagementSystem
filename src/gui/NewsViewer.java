package gui;

import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import News.NewsInput;
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
		
		for (int i=0; i<newsManager.size(); i++) {
			Vector row = new Vector();
			NewsInput ni = newsManager.get(i);
			row.add(ni.getNum());
			row.add(ni.getTitle());
			row.add(ni.getDate());
			row.add(ni.getCat());
			row.add(ni.getLink());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
