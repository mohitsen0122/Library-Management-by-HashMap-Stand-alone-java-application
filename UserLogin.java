package com.lirarymanagmenet;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserLogin implements ActionListener
{
	JButton buttonAdminLogin, buttonLibrarianLogin;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	public UserLogin()
	{
		firstFrame();
	}
	public void firstFrame() 
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		labelTitle = new JLabel("Library Management By Mohit S.");
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
		labelTitle.setBounds(180 ,-2,260, 40);
		labelTitle.setVisible(true);
	
		frame.getContentPane();
		
		
		buttonAdminLogin = new JButton("Admin Login");
		buttonAdminLogin.setBounds(170, 50, 200, 60);
		
		buttonLibrarianLogin = new JButton("Librarian Login");
		buttonLibrarianLogin.setBounds(170, 150, 200, 60);
		
		
		panel.setLayout(null);
		panel.add(labelTitle);
		panel.add(buttonAdminLogin);
		panel.add(buttonLibrarianLogin);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		buttonAdminLogin.addActionListener(this);
		buttonLibrarianLogin.addActionListener(this);
		
		
		frame.add(panel);
		frame.setLocation(500, 200);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)  
	{
		if(e.getSource() == buttonAdminLogin)
		{
			frame.dispose();
			new AdminLogin();
		}
		else
		{
			new LibrarianLogin();
			frame.dispose();
		}
	}
	public static void main(String[] args) 
	{
		new UserLogin();
	}
}
