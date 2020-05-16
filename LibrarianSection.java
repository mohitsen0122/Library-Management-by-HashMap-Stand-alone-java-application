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

public class LibrarianSection implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel labelTitle;
	
	BookDetails detailsBook;
	StudentsDetails detailsStudent;
	
	HashMap<String , BookSeperately> bookHashMap = null;
	HashMap<String, StudentSeperately> studentHashMap = null;
	
	JButton addBooks, viewBook, issueBook, viewIssuedBooks, returnBook, logout;
	public LibrarianSection()
	{
		frame = new JFrame("Library Management System");
		panel = new JPanel();
		labelTitle = new JLabel("Library Section");
		labelTitle.setForeground(Color.black);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 13)  );
		labelTitle.setBounds(20 ,0,100, 40);
		labelTitle.setVisible(true);
		
		frame.getContentPane();
		
		addBooks = new JButton("Add Books");
		addBooks.setBounds(170, 20, 200, 30);
		
		viewBook = new JButton("View Books");
		viewBook.setBounds(170, 60, 200, 30);
		
		issueBook = new JButton("Issue Book");
		issueBook.setBounds(170, 100, 200, 30);
		
		viewIssuedBooks = new JButton("View Issued Book");
		viewIssuedBooks.setBounds(170, 140, 200, 30);
		
		returnBook = new JButton("Return Book");
		returnBook.setBounds(170, 180, 200, 30);
		
		logout = new JButton("Logout");
		logout.setBounds(170, 220, 200, 30);
		
		
		panel.setLayout(null);
	
		panel.add(labelTitle);
		panel.add(addBooks);
		panel.add(viewBook);
		panel.add(issueBook);
		panel.add(viewIssuedBooks);
		panel.add(returnBook);
		panel.add(logout);
		
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
		addBooks.addActionListener(this);
		viewBook.addActionListener(this);
		issueBook.addActionListener(this);
		viewIssuedBooks.addActionListener(this);
		returnBook.addActionListener(this);
		logout.addActionListener(this);
		
		frame.add(panel);
		frame.setLocation(500, 200);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		detailsBook = new BookDetails();
		bookHashMap = detailsBook.takeAddressOfBookHash();
		
		detailsStudent = new StudentsDetails();
		studentHashMap = detailsStudent.takeAddressStudentDetails();
		
		if(e.getSource() == addBooks) {
			frame.dispose();
			new AddBooks();
		}
		else if(e.getSource() == viewBook) {
			if(bookHashMap != null)
			{
				new ViewBook();
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Book List is Empty!!!");
			}
		}
		else if(e.getSource() == issueBook) {
			
			new IssueBook();
			frame.dispose();
			
		}
		else if(e.getSource() == viewIssuedBooks) {
			if(studentHashMap != null)
			{
				new ViewIssueBooks();
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No Books is Issued Yet!!!");
			}
			
			
		}
		else if(e.getSource() == returnBook) {
			new ReturnBook();
			frame.dispose();
			
		}
		else {
			new Logout();
			frame.dispose();
			
		}
	}
}
