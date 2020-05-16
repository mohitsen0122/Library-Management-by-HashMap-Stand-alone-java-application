package com.lirarymanagmenet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminSection implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	
	LibrarianDetails libDetails;
	static HashMap<String ,LibrarianEmployee> map ;
	
	JButton addLibrarian, viewLibrarian, deleteLibrarian, logout;
	public AdminSection()
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		labelTitle = new JLabel("Admin Section");
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
		labelTitle.setBounds(200 ,-2,100, 40);
		labelTitle.setVisible(true);
		
		frame.getContentPane();
		
		
		addLibrarian = new JButton("Add Librarian");
		addLibrarian.setBounds(170, 50, 200, 30);
		
		viewLibrarian = new JButton("View Librarian");
		viewLibrarian.setBounds(170, 90, 200, 30);
		
		deleteLibrarian = new JButton("Deleted Librarian");
		deleteLibrarian.setBounds(170, 130, 200, 30);
		
		logout = new JButton("Logout");
		logout.setBounds(170, 170, 200, 30);
		
		
		panel.setLayout(null);
	
		panel.add(labelTitle);
		panel.add(addLibrarian);
		panel.add(viewLibrarian);
		panel.add(deleteLibrarian);
		panel.add(logout);
		
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
		addLibrarian.addActionListener(this);
		viewLibrarian.addActionListener(this);
		deleteLibrarian.addActionListener(this);
		logout.addActionListener(this);
		
		frame.add(panel);
		frame.setLocation(500, 200);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == addLibrarian) {
			new AddLibrarian();
			frame.dispose();
		}
		else if(e.getSource() == viewLibrarian) {

			libDetails = new LibrarianDetails();
			map = libDetails.takeAddressHashMap();
			if(map != null)
			{
				new ViewLibrarian();
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No Librarian Added Yet");	 
			}
		}
		else if(e.getSource() == deleteLibrarian) {
			new DeleteLibrarian();
			frame.dispose();
		}
		else if(e.getSource() == logout) {
			new UserLogin();
			frame.dispose();
		}
	}
	
	
	public static void main(String[] args) 
	{
		
	}
}
