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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AddLibrarian implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel labelTitle, labelUsername, labelPass, labelEmail, labelAddress, labelCity, labelContactNo, errorMsg;
	JTextField textAreaUsername , textAreaEmail, textAreaAddress, textAreaCity, textAreaContactNo;
	JPasswordField textAreaPassword;
	JSpinner spinner;
	JButton buttonAddLibrarian, buttonBack;
	public AddLibrarian() 
	{
			frame = new JFrame("Library Management System");
			panel = new JPanel();
			labelTitle = new JLabel("Add Librarian");
			labelTitle.setForeground(Color.black);
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
			labelTitle.setBounds(200 ,-2,100, 40);
			labelTitle.setVisible(true);
			
			frame.getContentPane();
			
			labelUsername = new JLabel("Name :");
			labelUsername.setBounds(90, 30, 150, 20);
			
			labelPass = new JLabel("Password :");
			labelPass.setBounds(90, 80, 150, 20);
			
			labelEmail = new JLabel("Email :");
			labelEmail.setBounds(90, 130, 150, 20);
			
			labelAddress = new JLabel("Address :");
			labelAddress.setBounds(90, 180, 150, 20);
			
			labelCity = new JLabel("City :");
			labelCity.setBounds(90, 230, 150, 20);
			
			labelContactNo = new JLabel("Contact No :");
			labelContactNo.setBounds(90, 280, 150, 20);
			
			textAreaUsername = new JTextField();
			textAreaUsername.setBounds(190, 30, 150, 20);
			
			textAreaPassword = new JPasswordField();
			textAreaPassword.setBounds(190, 80, 150, 20);
			
			textAreaEmail = new JTextField();
			textAreaEmail.setBounds(190, 130, 150, 20);
			
			textAreaAddress = new JTextField();
			textAreaAddress.setBounds(190, 180, 150, 20);
			
			textAreaCity = new JTextField();
			textAreaCity.setBounds(190, 230, 150, 20);
			
			textAreaContactNo = new JTextField();
			textAreaContactNo.setBounds(190, 280, 150, 20);
			
			
			buttonAddLibrarian = new JButton("Add Librarian");
			buttonAddLibrarian.setBounds(150, 360, 200, 30);
			
			buttonBack = new JButton("Back");
			buttonBack.setBounds(190, 460, 130, 30);
			
			
			panel.setLayout(null);
		
			panel.add(labelTitle);
			panel.setBorder(new TitledBorder("Add lib"));
			panel.add(labelUsername);
			panel.add(labelPass);
			panel.add(labelEmail);
			panel.add(labelAddress);
			panel.add(labelCity);
			panel.add(labelContactNo);

			panel.add(textAreaUsername);
			panel.add(textAreaPassword);
			panel.add(textAreaEmail);
			panel.add(textAreaAddress);
			panel.add(textAreaCity);
			panel.add(textAreaContactNo);
			
			panel.add(buttonAddLibrarian);
			panel.add(buttonBack);
			
			panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
			
			
			buttonAddLibrarian.addActionListener(this);
			buttonBack.addActionListener(this);
			frame.add(panel);
			frame.setLocation(500, 100);
			frame.setSize(500, 600);
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent av)
	{
		if(av.getSource() == buttonAddLibrarian)
		{
			String name = textAreaUsername.getText().trim();
			String pass = String.copyValueOf(textAreaPassword.getPassword());
			String email = textAreaEmail.getText().trim();
			String address = textAreaAddress.getText().trim();
			String city = textAreaCity.getText().trim();
			String contactno = textAreaContactNo.getText().trim();
			
			if(name.equals("") || pass.equals("") || email.equals("") || address.equals("") || city.equals("") || contactno.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter all details Properly");
				textAreaUsername.setText("");
				textAreaPassword.setText("");
				textAreaEmail.setText("");
				textAreaAddress.setText("");
				textAreaCity.setText("");
				textAreaContactNo.setText("");					
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Librarian Addeed Successfully");
				textAreaUsername.setText("");
				textAreaPassword.setText("");
				textAreaEmail.setText("");
				textAreaAddress.setText("");
				textAreaCity.setText("");
				textAreaContactNo.setText("");
				LibrarianDetails.main(name, pass, email, address, city, contactno);
			}
		}
		else
		{
			new AdminSection();
			frame.dispose();
		}
	}
	public static void main(String[] args) 
	{
		new AddLibrarian();
	}
}
