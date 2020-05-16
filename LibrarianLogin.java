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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogin implements ActionListener
{
	LibrarianDetails libDetails;
	String checkPass;
	HashMap<String,LibrarianEmployee> hashMapDetailsOfEmployee;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle, labelUsername, labelPass;
	JTextField textAreaUsername;
	JPasswordField textAreaPassword;
	JButton buttonLibrarianLogin;
	public LibrarianLogin() 
	{
			frame = new JFrame("Library Management System");
			panel = new JPanel();
			labelTitle = new JLabel("Librarian Login");
			labelTitle.setForeground(Color.black);
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
			labelTitle.setBounds(200 ,-2,100, 40);
			labelTitle.setVisible(true);
			
			frame.getContentPane();
			
			labelUsername = new JLabel("Username :");
			labelUsername.setBounds(90, 60, 150, 20);
			
			labelPass = new JLabel("Password :");
			labelPass.setBounds(90, 110, 150, 20);
			
			textAreaUsername = new JTextField();
			textAreaUsername.setBounds(190, 60, 150, 20);
			
			textAreaPassword = new JPasswordField();
			textAreaPassword.setBounds(190, 110, 150, 20);
			
			
	
			buttonLibrarianLogin = new JButton("Login");
			buttonLibrarianLogin.setBounds(170, 180, 200, 30);
			
			
			panel.setLayout(null);
		
			panel.add(labelTitle);
			panel.add(labelUsername);
			panel.add(labelPass);
			panel.add(buttonLibrarianLogin);
			panel.add(textAreaPassword);
			panel.add(textAreaUsername);
			
			
			panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
			
			buttonLibrarianLogin.addActionListener(this);
			
			
			
			frame.add(panel);
			frame.setLocation(500, 200);
			frame.setSize(500, 300);
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		// check login by admin managed data base by using hashMap
		
		boolean flag = true;
		String enterdName = textAreaUsername.getText();
		String checkPass = String.valueOf(textAreaPassword.getPassword());
		if(e.getSource() == buttonLibrarianLogin) 
		{	
			libDetails = new LibrarianDetails();
			hashMapDetailsOfEmployee = libDetails.takeAddressHashMap();
			if( enterdName.isEmpty() || checkPass.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Enter Data Properly");
			}
			else
			{
				if(hashMapDetailsOfEmployee == null)
				{
					JOptionPane.showMessageDialog(null, "No Record Found");
				}
				else
				{
					System.out.println(checkPass);
					System.out.println("Entered Name"+enterdName);
					for(Object objName :hashMapDetailsOfEmployee.keySet())
					{
						if(enterdName.equals(objName.toString())) 
						{
							System.out.println("Entered 1 ");
							for(Entry<String, LibrarianEmployee> objKey : hashMapDetailsOfEmployee.entrySet())
							{
								System.out.println("Entered 2");
								String values = objKey.getValue().toString();
								String col[] = values.split(" ");
								System.out.println(col.length);
								for(int i = 0; i < col.length ; i++)
								{
									System.out.println(col[i]);
								}
								for(int i = 0; i < col.length ; i++)
								{
									if(col[i].trim().equals(checkPass))
									{
										flag = false;
										System.out.println("Entered 3");
										new LibrarianSection();
										frame.dispose();
										break;
									}
								}
								
							}
						}
						
					}
					if(flag)
					{
						JOptionPane.showMessageDialog(null, "Enter Valid Details");
						
					}
					
					
				}
			}	
			
		}	
		else 
		{
			JOptionPane.showMessageDialog(null, "Invalid Username and Password...");
			textAreaUsername.setText("");
			textAreaPassword.setText("");
		}
	}
}
