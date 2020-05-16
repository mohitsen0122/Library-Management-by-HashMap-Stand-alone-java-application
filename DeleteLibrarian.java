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
import javax.swing.JTextField;

public class DeleteLibrarian implements ActionListener
{
	LibrarianDetails libDetails;
	static HashMap<String ,LibrarianEmployee> map ;
	
	JTextField textAreaForDelete;
	JButton buttonBack, buttonDelete;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	public DeleteLibrarian()
	{
		firstFrame();
	}
	public void firstFrame() 
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		labelTitle = new JLabel("Delete Librarain");
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
		labelTitle.setBounds(200 ,-2,100, 40);
		labelTitle.setVisible(true);
		libDetails = new LibrarianDetails();
		map = libDetails.takeAddressHashMap();
		
		
		frame.getContentPane();
		
		textAreaForDelete = new JTextField();
		textAreaForDelete.setBounds(140, 40, 220, 30);

		buttonDelete = new JButton("Delete");
		buttonDelete.setBounds(160, 100, 180, 30);

		buttonBack = new JButton("Back");
		buttonBack.setBounds(190, 220, 130, 30);
		
		
		panel.setLayout(null);
		panel.add(labelTitle);
		panel.add(textAreaForDelete);
		panel.add(buttonDelete);
		panel.add(buttonBack);
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		buttonBack.addActionListener(this);
		buttonDelete.addActionListener(this);
		
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
		libDetails = new LibrarianDetails();
		map = libDetails.takeAddressHashMap();
		boolean flag = true;
		
		String textEntered = textAreaForDelete.getText().trim();
		
		if(ev.getSource() == buttonDelete)
		{
			if(textEntered.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Enter Data First");
			}
			else
			{
				if(map == null)
				{
					JOptionPane.showMessageDialog(null, "List is Empty");
				}
				else
				{
					for(Object objKey : map.keySet())
					{
						if(textEntered.equals(objKey.toString()))
						{
							flag = false;
							map.remove(objKey);
							JOptionPane.showMessageDialog(null, "Deleted Data of "+objKey.toString());
							break;
						}
					}
					if(flag)
					{
						JOptionPane.showMessageDialog(null, "Record Not Found");
					}
					
				}
			}
			buttonDelete.setText("");
		}
		else
		{
			new AdminSection();
			frame.dispose();
		}
	}
}
