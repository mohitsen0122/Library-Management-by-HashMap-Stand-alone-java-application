package com.lirarymanagmenet;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewBook extends LibrarianDetails implements ActionListener	
{
	BookDetails bookDetails;
	static HashMap<String ,BookSeperately> map ;
	
	JButton buttonBack;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	JTable tableView;
	JScrollPane scroller;
	public ViewBook()
	{
		firstFrame();
	}
	public void firstFrame() 
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		labelTitle = new JLabel("View Book");
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
		labelTitle.setBounds(200 ,-2,100, 40);
		labelTitle.setVisible(true);
		
		bookDetails = new BookDetails();
		map = bookDetails.takeAddressOfBookHash();
		
		tableView = new JTable(map.size(), 6);
		scroller = new JScrollPane(tableView);
		
		frame.getContentPane();
		
		tableView.setBounds(10,10,470,180);
		tableView.setVisible(true);
		int row = 0;
		
		System.out.println(map);
		String colname[]; 
		for(Entry<String , BookSeperately> objValues :   map.entrySet()) 
		{ 
			String values = objValues.getValue().toString();
			colname = values.split(" ");
			System.out.println(colname.length);
			for(int i = 0; i < colname.length ; i++)
			{
				System.out.println(colname[i]);
				tableView.setValueAt(colname[i], row, i);  
			} 
			  row++;
			  
		}
		
		frame.getContentPane();
		
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(170, 220, 200, 30);
		
		
		
		panel.add(tableView);
		panel.setLayout(null);
		panel.add(labelTitle);
		panel.add(buttonBack);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		buttonBack.addActionListener(this);
		
		
		frame.add(panel);
		frame.setLocation(500, 200);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
	}
		protected void setTableView()
		{
			
			
		}
		public void actionPerformed(ActionEvent ev)
		{
//			libDetails = new LibrarianDetails();
			//map = libDetails.takeAddressHashMap();
			
			new LibrarianSection();
			frame.dispose();
			/*
			 * for(Map.Entry<String, LibrarianEmployee> entry : map.entrySet()) {
			 * tableView.setValueAt(entry.getKey(), row,0); row++; }
			 */
		}
}
