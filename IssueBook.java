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
import javax.swing.border.TitledBorder;

public class IssueBook implements ActionListener
{
	BookDetails detailsBook;
	StudentsDetails studDetails;
	static HashMap<String, StudentSeperately> studHashMap;
	static HashMap<String, BookSeperately> bookHashMap;
	JFrame frame;
	JPanel panel;
	JLabel labelTitle, labelCallNo, labelName, labelAuthor, labelPublisher, labelQuantity, errorMsg;
	JTextField textAreaCallNo , textAreaName, textAreaAuthor, textAreaPublisher, textAreaQuantity;
	JButton buttonAddBook, buttonBack;
	public IssueBook() 
	{
			frame = new JFrame("Library Management System");
			panel = new JPanel();
			labelTitle = new JLabel("Issue Book");
			labelTitle.setForeground(Color.black);
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
			labelTitle.setBounds(200 ,-2,100, 40);
			labelTitle.setVisible(true);
			
			frame.getContentPane();
			
			labelCallNo = new JLabel("Call No :");
			labelCallNo.setBounds(70, 80, 150, 20);
			
			
			labelName = new JLabel("Student Id :");
			labelName.setBounds(70, 130, 150, 20);
			
			labelAuthor = new JLabel("Student Name :");
			labelAuthor.setBounds(70, 180, 150, 20);
			
			labelPublisher = new JLabel("Student Contact :");
			labelPublisher.setBounds(70, 230, 150, 20);
			
			textAreaCallNo = new JTextField();
			textAreaCallNo.setBounds(190, 80, 150, 20);
			
			textAreaName = new JTextField();
			textAreaName.setBounds(190, 130, 150, 20);
			
			textAreaAuthor = new JTextField();
			textAreaAuthor.setBounds(190, 180, 150, 20);
			
			textAreaPublisher = new JTextField();
			textAreaPublisher.setBounds(190, 230, 150, 20);
			
			
			buttonAddBook = new JButton("Issue Book");
			buttonAddBook.setBounds(150, 360, 200, 30);
			
			buttonBack = new JButton("Back");
			buttonBack.setBounds(190, 460, 130, 30);
			
			
			panel.setLayout(null);
		
			panel.add(labelTitle);
			panel.setBorder(new TitledBorder("Add lib"));
			panel.add(labelCallNo);
			panel.add(labelName);
			panel.add(labelAuthor);
			panel.add(labelPublisher);



			panel.add(textAreaCallNo);
			panel.add(textAreaName);
			panel.add(textAreaAuthor);
			panel.add(textAreaPublisher);
			
			
			panel.add(buttonAddBook);
			panel.add(buttonBack);
			
			panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
			
			
			buttonAddBook.addActionListener(this);
			buttonBack.addActionListener(this);
			frame.add(panel);
			frame.setLocation(500, 100);
			frame.setSize(500, 600);
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setVisible(true);
	}
	public boolean checkBookAvailable(String book)
	{
		detailsBook = new BookDetails();
		bookHashMap = detailsBook.takeAddressOfBookHash();
		
			if(bookHashMap.containsKey(book))
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public void actionPerformed(ActionEvent av)
	{
		
		if(av.getSource() == buttonAddBook)
		{
			String callno = textAreaCallNo.getText().trim();
			String name = textAreaName.getText().trim();
			String author = textAreaAuthor.getText().trim();
			String publisher = textAreaPublisher.getText().trim();
			
			if(callno.equals("") || name.equals("") || author.equals("") || publisher.equals("") )
			{
				JOptionPane.showMessageDialog(null, "Please Enter all details Properly");
				textAreaCallNo.setText("");
				textAreaName.setText("");
				textAreaAuthor.setText("");
				textAreaPublisher.setText("");				
			}
			else
			{
				textAreaCallNo.setText("");
				textAreaName.setText("");
				textAreaAuthor.setText("");
				textAreaPublisher.setText("");
				boolean flag = checkBookAvailable(callno);
				if(flag)
				{
					
					JOptionPane.showMessageDialog(null, "Book Issued Successfully");
					checkBookAvailable(callno);
					StudentsDetails.main(callno, name, author, publisher);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No Book Found, Can't Issue");
				}
			}
		}
		else
		{
			new LibrarianSection();
			frame.dispose();
		}
	}
}
