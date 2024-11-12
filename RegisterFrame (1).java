


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RegisterFrame extends JFrame {
    
    private Container c;
    private JLabel label,label2,label3,label4,label5,label6,label7,gmail;
    private JTextArea ta;
    private Font f;
    private JTextField tf2,tf3,tf4,tf5,tf6;
    private JPasswordField pf1,pf2;
    private JButton register, cancel,login,back;
    
    
    
    RegisterFrame()
    {
       initComponent();    
    }
    
    public void initComponent()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(220, 40, 860, 600);
        this.setTitle("Register Form");
         this.setResizable(false);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f=new Font("Arial",Font.BOLD,12);
        
        
        label=new JLabel("Hello everyone Welcome to the Resister From.");
        label.setBounds(270, 5, 350, 30);
        label.setForeground(Color.red);
        c.add(label);
        
        
        label2=new JLabel("First Name:");
        label2.setBounds(250,100, 150, 30);
        label2.setFont(f);
        label2.setForeground(Color.YELLOW);
        c.add(label2);
        
        tf2=new JTextField();
        tf2.setBounds(350, 100, 220, 30);
        tf2.setFont(f);
        tf2.setForeground(Color.BLACK);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);
        
        
        label3=new JLabel("Last Name:");
        label3.setBounds(250,150, 150, 30);
        label3.setFont(f);
        label3.setForeground(Color.YELLOW);
        c.add(label3);
        
         tf3=new JTextField();
        tf3.setBounds(350,150, 220, 30);
        tf3.setFont(f);
        tf3.setForeground(Color.BLACK);
        tf3.setBackground(Color.WHITE);
         c.add(tf3);
        
        label4=new JLabel("Username:");
        label4.setBounds(250,200, 150, 30);
        label4.setFont(f);
        label4.setForeground(Color.YELLOW);
        c.add(label4);
        
         tf4=new JTextField();
        tf4.setBounds(350,200, 220, 30);
        tf4.setFont(f);
        tf4.setForeground(Color.BLACK);
        tf4.setBackground(Color.WHITE);
         c.add(tf4);
        
        label5=new JLabel("Password:");
        label5.setBounds(250,250, 150, 30);
        label5.setFont(f);
        label5.setForeground(Color.YELLOW);
        c.add(label5);
        
        pf1=new JPasswordField();
        pf1.setBounds(350,250, 220, 30);
        pf1.setFont(f);
        pf1.setForeground(Color.BLACK);
        pf1.setBackground(Color.WHITE);
        c.add(pf1);
        
        label6=new JLabel("Confirm Pass:");
        label6.setBounds(250,300, 150, 30);
        label6.setFont(f);
        label6.setForeground(Color.YELLOW);
        c.add(label6);
        
        pf2=new JPasswordField();
        pf2.setBounds(350,300, 220, 30);
        pf2.setFont(f);
        pf2.setForeground(Color.BLACK);
        pf2.setBackground(Color.WHITE);
        c.add(pf2);
        
        
        
        
        label7=new JLabel("Birth Date:");
        label7.setBounds(250,350, 150, 30);
        label7.setFont(f);
        label7.setForeground(Color.YELLOW);
        c.add(label7);
        
        tf5=new JTextField();
        tf5.setBounds(350, 350, 220, 30);
        tf5.setFont(f);
        tf5.setForeground(Color.BLACK);
        tf5.setBackground(Color.WHITE);
         c.add(tf5);
        
       
         
        gmail=new JLabel("Gmail:");
        gmail.setBounds(250,400, 150, 30);
        gmail.setFont(f);
        gmail.setForeground(Color.YELLOW);
        c.add(gmail);
        
        
        
       
        
        tf6=new JTextField();
        tf6.setBounds(350, 400, 220, 30);
        tf6.setFont(f);
        tf6.setForeground(Color.BLACK);
        tf6.setBackground(Color.WHITE);
         c.add(tf6);
        
        cancel=new JButton("Clear");
        cancel.setBounds(580, 480, 100, 30);
        cancel.setFont(f);
        cancel.setForeground(Color.RED);
        cancel.setBackground(Color.WHITE);
        c.add(cancel);
        
        
                 
          cancel.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                 tf2.setText("");
                 tf3.setText("");
                  tf4.setText("");
                  tf5.setText("");
                  
                   ta.setText("");
                
                pf1.setText("");
                 pf2.setText("");
            }
            
        });         
                  
        
        back=new JButton("Back");
        back.setBounds(180, 480, 100, 30);
        back.setFont(f);
        back.setForeground(Color.BLUE);
        back.setBackground(Color.WHITE);
        c.add(back);
        
         
        back.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                
                JOptionPane.showMessageDialog(null, "Back to Login form");
                    dispose();
                    Login frame=new Login();
                    frame.setVisible(true);
               
            }
            
        });
        
         
        register=new JButton("Register");
        register.setBounds(380, 480, 100, 30);
        //register.setFont(f);
        register.setForeground(Color.BLUE);
        register.setBackground(Color.WHITE);
        c.add(register);
        
        /*
        register.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                
                JOptionPane.showMessageDialog(null, "Wellcome to logiin form");
                    dispose();
                    Login frame=new Login();
                    frame.setVisible(true);
               
            }
            
        });
        */
        
        
        
        
        
        
        register.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                String FirstName=tf2.getText();
                String LastName=tf3.getText();
                String userName=tf4.getText();
                String password=pf1.getText();
                String RetypePass=pf2.getText();
                String BirthDate=tf5.getText();
                String gmail=tf6.getText();
                
                
                if(FirstName.equals("Abu jafar")&& LastName.equalsIgnoreCase("sisty")&& userName.equals("sisty")&& password.equals("123")&& RetypePass.equals("123")&& BirthDate.equals("01/01/2002")&& gmail.equals("sisty@gmail.com"))
                {
                    JOptionPane.showMessageDialog(null, "you are successfully Registration");
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
        
    }
    
    
    
    public static void main(String[] args) {
        
        RegisterFrame frame=new RegisterFrame();
        frame.setVisible(true);
        
        
        
    }
    
}
