

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    private JPasswordField pf;
    private Font f;
    private JTextField tf;
    private JButton cancel,login,register,back;
    
    private JLabel imgLabel;
    private ImageIcon img;
    
     
    
    Login()
    {
        initComponent();
    }
    
    public void initComponent()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(220, 40, 860, 600);
        this.setTitle("Login Form");
        this.setResizable(false);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f=new Font("Arial",Font.ITALIC + Font.BOLD,14);

      
      
       
        
        userLabel=new JLabel();
        userLabel.setText("User name:");
        userLabel.setBounds(250,170, 150, 30);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        //userLabel.setOpaque(true);
        //userLabel.setBackground(Color.BLACK);
        c.add(userLabel);
        
         tf=new JTextField();
        tf.setBounds(350, 170, 180, 30);
        tf.setFont(f);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);
        c.add(tf);
        
        passLabel=new JLabel();
        passLabel.setText("Password:");
        passLabel.setBounds(250, 240, 150, 30);
        passLabel.setFont(f);
        passLabel.setForeground(Color.BLUE);
        //passLabel.setOpaque(true);
       // passLabel.setBackground(Color.BLACK);
        c.add(passLabel);
        
         pf=new JPasswordField();
        pf.setBounds(350, 240, 180, 30);
        pf.setFont(f);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        c.add(pf);
        
        
       
        cancel=new JButton("Clear");
        cancel.setBounds(550, 350, 90, 25);
        cancel.setFont(f);
        cancel.setForeground(Color.RED);
        cancel.setBackground(Color.WHITE);
        c.add(cancel);
        
         
        cancel.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                tf.setText("");
                pf.setText("");
            }
            
        });
        
        
        login=new JButton("Login");
        login.setBounds(370, 350, 90, 25);
        login.setFont(f);
        login.setForeground(Color.BLUE);
        login.setBackground(Color.WHITE);
        c.add(login);
       
        
         login.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
               
                String userName=tf.getText();
                String password=pf.getText();
               
                
                
                if( userName.equals("sisty")&& password.equals("123"))
                {
                    JOptionPane.showMessageDialog(null, "you are successfully Login");
                    dispose();
                    Login frame=new Login();
                    frame.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
                }
            }
            
        });
         
        back=new JButton("Back");
        back.setBounds(180, 350, 90, 25);
        back.setFont(f);
        back.setForeground(Color.BLUE);
        back.setBackground(Color.WHITE);
        c.add(back);
		
		 back.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                
                JOptionPane.showMessageDialog(null, "Back to Home Page");
                    dispose();
                    Home frame=new Home();
                    frame.setVisible(true);
               
            }
            
        });
        
       
        
        register=new JButton("Sign up");
        register.setBounds(700, 0, 130, 25);
        register.setFont(f);
        register.setForeground(Color.RED);
        register.setBackground(Color.BLACK);
        c.add(register);
        
       
        register.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                
                JOptionPane.showMessageDialog(null, "Wellcome to registation form");
                    dispose();
                    RegisterFrame frame=new RegisterFrame();
                    frame.setVisible(true);
               
            }
            
        });
        
        
     
        
    }
    
	
}
