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

public class ViewIssueBooks implements ActionListener
{
	BookDetails detailsBook;
	StudentsDetails studentDetails;
	static HashMap<String ,StudentSeperately> map ;
	static HashMap<String, BookSeperately> bookMap;
	
	JButton buttonBack;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	JTable tableView, table2;
	JScrollPane scroller;
	public ViewIssueBooks()
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
		
		studentDetails = new StudentsDetails();
		map = studentDetails.takeAddressStudentDetails();
		
		detailsBook = new BookDetails();
		bookMap = detailsBook.takeAddressOfBookHash();
		
		
		System.out.println("OKKKKKKKKKKKKKK "+ bookMap.keySet().toString());
		tableView = new JTable(map.size(), 4);
		table2= new JTable(bookMap.size(), 5);
		scroller = new JScrollPane(tableView);
		
		frame.getContentPane();
		
		table2.setBounds(10,10,270,180);
		table2.setVisible(true);
		
		tableView.setBounds(280,10,220,180);
		tableView.setVisible(true);
		
		int ro = 0;
		String colnam[]; 
		
		/*
		for(Entry<String , BookSeperately> objValues :   bookMap.entrySet()) 
		{ 
			
			String values = objValues.getValue().toString();
			colnam = values.split(" ");
			System.out.println(colnam.length);
		
			for(int i = 0; i < colnam.length ; i++)
			{	
				System.out.println(colnam[i]);
				table2.setValueAt(colnam[i], ro, i);
			}
			  ro++;
			  
		}
		
		*/
		
		int row = 0;
		String colname[]; 
		for(Entry<String , StudentSeperately> objValues :   map.entrySet()) 
		{ 
			String values = objValues.getValue().toString();
			String keyValue = objValues.getKey().toString();
			// 2ND LOOP 
			
			for(Entry<String , BookSeperately> objValuess :   bookMap.entrySet()) 
			{ 
				
				String valuess = objValuess.getValue().toString();
				colnam = valuess.split(" ");
				String keyValuess = objValuess.getKey().toString();
				
				
				
					System.out.println(" My values checking 2 "+keyValue);
				
				
					colname = values.split(" ");
					System.out.println(colname.length);
		
			
					for(int i = 0; i < colname.length ; i++)
					{	
						if(keyValue.equals(keyValuess)) 
						{
							System.out.println(colname[i]);
							tableView.setValueAt(colname[i], row, i);
						}
					}
					
					
					colnam = values.split(" ");
					System.out.println(colnam.length);
				
					for(int i = 0; i < colnam.length ; i++)
					{	if(keyValue.equals(keyValuess)) 
						{
							System.out.println(colnam[i]);
							table2.setValueAt(colnam[i], ro, i);
						}
					}
					 
					  
					  
				}
				ro++;
				row++;
			  
		}
		
		
		frame.getContentPane();
		
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(170, 220, 200, 30);
		
		
		
		panel.add(tableView);
		panel.add(table2);
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
		new LibrarianSection();
		frame.dispose();	
	}
}
