package com.lirarymanagmenet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin implements ActionListener
{	
	JFrame frame;
	JPanel panel;
	JLabel labelTitle, labelUsername, labelPass;
	JTextField textAreaUsername;
	JPasswordField textAreaPassword;
	JButton ButtonAdminLogin;
	public AdminLogin() 
	{
			frame = new JFrame("Library Management System");
			panel = new JPanel();
			labelTitle = new JLabel("Admin Login");
			labelTitle.setForeground(Color.black);
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
			labelTitle.setBounds(200 ,-2,100, 40);
			labelTitle.setVisible(true);
			
			frame.getContentPane();
			
			labelUsername = new JLabel("Username :");
			labelUsername.setBounds(90, 30, 150, 20);
			
			labelPass = new JLabel("Password :");
			labelPass.setBounds(90, 80, 150, 20);
			
			textAreaUsername = new JTextField();
			textAreaUsername.setBounds(190, 30, 150, 20);
			
			textAreaPassword = new JPasswordField();
			textAreaPassword.setBounds(190, 80, 150, 20);
			
			
			
	
			ButtonAdminLogin = new JButton("Login");
			ButtonAdminLogin.setBounds(170, 200, 200, 30);
			
			
			panel.setLayout(null);
		
			panel.add(labelTitle);
			panel.add(labelUsername);
			panel.add(labelPass);
			panel.add(ButtonAdminLogin);
			panel.add(textAreaPassword);
			panel.add(textAreaUsername);
			
			panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
			
			ButtonAdminLogin.addActionListener(this);
			
			frame.add(panel);
			frame.setLocation(500, 200);
			frame.setSize(500, 300);
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
			if(textAreaUsername.getText().equals("admin") && String.valueOf(textAreaPassword.getPassword()).equals("admin") ) {
				JOptionPane.showMessageDialog(null, "Welcome admin!!!");
				new AdminSection();
				frame.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Username and Password...");
				textAreaUsername.setText("");
				textAreaPassword.setText("");
		}
	}
}
