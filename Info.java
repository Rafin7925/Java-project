package Project;


import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Info extends JFrame {
	JLabel lblTicket,lblVehicle,lblVehicle2 ,lblDriver,lblDriver2 ,lblAmount ,lbltnew ,lblPaid ;
	JTextField textAmount;
	JButton btnNext, btnBack;
	private JLabel lblNewLabel;


	public Info() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 460);
		getContentPane().setLayout(null);
		this.setVisible(true);
	
		JLabel lblInfo = new JLabel("Information");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInfo.setBounds(141, 10, 195, 44);
		getContentPane().add(lblInfo);
		
		lblVehicle = new JLabel("Vehicle");
		lblVehicle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVehicle.setBounds(49, 84, 86, 39);
		getContentPane().add(lblVehicle);
		
		lblDriver = new JLabel("Driver");
		lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDriver.setBounds(53, 136, 118, 39);
		getContentPane().add(lblDriver);
		
		lblAmount= new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAmount.setBounds(49, 186, 145, 39);
		getContentPane().add(lblAmount);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(97, 80, 218));
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNext.setBounds(301, 313, 140, 44);
		getContentPane().add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(193, 12, 2));
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBack.setBounds(78, 313, 140, 44);
		getContentPane().add(btnBack);
		
		
		lblVehicle2 = new JLabel ();
		lblVehicle2.setBounds(220, 97, 209, 20);
		getContentPane().add(lblVehicle2);
		//textVehicle.setColumns(10);
	
		lblDriver2 = new  JLabel ();
		//textDriver.setColumns(10);
		lblDriver2.setBounds(220, 147, 209, 20);
		getContentPane().add( lblDriver2);
		
		textAmount = new JTextField();
		//textAmount.setColumns(10);
		textAmount.setBounds(220, 192, 209, 27);
		getContentPane().add(textAmount);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 536, 423);
		getContentPane().add(lblNewLabel);
		
		  btnBack.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {

	                setVisible(false);
	                HomeFrame frame = new HomeFrame();
	                frame.setVisible(true);
	            }
	        });
		
		btnNext.addActionListener(new ActionListener() {
			private String File;
			private java.io.File file;

			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Ticket T= new Ticket();
				String vehicle  = lblVehicle.getText();
				String driver  = lblDriver.getText();
				String amount = textAmount.getText();
				  T.lblVehicle2.setText(vehicle);
				  T.lblDriver2.setText(driver);
				  T.lblAmount2.setText(amount);
				T.setVisible(true);
					try {
						String Vehicle =lblVehicle2.getText();
						String Driver = lblDriver2.getText();
						String Amount = textAmount.getText();

    	  File file = new File(".\\next.txt");
    	  

    	 if (!file.exists()) {

    	 file.createNewFile();

    	 }

    	 FileWriter fw = new FileWriter(file, true);

    	 BufferedWriter bw = new BufferedWriter(fw);

    	 PrintWriter pw = new PrintWriter(bw);

    	 LocalDateTime myDateObj = LocalDateTime.now();

    	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

    	 String timeAndDate = myDateObj.format(myFormatObj);
    	 
    	 pw.println("Vehicle : " +Vehicle);
    	 pw.println("Driver : " +Driver);
    	 pw.println("Amount : " +Amount);
    	 

    	 pw.println("Time & Date : " + timeAndDate);

    	 pw.println("_______________________________________________");

    	 pw.close();


    	 } catch (Exception ex) {

    	 System.out.print(ex);

					
					
				}
					
					try {
						String Vehicle =lblVehicle2.getText();
						String Driver = lblDriver2.getText();
						String Amount = textAmount.getText();

    	  File file_1 = new File(".\\Earning_Data.txt");
    	  

    	 if (!file_1 .exists()) {

    		 file_1 .createNewFile();

    	 }

    	 FileWriter fw = new FileWriter(file_1 , true);

    	 BufferedWriter bw = new BufferedWriter(fw);

    	 PrintWriter pw = new PrintWriter(bw);

    	 
    	 
    	 pw.println("" +Amount);
    	 

    	 
    	 double count=0;
    	 int A= Integer.parseInt(Amount);
    	 
    	 

         pw.println("_______________________________________________");
         pw.println("Total: "+A);
         
         

    	 pw.close();


    	 } catch (Exception ex) {

    	 System.out.print(ex);

					
					
				}}
			
		});
		
		
	}

}
