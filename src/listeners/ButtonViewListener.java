package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import gui.NewsViewer;
import gui.WindowFrame;


public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		NewsViewer viewer = frame.getNewsviewer();
		frame.setupPanel(viewer);

	}

}
