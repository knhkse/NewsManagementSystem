package gui;

import javax.swing.JFrame;
import javax.swing.*;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	NewsAdder newsadder;
	NewsViewer newsviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.newsadder = new NewsAdder(this);
		this.newsviewer = new NewsViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


		this.setupPanel(menuselection);
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public NewsAdder getNewsadder() {
		return newsadder;
	}

	public void setNewsadder(NewsAdder newsadder) {
		this.newsadder = newsadder;
	}

	public NewsViewer getNewsviewer() {
		return newsviewer;
	}

	public void setNewsviewer(NewsViewer newsviewer) {
		this.newsviewer = newsviewer;
	}

}
