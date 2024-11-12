package Project;


import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Ticket extends JFrame {
	JLabel lblTicket,lblVehicle,lblVehicle2 ,lblDriver,lblDriver2 ,lblAmount ,lbltnew ,lblPaid,lblAmount2 ;
	JTextField textAmount;
	JButton btnPrint;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;


	public Ticket() {
		setTitle("TICKET");
		getContentPane().setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 460);
		getContentPane().setLayout(null);
		this.setVisible(true);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblTicket.setBounds(206, 29, 68, 39);
		getContentPane().add(lblTicket);
		
		lblVehicle = new JLabel("Vehicle");
		lblVehicle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehicle.setBounds(51, 85, 145, 39);
		getContentPane().add(lblVehicle);
		
		lblDriver = new JLabel("Driver");
		lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDriver.setBounds(51, 136, 145, 39);
		getContentPane().add(lblDriver);
		
		lblAmount= new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAmount.setBounds(51, 185, 121, 39);
		getContentPane().add(lblAmount);
		
		lblPaid  = new JLabel("Paid");
		lblPaid .setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPaid .setBounds(81, 302, 68, 39);
		getContentPane().add(lblPaid );
		
		
		lblVehicle2 = new JLabel ();
		lblVehicle2.setBounds(206, 85, 209, 33);
		getContentPane().add(lblVehicle2);
	
		lblDriver2 = new  JLabel ();
		lblDriver2.setBounds(220, 147, 209, 28);
		getContentPane().add( lblDriver2);
		
		lblAmount2 = new JLabel();
		lblAmount2.setBounds(220, 187, 209, 30);
		getContentPane().add(lblAmount2);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(145, 69, 228));
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrint.setBounds(289, 303, 140, 44);
		getContentPane().add(btnPrint);
		
		lblNewLabel = new JLabel("Welcome to Padma Bridge");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(182, 367, 158, 32);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Padma Bridge");
		lblNewLabel_1.setBounds(452, 378, 74, 13);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Toll Ticket");
		lblNewLabel_2.setBounds(452, 400, 74, 13);
		getContentPane().add(lblNewLabel_2);
		
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	 JOptionPane.showMessageDialog(null, "Successfully Print.",

	    	 "Print Panel", JOptionPane.WARNING_MESSAGE);

	    	 setVisible(false);
	    	 HomeFrame hf = new HomeFrame();
	    	 hf.setVisible(true);

	    	 }

});
		
		
	}

}

