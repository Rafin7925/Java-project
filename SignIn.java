package Class;
import javax.swing.*;    
import java.awt.*;
import java.awt.Desktop;
import java.net.URI;
import java.awt.event.*;
import java.io.*;

public class SignIn{
	
	private JFrame f = new JFrame("Sign In");
	
	SignIn(){
		
	f.setSize(800,600);
		f.getContentPane().setBackground(new Color(229,235,226));
		f.setLayout(null);
		
	Font font1 = new Font("Arial",Font.BOLD,18);
		Font font2 = new Font("Arial",Font.BOLD,30);
		Font font3 = new Font("Arial",Font.BOLD,13);
		Font font4 = new Font("Arial",Font.BOLD,10);
		Font font5 = new Font("Algerian",Font.BOLD,35);
		Font font6 = new Font("Cambria Math",Font.BOLD,25);
		
		
		//logo------------------------------------
		
		JLabel l9=new JLabel("AirHopper");    
		l9.setBounds(15,15,300,40);
		l9.setFont(font5);
		l9.setForeground(Color.BLUE);
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		l9.setCursor(cursor);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(15,50,195,2);
		panel.setBackground(new Color(124, 180, 107));
		
		//Login panel---------------------------
	JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBounds(325,250,400,250);
		loginPanel.setBackground(new Color(45,  129, 131));
		
	JLabel l1=new JLabel("Username :");    
		l1.setBounds(55,80, 130,28);
		l1.setFont(font1);
		l1.setForeground(Color.black);
		
	final JTextField textFild = new JTextField(); 
		textFild.setBounds(180,80, 160,28);
	 
	JLabel l2=new JLabel("Password :");    
		l2.setBounds(55,140, 130,28); 
		l2.setFont(font1);
		l2.setForeground(Color.black);
		
	final JPasswordField passwordField = new JPasswordField();   
		passwordField.setBounds(0,0, 132,28);
		
	JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(null);
		passwordPanel.setBounds(180,140, 132,28);
		passwordPanel.setBackground(new Color(0,0,0));
		
	JButton loginButton = new JButton("Sign In");  
		loginButton.setBounds(150,210, 100,30);
		loginButton.setBackground(new Color(192, 213, 232));
		loginButton.setCursor(cursor);
		
		

	ImageIcon closeImgIcon = new ImageIcon("H:\\Java Project\\Image\\close.png");
		Image image1 = closeImgIcon.getImage();
		Image temp_image1 = image1.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon = new ImageIcon(temp_image1);
		JLabel closeImg = new JLabel(closeImgIcon);
		closeImg.setBounds(0,0, 28,28);
		closeImg.setLayout(null);
		
	JButton openButton = new JButton();  
		openButton.setBounds(0,0, 28,28);
		openButton.setContentAreaFilled(false);
		openButton.setCursor(cursor);
		
	JPanel loginPanel1 = new JPanel();
		loginPanel1.setLayout(null);
		loginPanel1.setBounds(311,140, 28,28);
		loginPanel1.setBackground(new Color(124, 180, 107));
		
		
		
	ImageIcon openImgIcon = new ImageIcon("H:\\Java Project\\Image\\open.png");
		Image image = openImgIcon.getImage();
		Image temp_image = image.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		openImgIcon = new ImageIcon(temp_image);
		JLabel openImg = new JLabel(openImgIcon);
		openImg.setBounds(0,0, 28,28);
		openImg.setLayout(null);
		
	JButton closeButton = new JButton();  
		closeButton.setBounds(0,0, 28,28);
		closeButton.setContentAreaFilled(false);
		closeButton.setCursor(cursor);
		
	JPanel loginPanel2 = new JPanel();
		loginPanel2.setLayout(null);
		loginPanel2.setBounds(311,140, 28,28);
		loginPanel2.setBackground(new Color(45,  129, 131));
		loginPanel2.setVisible(false);

		
	final JTextField textFild1 = new JTextField(); 
		textFild1.setBounds(0,0, 132,28);
		textFild1.setVisible(false);
		
	JLabel l7=new JLabel("Login using social networks");    
		l7.setBounds(120,8, 300,15); 
		l7.setFont(font3);
		l7.setForeground(Color.black);
		
	JLabel l8=new JLabel("__________________OR__________________");    
		l8.setBounds(85,50,240,20); 
		l8.setFont(font4);
		l8.setForeground(Color.black);
		
		
	JLabel fbLabel = new JLabel();
		fbLabel = setImgWithResize("H:\\Java Project\\Image\\fb.png",150,25, 22,22,22,22);
		fbLabel.setCursor(cursor);
		JLabel gmailLabel = new JLabel();
		gmailLabel = setImgWithResize("H:\\Java Project\\Image\\gmail.png",190,25, 22,22,22,22);
		gmailLabel.setCursor(cursor);
		JLabel twitterLabel = new JLabel();
		twitterLabel = setImgWithResize("H:\\Java Project\\Image\\twitter.png",226,22, 30,30,30,30);
		twitterLabel.setCursor(cursor);
		
		 
	JLabel ll2=new JLabel("Change password");    
		ll2.setBounds(148,180, 105,20); 
		ll2.setForeground(Color.black);
		ll2.setCursor(cursor);
		 
	ll2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ll2.setForeground(Color.black);
				new ChangePassword();
				f.setVisible(false);
			}
			public void mouseEntered(MouseEvent e) {  
				ll2.setForeground(Color.blue);
			}  
			public void mouseExited(MouseEvent e) {  
				ll2.setForeground(Color.black);
			}  
			
		});
		 
		 
		 
		link(fbLabel,0);
		link(gmailLabel,1);
		link(twitterLabel,2);
		
		
		
		
		//--------------
	JLabel l6=new JLabel("Login to Your Account");    
		l6.setBounds(360,110, 330,40); 
		l6.setFont(font2);
		l6.setForeground(Color.black);
		
		
		
		
		//SignUp panel---------------------
	JPanel signupPanel = new JPanel();
		signupPanel.setLayout(null);
		signupPanel.setBounds(0,0,250,600);
		signupPanel.setBackground(new Color(171, 214, 223));
		
	JButton signupButton = new JButton("Sign Up");  
		signupButton.setBounds(75,320, 100,30);
		
		signupButton.setBackground(new Color(192, 213, 232));
		signupButton.setCursor(cursor);
		
	JLabel l3=new JLabel("New Here?");    
		l3.setBounds(45,130, 190,40); 
		l3.setFont(font2);
		l3.setForeground(Color.black);
		
	JLabel l4=new JLabel("Sign Up and discover a great");    
		l4.setBounds(30,210, 210,20); 
		l4.setFont(font3);
		l4.setForeground(Color.black);
		
	JLabel l5=new JLabel("amount of new opportunities!");    
		l5.setBounds(30,230, 210,20); 
		l5.setFont(font3);
		l5.setForeground(Color.black);
		
		
	JLabel ll=new JLabel("");    
		ll.setBounds(580,530,300,20);
		ll.setForeground(Color.black);
		//add -----------
		
		f.add(loginPanel);
		f.add(signupPanel);
		f.add(l6);
		f.add(ll);
		
		
		loginPanel.add(l1);
		loginPanel.add(textFild);
		loginPanel.add(l2);
		loginPanel.add(passwordPanel);
		loginPanel.add(loginButton);
		loginPanel.add(loginPanel1);
		loginPanel.add(loginPanel2);
		loginPanel.add(l7);
		loginPanel.add(l8);
		loginPanel.add(fbLabel);
		loginPanel.add(gmailLabel);
		loginPanel.add(twitterLabel);
		loginPanel.add(ll2);
		
		
		passwordPanel.add(passwordField);
		passwordPanel.add(textFild1);
		
		loginPanel1.add(closeImg);
		closeImg.add(openButton);
		
		loginPanel2.add(openImg);
		openImg.add(closeButton);
		
		signupPanel.add(signupButton);
		signupPanel.add(l3);
		signupPanel.add(l4);
		signupPanel.add(l5);
		signupPanel.add(l9);
		//signupPanel.add(l10);
		signupPanel.add(panel);

		
		
		
		
		
		
		//Action Listener -----------
		 loginButton.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
			boolean matched = false;
				
			try{
				String s1 = textFild.getText();
				String s2 = passwordField.getText();
				String s3 = textFild.getText().concat(".txt");
				
				File file = new File(s3);
				boolean check = file.exists();
				
				System.out.println(s3);
				
				if(check==true){
					FileReader fr = new FileReader(s3);
					BufferedReader br = new BufferedReader(fr);
					String line;
				
					while((line = br.readLine())!=null){
					if(line.equals(s1+"\t"+s2)){
						matched = true;
						break;
					}}
					fr.close();
					if(matched){
						
						FileWriter fw = new FileWriter("tmp.txt",false);
						fw.write(s3);
						
						new PostSignIn();
						f.setVisible(false);
						JOptionPane.showMessageDialog(f,"Successfully signed in");
						
						fw.close(); 
					}
					else{
						JOptionPane.showMessageDialog(f,"Wrong Password");  
					}
				}
				else{
					JOptionPane.showMessageDialog(f,"Wrong Username");
				}
				
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				
				
		 }});
		 
		 
		 
		 signupButton.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				new Signup();
				f.setVisible(false);
		 }}); 
		 
		 openButton.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
			 
			String s1 = passwordField.getText();
			passwordField.setVisible(false);
			loginPanel1.setVisible(false);
			loginPanel2.setVisible(true);
			textFild1.setVisible(true);
			textFild1.setText(s1);
			 
		 }});
		
		closeButton.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
			 
			String s1 = textFild1.getText();
			passwordField.setVisible(true);
			textFild1.setVisible(false);
			loginPanel1.setVisible(true);
			loginPanel2.setVisible(false);
			passwordField.setText(s1);
			 
		 }});
		 
		 //Mouse Listener
		 logoMouseListener(l9);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\arafa\\Downloads\\Java Project\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public JLabel setImgWithResize(String s ,int x,int y,int w,int h,int px1, int px2){
			
			ImageIcon imgWithResizeIcon = new ImageIcon(s);
			Image img = imgWithResizeIcon.getImage();
			Image temp_img = img.getScaledInstance(px1,px2,Image.SCALE_SMOOTH);
			imgWithResizeIcon = new ImageIcon(temp_img);
		
			JLabel imgWithResize = new JLabel("", imgWithResizeIcon , JLabel.CENTER);
			imgWithResize.setBounds(x,y,w,h);
			imgWithResize.setLayout(null);
			return imgWithResize;

		}
		
	public void logoMouseListener(JLabel label){
		
		label.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {  
				new Welcome();
				f.setVisible(false);
			}  
			
		});
		
	}
	public void link(JLabel l , int x){
		l.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {  
			try {
				if(x==0){
					Desktop desk = Desktop.getDesktop();
					desk.browse(new URI("https://www.facebook.com/"));
				}
				
				if(x==1){
					Desktop desk = Desktop.getDesktop();
					desk.browse(new URI("https://www.google.com/gmail/about/"));
				}
				
				if(x==2){
					Desktop desk = Desktop.getDesktop();
					desk.browse(new URI("https://twitter.com/i/flow/login"));
				}
				
			}catch(Exception e1){}
			} 
		});}
	
	
	public static void main(String [] args){
		
		new SignIn();
		
	}
	
	
}