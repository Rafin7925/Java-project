package Project;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
public class HomeFrame extends JFrame {

	private JLabel lblTitle, lblVn, lblDr;// Vn=Vehicle Number; Dr=Driver License
	private JTextField textVn;
	private JTextField textDr;
	private JButton btnO;
	private JButton btnClear;

	public HomeFrame() {
		super("Vehicle Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		getContentPane().setLayout(null);
		this.setVisible(true);

		JLabel lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTitle.setBounds(114, 10, 414, 25);
		getContentPane().add(lblTitle);

		JLabel lblVn = new JLabel("Vehicle Number");
		lblVn.setBackground(new Color(192, 192, 192));
		lblVn.setForeground(new Color(0, 0, 0));
		lblVn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVn.setBounds(120, 223, 184, 25);
		getContentPane().add(lblVn);

		JLabel lblDr = new JLabel("Driving License");
		lblDr.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDr.setBounds(121, 275, 140, 25);
		getContentPane().add(lblDr);

		textVn = new JTextField();
		textVn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textVn.setBounds(322, 223, 184, 20);
		getContentPane().add(textVn);
//textVn.setColumns(10);

		textDr = new JTextField();
		textDr.setFont(new Font("Times New Roman", Font.PLAIN, 16));
//textDr.setColumns(10);
		textDr.setBounds(322, 278, 184, 20);
		getContentPane().add(textDr);

		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(188, 174, 189));
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(137, 373, 124, 41);
		getContentPane().add(btnOk);

		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(188, 174, 189));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(314, 375, 124, 39);
		getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(193, 12, 2));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(561, 414, 115, 39);
		getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\toll-booth (1).jpg"));
		lblNewLabel.setBounds(0, 0, 686, 463);
		getContentPane().add(lblNewLabel);
		
		  btnBack.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {

	                setVisible(false);
	                Frame frame = new Frame();
	                frame.setVisible(true);
	            }
	        });

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnClear) {
					textVn.setText("");
					textDr.setText("");
				}
			}
		});
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Vehicles = textVn.getText();
				String Driver = textDr.getText();

				if (Vehicles.equals("")) {
					JOptionPane.showMessageDialog(null, "Vehicles is Mandatory.");
				} else if (Driver.equals("")) {
					JOptionPane.showMessageDialog(null, "Driver is Mandatory.", "WARNING!",
							JOptionPane.WARNING_MESSAGE);
				}
				
				else {
	 JOptionPane.showMessageDialog(null, "Successfull.",

	    	 "Successful", JOptionPane.WARNING_MESSAGE);

	    	 setVisible(false);
	    	 Info i = new Info();
	     i.lblVehicle2.setText(Vehicles);
	     i.lblDriver2.setText(Driver);
	    	 i.setVisible(true);
				}

	    	 }

});

}
}