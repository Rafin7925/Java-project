package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

class Registration extends JFrame{

	private JPanel contentPane;
	private JPasswordField pass;
	private JTextField txtName;
	private JTextField txtMobileNo;
	private JTextField txtNid;
	private JTextField txtGmail;
	private JButton btnSignUp;
	private JButton btnShow;
	private JCheckBox chckbox;
	private JRadioButton rbtnM,rbtnF;
	private ButtonGroup group;
	
	
		

	
	
	
	public Registration() {
		
		super("SIGN UP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 62, 202, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(722, 440, 109, 32);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervisor S= new Supervisor();
				setVisible(false);
				
				S.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnBack);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setBounds(10, 107, 202, 26);
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblMobileNo);
		
		JLabel lblNid = new JLabel("NID");
		lblNid.setBounds(10, 153, 202, 26);
		lblNid.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNid);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(105, 209, 202, 26);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblGender);
		
		JRadioButton rbtnM = new JRadioButton("Male");
		rbtnM.setBounds(42, 255, 122, 21);
		rbtnM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(rbtnM);
		
		JRadioButton rbtnF = new JRadioButton("Female");
		rbtnF.setBounds(204, 255, 122, 21);
		rbtnF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(rbtnF);
		
		group = new ButtonGroup();
		group.add(rbtnM);
		group.add(rbtnF);
//		rbtnF.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(rbtnF.isSelected()) 
//					rbtnM.setSelected(false);
//			}
//		}); 
//		rbtnM.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(rbtnM.isSelected()) 
//					rbtnF.setSelected(false);
//			}
//		}); 
	
		JLabel lblGmail = new JLabel("Gmail");
		lblGmail.setBounds(10, 300, 202, 26);
		lblGmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblGmail);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(10, 340, 202, 26);
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblPass);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(167, 427, 122, 32);

		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=txtName.getText();
				String Pass=pass.getText();
				 String MobileNo=txtMobileNo.getText();
				  String Nid=txtNid.getText();
				   String Gmail=txtGmail.getText();
				   String Gender=lblGender.getText();
				     
				  if (Name.equals("")) {
				    	                    JOptionPane.showMessageDialog(null, "Name is Mandatory.");
				                          }
				     else if (MobileNo.equals("")) {
	                    JOptionPane.showMessageDialog(null, "Mobile No is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
                      }
				     else if (Nid.equals("")) {
	                    JOptionPane.showMessageDialog(null, "NID is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
                      }
				     else if (Gmail.equals("")) {
	                    JOptionPane.showMessageDialog(null, "Gmail is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
                      }
				     else if (Pass.equals("")) {
	                    JOptionPane.showMessageDialog(null, "Password is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
                      }
				     else if (Gender.equals("")) {
				    	 if(rbtnM.isSelected()){
								Gender = "Male";
								}
							else if (rbtnF.isSelected()){
								Gender = "Femle";
								}
		                    JOptionPane.showMessageDialog(null, "Gender is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
	                      }
				     else {

				    	 try {

				    	 File file = new File(".\\text.txt");

				    	 if (!file.exists()) {

				    	 file.createNewFile();

				    	 }

				    	 FileWriter fw = new FileWriter(file, true);

				    	 BufferedWriter bw = new BufferedWriter(fw);

				    	 PrintWriter pw = new PrintWriter(bw);


				    	 LocalDateTime myDateObj = LocalDateTime.now();

				    	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

				    	 String timeAndDate = myDateObj.format(myFormatObj);


				    	 pw.println("User Name : " +Name );
				    	 
				    	 pw.println("Password : " +Pass );

				    	 pw.println("Mobile No : " + MobileNo);

				    	 pw.println("National ID : " + Nid);

				    	 pw.println("Gmail : " + Gmail);

				    	 pw.println("Time & Date : " + timeAndDate);
				    	 pw.println("Gender : " + Gender);

				    	 pw.println("===============================================");

				    	 pw.close();


				    	 } catch (Exception ex) {

				    	 System.out.print(ex);

				    	 }

				    	 JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",

				    	 "Registration Complete", JOptionPane.WARNING_MESSAGE);

				    	 setVisible(false);

				    	 Supervisor f = new Supervisor();

				    	 f.setVisible(true);

				    	 }
				     
				
			}}
			
		);

				
				
		
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnSignUp);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(314, 427, 122, 32);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtMobileNo.setText("");
				txtNid.setText("");
				txtGmail.setText("");
				pass.setText("");

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnClear);
		
		pass = new JPasswordField();
		pass.setBounds(250, 340, 327, 26);
		contentPane.add(pass);
		
		txtName = new JTextField();
		txtName.setBounds(250, 62, 327, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setBounds(250, 107, 327, 26);
		txtMobileNo.setColumns(10);
		contentPane.add(txtMobileNo);
		
		txtNid = new JTextField();
		txtNid.setBounds(250, 153, 327, 26);
		txtNid.setColumns(10);
		contentPane.add(txtNid);
		
		txtGmail = new JTextField();
		txtGmail.setBounds(250, 300, 327, 26);
		txtGmail.setColumns(10);
		contentPane.add(txtGmail);
		
		JCheckBox chckbox = new JCheckBox("Show Password");
		chckbox.setBounds(662, 344, 153, 26);
		chckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbox.isSelected()) {
					   pass.setEchoChar((char)0);
					   
					}
					else {
						 pass.setEchoChar('*');
						  
					}
			}
		});
		chckbox.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(chckbox);
		
			}	
	
			
			
	}


