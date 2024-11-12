package Class;
import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class information{
          
		  String filename=null;
		  byte[] p_i=null;
		  String s,st1,st2,st3,st4,st5,st6,st7,st8;
		  
	{
		
		File file = new File("tmp.txt");
		boolean check = file.exists();
		try{
			
			
			if(check==true){
				FileReader fr = new FileReader("tmp.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				
				while((line = br.readLine())!=null){
					s = line;
					System.out.println(s);
				}
				fr.close();
			}
		
		FileReader fr = new FileReader(s);
		BufferedReader br = new BufferedReader(fr);
		String line;
					
		int count = 1 ;
				
		while((line = br.readLine())!=null){
			if(count==1){
				st1 = line;
				st1 = st1.substring(0,6);
				System.out.println("st1 ::"+st1+"\n");
			}
			if(count==2){
				st2=line;
				st2 = st2.substring(13);
				System.out.println("st2 ::"+st2+"\n");
			}
			if(count==3){
				st3=line;
				st3 = st3.substring(12);
				System.out.println("st3 ::"+st3+"\n");
			}
			if(count==4){
				st4=line;
				st4 = st4.substring(9);
				System.out.println("st4 ::"+st4+"\n");
			}
			if(count==5){
				st5=line;
				st5 = st5.substring(8);
				System.out.println("st5 ::"+st5+"\n");
			}
			if(count==6){
				st6=line;
				st6 = st6.substring(10);
				System.out.println("st6 ::"+st6+"\n");
			}
			if(count==7){
				st7=line;
				st7 = st7.substring(16);
				System.out.println("st7 ::"+st7+"\n");
			}
			if(count==8){
				st8=line;
				st8 = st8.substring(9);
				System.out.println("st8 ::"+st8+"\n");
			}
			
			
			count++;			
						
		}
		fr.close();			
		
		}catch(Exception e1)
		{
			System.out.println(e1);
		}



		
	}
   information(){
		
//frame
	JFrame f = new JFrame("My Profile");
	f.getContentPane().setBackground(new Color(232, 235, 226));
	
//font
	Font font1 = new Font("MANOSPAC", Font.BOLD, 16);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,10);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	
	//Header -------------
	JPanel heading = new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(171,214,223));
	heading.setBounds(0,0,220,600);
	
	
	JLabel travel = new JLabel("AirHopper");
	travel.setBounds(20,15,150,40);
	travel.setFont(font5);
        travel.setForeground(Color.BLUE);
	heading.add(travel);
	Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		travel.setCursor(cursor1);
		travel.setLayout(null);
    travel.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new PostSignIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    travel.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
    JLabel com = new JLabel("");
	com.setForeground(new Color(255,0,0));
	com.setBounds(120,17,80,40);
    com.setFont(font4);
    heading.add(com);
	JPanel panel5=new JPanel();  
    panel5.setBounds(18,45,145,2);    
    panel5.setBackground(new Color(124, 180, 107)); 
    heading.add(panel5);
	
		
	
//panel---------------
	JPanel login = new JPanel();
	login.setLayout(null);
	login.setBounds(220,0,600,600);
	//login.setBackground(Color.Blue);
	login.setBackground(new Color(124, 180, 107));
	
//all name

      JPanel login1 = new JPanel();
	login1.setLayout(null);
	login1.setBounds(420,100,110,110);
	login1.setBackground(Color.white);
	login.add(login1);
	ImageIcon profile = new ImageIcon("H:\\Java Project\\Image\\profile.png");
    Image img1 = profile.getImage();
    Image temp_img2 = img1.getScaledInstance(60,60,Image.SCALE_SMOOTH);
	profile = new ImageIcon(temp_img2);
	JLabel b2 = new JLabel("", profile , JLabel.CENTER);
	b2.setBounds(20,20,60,60);
	login1.add(b2);
	b2.setLayout(null);
	
    JLabel l33=new JLabel();    
    l33.setBounds(0,0,110,110);
	l33.setFont(font2);
	l33.setForeground(Color.black);
	login1.add(l33);
	 Cursor cursor124 = new Cursor(Cursor.HAND_CURSOR);
		//b2.setCursor(cursor12);
		b2.setLayout(null);
    b2.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
	
	JFileChooser c=new JFileChooser();
	c.showOpenDialog(null);
	File f1=c.getSelectedFile();
	filename=f1.getAbsolutePath();
	ImageIcon i=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(110,110,Image.SCALE_SMOOTH));
	l33.setIcon(i);
	b2.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b2.setToolTipText("Please add your photo");}  
	
  });
	
    JLabel l314=new JLabel("Profile");    
    l314.setBounds(250,30,100,30);
	l314.setFont(font1);
	l314.setForeground(Color.black);
	login.add(l314);

    

    JLabel l1=new JLabel("Personal Information");    
    l1.setBounds(20,90, 250,30);
	l1.setFont(font1);
	l1.setForeground(Color.black);
	login.add(l1);
	
    JLabel n1=new JLabel("Full Name");    
    n1.setBounds(50,120, 80,30);
	n1.setFont(font2);
	n1.setForeground(Color.black);
	login.add(n1);
	JLabel n12=new JLabel();    
    n12.setBounds(200,120, 100,30);
	n12.setFont(font2);
	n12.setForeground(Color.black);
	n12.setText(st2+" "+st3);
	login.add(n12);
	
	JLabel l2=new JLabel("Username");    
    l2.setBounds(50,160, 120,30);
	l2.setFont(font2);
	l2.setForeground(Color.black);
	login.add(l2);
	JLabel l23=new JLabel();    
    l23.setBounds(200,160, 100,30);
	l23.setFont(font2);
	l23.setText(st1);
	l23.setForeground(Color.black);
	login.add(l23);
	
	JLabel gender = new JLabel("Gender");
    gender.setFont(font2);
    gender.setBounds(50,200,128,30);
	gender.setForeground(Color.black);
    login.add(gender);
	JLabel gender1 = new JLabel();
    gender1.setFont(font2);
    gender1.setBounds(200,200,100,30);
	gender1.setForeground(Color.black);
	gender1.setText(st8);
    login.add(gender1);
	
	JLabel dob = new JLabel("Date Of Birth");
     dob.setFont(font2);
     dob.setBounds(50,240,100,30);
	 dob.setForeground(Color.black);
     login.add(dob);
	 JLabel dob1 = new JLabel();
     dob1.setFont(font2);
     dob1.setBounds(200,240,200,30);
	 dob1.setText(st7);
	 dob1.setForeground(Color.black);
     login.add(dob1);
 

	 
	JLabel ll1=new JLabel("Contact Information");    
    ll1.setBounds(20,290, 250,15);
	ll1.setFont(font1);
	ll1.setForeground(Color.black);
	login.add(ll1);
	
    JLabel n=new JLabel("Contacts Number");    
    n.setBounds(50,310, 128,30);
	n.setFont(font2);
	n.setForeground(Color.black);
	login.add(n);
	JLabel n3=new JLabel();    
    n3.setBounds(200,310, 128,30);
	n3.setFont(font2);
	n3.setText(st4);
	n3.setForeground(Color.black);
	login.add(n3);
	
	
    JLabel pa1=new JLabel("Email ");    
    pa1.setBounds(50,350, 135,30);
	pa1.setFont(font2);
	pa1.setForeground(Color.black);
	login.add(pa1);
	JLabel pa17=new JLabel();    
    pa17.setBounds(200,350, 150,30);
	pa17.setFont(font2);
	pa17.setText(st5);
	pa17.setForeground(Color.black);
	login.add(pa17);
	
    JLabel ll12=new JLabel("Address");    
    ll12.setBounds(20,400, 250,15);
	ll12.setFont(font1);
	ll12.setForeground(Color.black);
	login.add(ll12);
	
	
    JLabel pa12=new JLabel("Country ");    
    pa12.setBounds(50,420,135,30);
	pa12.setFont(font2);
	pa12.setForeground(Color.black);
	login.add(pa12);
	JLabel pa124=new JLabel();    
    pa124.setBounds(200,420,200,30);
	pa124.setFont(font2);
	pa124.setText(st6);
	pa124.setForeground(Color.black);
	login.add(pa124);
	
	
    JLabel pa123=new JLabel("Address ");    
    pa123.setBounds(50,460,135,30);
	pa123.setFont(font2);
	pa123.setForeground(Color.black);
	
	JLabel pa1234=new JLabel();    
    pa1234.setBounds(200,460,200,30);
	pa1234.setFont(font2);
	pa1234.setForeground(Color.black);
	
	
	
	//Button------------
	
	
	ImageIcon backgroundIcon = new ImageIcon("H:\\Java Project\\Image\\i.png");
    Image img = backgroundIcon.getImage();
    Image temp_img = img.getScaledInstance(15,15,Image.SCALE_SMOOTH);
	backgroundIcon = new ImageIcon(temp_img);
	JLabel background = new JLabel("", backgroundIcon , JLabel.CENTER);
	background.setBounds(310,547,15,15);
	login.add(background);
	background.setLayout(null);
	
  
  ImageIcon backgroundIcon12 = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
	Image img6 = backgroundIcon12.getImage();
    Image temp_img6 = img6.getScaledInstance(50,50,Image.SCALE_SMOOTH);
	backgroundIcon12 = new ImageIcon(temp_img6);
	JLabel l32 = new JLabel("", backgroundIcon12 , JLabel.CENTER);
	l32.setBounds(510,10,50,50);
	l32.setLayout(null);
	login.add(l32);
	Cursor cursor123 = new Cursor(Cursor.HAND_CURSOR);
		l32.setCursor(cursor123);
		l32.setLayout(null);
    l32.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new PostSignIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    l32.setToolTipText("Back");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
//panel add
  f.add(heading);
    f.add(login);

//add
	 Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
	 f.setIconImage(icon);
	 f.setSize(800,600);
	 f.setLayout(null); 
	 f.setVisible(true);   
	 f.setLocationRelativeTo(null);
	 f.setResizable(false);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
		
  public static void main(String [] args){
		
		new information();
		
	
	
	}
}