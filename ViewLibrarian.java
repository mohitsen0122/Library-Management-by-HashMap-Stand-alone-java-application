package com.lirarymanagmenet;


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
import javax.swing.table.JTableHeader;

public class ViewLibrarian implements ActionListener
{
	LibrarianDetails libDetails;
	static HashMap<String ,LibrarianEmployee> map ;
	
	JButton buttonBack;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JTable tableView;
	JTableHeader tableHeader;
	JScrollPane scroller;
	public ViewLibrarian()
	{
		firstFrame();
	}
	public void firstFrame() 
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		label = new JLabel();
		libDetails = new LibrarianDetails();
		map = libDetails.takeAddressHashMap();
		tableView = new JTable(map.size(), 6);
		scroller = new JScrollPane(tableView);
		
		frame.getContentPane();
		
		tableView.setBounds(10,10,470,180);
		tableView.setVisible(true);
		int row = 0;
		
		System.out.println(map);
		String colname[]; 
		for(Entry<String , LibrarianEmployee> objValues :   map.entrySet()) 
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
		panel.add(label);
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
//		libDetails = new LibrarianDetails();
		//map = libDetails.takeAddressHashMap();
		
		new AdminSection();
		frame.dispose();
		/*
		 * for(Map.Entry<String, LibrarianEmployee> entry : map.entrySet()) {
		 * tableView.setValueAt(entry.getKey(), row,0); row++; }
		 */
	}
}
