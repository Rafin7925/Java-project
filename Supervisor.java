package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;

public class Supervisor extends JFrame {

	public JFrame frmSupervisor;

	
	public Supervisor() {
		super("Supervisor");
		
		
		initialize();
	}
	
	
	public void initialize() {
		
		
		frmSupervisor = new JFrame();
		frmSupervisor.setTitle("Supervisor");
		frmSupervisor.setBounds(100, 100, 671, 460);
		frmSupervisor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupervisor.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Registration");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration r= new Registration();
				r.setVisible(true);
				frmSupervisor.setVisible(false);
				
				
				
			}
		});
		btnNewButton.setBounds(20, 199, 176, 29);
		frmSupervisor.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("Vahicle List");

		btnNewButton_1_1.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {


		try {

		//(Runtime.getRuntime()).excel("rund1132 url.dll,FileProtocolHandler "+".\\next.txt");

		File file = new File(".\\next.txt");

		if (file.exists()) {

		if(Desktop.isDesktopSupported()) {

		Desktop.getDesktop().open(file);

		}

		else{

		JOptionPane.showMessageDialog(btnNewButton_1_1, this, "not Supported", 0);

		}

		}else {JOshowMessageDialog(this, "not Supported");

		}

		}

		catch (Exception ex){

		ex.printStackTrace();

		}

		}

		private void JOshowMessageDialog(ActionListener actionListener, String string) {

		// TODO Auto-generated method stub


		}

		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(20, 131, 176, 29);
		frmSupervisor.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Employee List");
		btnNewButton_1_2.setBackground(new Color(192, 192, 192));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(20, 56, 176, 29);
		frmSupervisor.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserData Ud= new UserData();
				Ud.setVisible(true);
				frmSupervisor.setVisible(false);
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(123, 100, 81));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l= new Login();
				l.setVisible(true);
				frmSupervisor.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(518, 384, 129, 29);
		frmSupervisor.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\padma-bridge-2-768x432.jpg"));
		lblNewLabel.setBounds(0, 0, 657, 423);
		frmSupervisor.getContentPane().add(lblNewLabel);
	}


	public void setVisible(boolean b) {
		if(b==true)
			frmSupervisor.setVisible(true);
		
	}
	}

