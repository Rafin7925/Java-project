package Project;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


public class Login extends JFrame{
private JButton btnLogin, btnClear;
private JTextField txtName;
private JLabel lblName, lblPass;
private JPasswordField txtPass;
private Login f;
private JButton btnNewButton;

public Login(){
super("Login Window");
getContentPane().setBackground(new Color(143, 200, 233));
this.addComponent();
f = this;

this.setSize(500,400);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

private void addComponent(){

this.lblName = new JLabel();
lblName.setBackground(new Color(255, 255, 255));
lblName.setFont(new Font("Tahoma", Font.BOLD, 19));
lblName.setBounds(44, 152, 121, 29);
this.lblName.setText("User Name ");

this.lblPass = new JLabel("Password: ");
lblPass.setBackground(new Color(255, 255, 255));
lblPass.setFont(new Font("Tahoma", Font.BOLD, 19));
lblPass.setBounds(44, 202, 121, 29);

this.txtName = new JTextField("Tanjil");
txtName.setFont(new Font("Tahoma", Font.PLAIN, 18));
txtName.setBounds(170, 141, 190, 40);

this.txtPass = new JPasswordField("22477");
txtPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
txtPass.setBounds(170, 191, 190, 40);

this.btnLogin = new JButton("Login");
btnLogin.setBackground(new Color(0, 128, 64));
btnLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
btnLogin.setBounds(86, 241, 98, 34);
this.btnLogin.addActionListener(new FrameActionHandler());

this.btnClear = new JButton("Clear");
btnClear.setBackground(new Color(0, 128, 64));
btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
btnClear.setBounds(209, 241, 98, 34);
this.btnClear.addActionListener(new FrameActionHandler());
getContentPane().setLayout(null);


getContentPane().add(this.lblName);
getContentPane().add(this.txtName);
getContentPane().add(this.lblPass);
getContentPane().add(this.txtPass);
getContentPane().add(this.btnLogin);
getContentPane().add(this.btnClear);
btnNewButton = new JButton("Home");
btnNewButton.setBackground(new Color(193, 12, 2));
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Frame f1 =new Frame();
		f1.setVisible(true);
		setVisible(false);
	}
});
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
btnNewButton.setBounds(378, 319, 98, 34);
getContentPane().add(btnNewButton);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\Government_Seal_of_Bangladesh.svg (1).png"));
lblNewLabel.setBounds(-10, 0, 496, 363);
getContentPane().add(lblNewLabel);
}

private class FrameActionHandler implements ActionListener{
String[][] info = { {"Tanjil","22477"},
{"Mohim","22478"},
};

public void actionPerformed(ActionEvent e){
	String Name=txtName.getText();
	String Pass=txtPass.getText();
if(e.getSource() == btnLogin){
if (Name.equals("")) {
    JOptionPane.showMessageDialog(null, "Username is Mandatory.");
  }
else if (Pass.equals("")) {
JOptionPane.showMessageDialog(null, "Password is Mandatory.","WARNING!",JOptionPane.WARNING_MESSAGE);
}
this.Log();
}
else if(e.getSource() == btnClear){
txtName.setText("");
txtPass.setText("");
}
}


private void Log(){
String i = txtName.getText();
String p = txtPass.getText();
boolean flag = false;

for(int c = 0; c < 3 ; c++){
if(i.equals(info[c][0]) && p.equals(info[c][1])){
JOptionPane.showMessageDialog(null, "Login Valid", "Info", JOptionPane.INFORMATION_MESSAGE);
flag = true;

Supervisor hf = new Supervisor();
hf.setVisible(true);
setVisible(false);
break;
}
}
if(!flag)
JOptionPane.showMessageDialog(null, "Login Invalid", "Info", JOptionPane.ERROR_MESSAGE);

}
}
}