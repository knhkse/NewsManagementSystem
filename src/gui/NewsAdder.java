package gui;

import javax.swing.*;

public class NewsAdder extends JFrame{
	
	public NewsAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Number: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelNum.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelNum.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelCat = new JLabel("Category: ", JLabel.TRAILING);
		JTextField fieldCat = new JTextField(10);
		labelNum.setLabelFor(fieldCat);
		panel.add(labelCat);
		panel.add(fieldCat);
		
		JLabel labelLink = new JLabel("Link Address: ", JLabel.TRAILING);
		JTextField fieldLink = new JTextField(10);
		labelNum.setLabelFor(fieldLink);
		panel.add(labelLink);
		panel.add(fieldLink);
		
		JCheckBox checkFav = new JCheckBox("", false);
		JLabel labelFav = new JLabel("Set Favorite", JLabel.TRAILING);
		panel.add(labelFav);
		panel.add(checkFav);
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
