package Class;

import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.io.*;

public class Signup{
	
	private String s,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10 ,s11,s12,s13;
	private String s01,s02,s03,s04,s05,s06;
	private int x1=0,x2=0,x3=0,x4=0,x5=0;
	private String gender1 []={"Gender","Male","Female","Others"};
        private JLabel label;
         
    private String dates[]= {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31" };
    private String months[]
        = {"Months", "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = {"Year","1990","1991","1992","1993","1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022"};
    private String country[]
	       ={"Select Country","Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Australia","Austria","Austrian Empire",
"Azerbaijan","Baden","Bahamas","Bahrain","Bangladesh","Barbados","Bavaria","Belarus","Belgium","Belize","Benin","Bolivia","Bosnia and Herzegovina",
"Botswana","Brazil","Brunei","Brunswick and Lüneburg","Bulgaria","Burkina Faso","Burma","Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Cayman Islands",
"The Central African Republic","Central American Federation","Chad","Chile","China","Colombia","Comoros","Congo Free State", "The Costa Rica","Cote d’Ivoire (Ivory Coast)",
"Croatia","Cuba","Cyprus","Czechia","Czechoslovakia","Democratic Republic of the Congo","Denmark","Djibouti","Dominica","Dominican Republic","Duchy of Parma",
"East Germany","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Eswatini","Ethiopia","Fiji","Finland","France","Georgia","Germany","Ghana",
"Haiti","Holy See","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya",
"Korea","Kosovo","Kuwait","Kyrgyzstan","Liberia","Libya","Liechtenstein","Lithuania","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius",
"Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nassau","Nauru","Nepal","Netherlands", "The New Zealand","Nicaragua","Niger","Nigeria","North German Confederation","North German Union",
"North Macedonia","Norway","Oldenburg","Oman","Orange Free State","Pakistan","Palau","Panama","Papal States","Papua New Guinea","Paraguay","Peru","Philippines","Piedmont-Sardinia","Poland","Portugal",
"Qutar","Romania","Russia","Rwanda","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","South Africa","South Sudan","Spain","SriLanka","Sudan","Suriname","Sweden","Switzerland",
		   "Thailand","Turkey","Uganda","Ukraine","United Arab Emirates","The United Kingdom", "The Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Württemberg","Yemen","Zambia","Zimbabwe"};
    Signup() { 
	//font --------------- 
	Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	
	
	//Frame --------------
	JFrame f=new JFrame("Sing Up");
	f.getContentPane().setBackground(new Color(232, 235, 226));
	
	
	
	//Header -------------
	JPanel heading = new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(229,235,226));
	heading.setBounds(0,0,210,600);
	
      
	
	JLabel travel = new JLabel("AIRHOPPER");
	travel.setBounds(20,15,300,40);
	travel.setFont(font5);
	travel.setForeground(Color.BLACK);
	heading.add(travel);
        
	Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		travel.setCursor(cursor1);
		travel.setLayout(null);
    travel.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Welcome();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    travel.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
 
	
	JPanel panel5=new JPanel();  
    panel5.setBounds(18,45,145,2);    
    panel5.setBackground(new Color(124, 180, 107)); 
    heading.add(panel5);
	
    
    
	JLabel j =new JLabel("Already Have An Account?");
	j.setBounds(10,250,190,30);
	j.setFont(font2);
	heading.add(j);
	JButton b4 = new JButton("Sign In");
    // b4.setBackground(new Color(232, 235, 226));
	b4.setBounds(50,290,100,30);
	
	 heading.add(b4);
	 Cursor cursor16 = new Cursor(Cursor.HAND_CURSOR);
		b4.setCursor(cursor1);
		b4.setLayout(null);
		b4.addMouseListener(new MouseAdapter(){
	
	public void mouseEntered(MouseEvent e) { 
    b4.setToolTipText("Please Sign In");}  
	
  });
		
  
	//Login panel---------------
	JPanel login = new JPanel();
	login.setLayout(null);
	login.setBounds(210,0,600,600);
	//login.setBackground(Color.Blue);
	login.setBackground(new Color(45,  129, 131));
	
	
	
	//Name-----------------
	JLabel name = new JLabel("Sign Up");
	name.setBounds(50,05,200,40);
	name.setFont(font1);
	name.setForeground(Color.black);
	login.add(name);
	
	JLabel name1 = new JLabel("Please Fill This Form To Create An Account!");
	name1.setBounds(50,35, 350,40);
	name1.setFont(font2);
	name1.setForeground(Color.black);
	login.add(name1);
	
	JPanel panel4=new JPanel();  
     panel4.setBounds(0,70,600,02);    
    panel4.setBackground(new Color(232, 235, 226)); 
    login.add(panel4);
		
	final JTextField text = new JTextField();
	text.setBounds(185,92, 150,30);
	text.setLayout(null);
	text.setFont(font2);
    text.setOpaque(false);
    text.setForeground(new Color(0x292929));
    text.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(text);
    JLabel l1=new JLabel("Fist Name:");    
    l1.setBounds(50,90, 100,30);
	l1.setFont(font2);
	l1.setForeground(Color.black);
	login.add(l1);
	JLabel t17=new JLabel();    
    t17.setBounds(360,90,200,30);
	t17.setFont(font3);
	t17.setForeground(Color.red);
	login.add(t17);
	text.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-zA-Z]{3,30}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(text.getText());
		if(!m.matches()){
			t17.setText("Name is incorrect!");
			x1++;
		}
		else{
			 t17.setText(null);
			 x1--;
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
	
	
	final JTextField t= new JTextField(); 	
    t.setBounds(185,132, 150,30);
	t.setLayout(null);
	t.setFont(font2);
    t.setOpaque(false);
    t.setForeground(new Color(0x292929));
    t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(t);
	JLabel t11=new JLabel();    
    t11.setBounds(360,130,200,30);
	t11.setFont(font3);
	t11.setForeground(Color.red);
	login.add(t11);
	t.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-zA-Z]{3,30}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(t.getText());
		if(!m.matches()){
			t11.setText("Name is incorrect!");
			x2++;
		}
		else{
			t11.setText(null);
			x2--;
			
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel t1=new JLabel("Last Name:");    
    t1.setBounds(50,130, 150,30);
	t1.setFont(font2);
	t1.setForeground(Color.black);
	login.add(t1);
	
	final JTextField text1 = new JTextField(); 
    text1.setBounds(185,172, 150,30);
	text1.setLayout(null);
	text1.setFont(font2);
    text1.setOpaque(false);
    text1.setForeground(new Color(0x292929));
    text1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(text1); 
	JLabel t12=new JLabel();    
    t12.setBounds(360,170,200,30);
	t12.setFont(font3);
	t12.setForeground(Color.red);
	login.add(t12);
	text1.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-z0-9]{8,32}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(text1.getText());
		if(!m.matches()){
			t12.setText("Username is incorrect!");
			x3++;
		}
		else{
			t12.setText(null);
			x3--;
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel l11=new JLabel("Username");    
    l11.setBounds(50,170, 120,30);
	l11.setFont(font2);
	l11.setForeground(Color.black);
	login.add(l11);
	
	final JTextField t2 = new JTextField(); 
    t2.setBounds(185,212, 150,30);
	t2.setLayout(null);
	t2.setFont(font2);
    t2.setOpaque(false);
    t2.setForeground(new Color(0x292929));
    t2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(t2); 
	JLabel t13=new JLabel();    
    t13.setBounds(360,210,200,30);
	t13.setFont(font3);
	t13.setForeground(Color.red);
	login.add(t13);
	t2.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[0-9]{3,12}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(t2.getText());
		if(!m.matches()){
			t13.setText("Contacts Number is incorrect!");
			x4++;
		}
		else{
			t13.setText(null);
			x4--;
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel n=new JLabel("Contacts Number:");    
    n.setBounds(50,210, 128,30);
	n.setFont(font2);
	n.setForeground(Color.black);
	login.add(n);
	
	final JTextField p = new JTextField(); 
    p.setBounds(185,252,150,30);
    p.setLayout(null);
	p.setFont(font2);
    p.setOpaque(false);
    p.setForeground(new Color(0x292929));
    p.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(p);
	JLabel t133=new JLabel();    
    t133.setBounds(360,250,200,30);
	t133.setFont(font3);
	t133.setForeground(Color.red);
	login.add(t133);
	p.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-z0-9]{3,30}[@][a-zA-Z]{3,10}[.][a-zA-Z]{2,6}$";
		Pattern p1=Pattern.compile(s1);
		Matcher m=p1.matcher(p.getText());
		if(!m.matches()){
			t133.setText("Email is incorrect!");
			x5++;
		}
		else{
			t133.setText(null);
			x5--;
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel pa1=new JLabel("Email: ");    
    pa1.setBounds(50,250, 135,30);
	pa1.setFont(font2);
	pa1.setForeground(Color.black);
	login.add(pa1);
	
	final JLabel gender = new JLabel("Gender:");
    gender.setFont(font2);
    gender.setBounds(50,290,128,30);
	gender.setForeground(Color.black);
    login.add(gender);
 
	JComboBox g = new JComboBox(gender1);
	g.setFont(font2);
    g.setBounds(185,290,100,30);
    g.setBackground(new Color(45,  129, 131));
    g.setFocusable(false);
    g.setForeground(Color.black);
	login.add(g);
	

    JLabel c11=new JLabel("Country:");    
    c11.setBounds(50,330, 100,30);
	c11.setFont(font2);
	c11.setForeground(Color.black);
	login.add(c11);
	JComboBox co = new JComboBox(country);
	co.setFont(font2);
    co.setBounds(185,330,130,30);
    co.setBackground(new Color(45,  129, 131));
   co.setFocusable(false);
   co.setForeground(Color.black);
   
	login.add(co);
	
	
	final JLabel dob = new JLabel("Date Of Birth:");
     dob.setFont(font2);
     dob.setBounds(50,370,100,30);
	 dob.setForeground(Color.black);
     login.add(dob);
 
     JComboBox date = new JComboBox(dates);
     date.setFont(font2);
     date.setBounds(185,370,60,30);
	 date.setBackground(new Color(45,  129, 131));
    date.setFocusable(false);
    date.setForeground(Color.black);
     login.add(date);
 
     JComboBox month = new JComboBox(months);
     month.setFont(font2);
     month.setBounds(245,370,90,30);
	 month.setBackground(new Color(45,  129, 131));
     month.setFocusable(false);
     month.setForeground(Color.black);
     login.add(month);
 
     JComboBox year = new JComboBox(years);
     year.setFont(font2);
     year.setBounds(335,370,90,30);
	 year.setBackground(new Color(45,  129, 131));
     year.setFocusable(false);
     year.setForeground(Color.black);
     login.add(year);
 
	
	
	
	//Password---------------
	final JPasswordField value = new JPasswordField();   
	value.setEchoChar('*');
    value.setBounds(185,412, 150,30);
	value.setLayout(null);
	value.setFont(font2);
    value.setOpaque(false);
    value.setForeground(new Color(0x292929));
    value.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	value.setText(null);
	login.add(value);
	
	JLabel l2=new JLabel("Password:");    
    l2.setBounds(50,410, 100,30); 
	l2.setFont(font2);
	l2.setForeground(Color.black);
	login.add(l2);
	
	final JTextField textFild = new JTextField(); 
	textFild.setBounds(185,412,150,30);
	textFild.setLayout(null);
	textFild.setFont(font2);
    textFild.setOpaque(false);
    textFild.setForeground(new Color(0x292929));
    textFild.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	textFild.setVisible(false);
	login.add(textFild);
	
	ImageIcon closeImgIcon = new ImageIcon("H:\\Java Project\\Image\\close.png");
	Image img4 = closeImgIcon.getImage();
	Image temp_img4 = img4.getScaledInstance(20,20,Image.SCALE_SMOOTH);
	closeImgIcon = new ImageIcon(temp_img4);
	JLabel closeImg = new JLabel("", closeImgIcon , JLabel.CENTER);
	closeImg.setBounds(336,415, 30,30);
	closeImg.setLayout(null);
	login.add(closeImg);
	
	
	ImageIcon closeImgIcon1 = new ImageIcon("H:\\Java Project\\Image\\open.png");
	Image img1 = closeImgIcon1.getImage();
	Image temp_img1 = img1.getScaledInstance(20,20,Image.SCALE_SMOOTH);
	closeImgIcon1 = new ImageIcon(temp_img1);
	JLabel openImg = new JLabel("", closeImgIcon1 , JLabel.CENTER);
	openImg.setBounds(336,415, 30,30);
	openImg.setLayout(null);
	openImg.setVisible(false); 
	login.add(openImg);
	

	Cursor cursor17 = new Cursor(Cursor.HAND_CURSOR);
    closeImg.setCursor(cursor1);
	closeImg.setLayout(null);
	closeImg.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
		String s1 = value.getText();
		value.setVisible(false);
		closeImg.setVisible(false);
			
			textFild.setVisible(true);
			openImg.setVisible(true);
				textFild.setText(s1);
	}  
	
  });
  Cursor cursor18 = new Cursor(Cursor.HAND_CURSOR);
    openImg.setCursor(cursor18);
	openImg.setLayout(null);
  openImg.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
		String s1 = textFild.getText();
		value.setVisible(true);
			closeImg.setVisible(true);
			
			textFild.setVisible(false);
			openImg.setVisible(false); 
			value.setText(s1);
	}  
	
  });
  
 
	final JPasswordField value1 = new JPasswordField();  //***********************************
    value1.setEchoChar('*');	
    value1.setBounds(185,452, 150,30);
	value1.setLayout(null);
	value1.setFont(font2);
    value1.setOpaque(false);
    value1.setForeground(new Color(0x292929));
	value1.setText(null);
    value1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login.add(value1);
	JLabel value2=new JLabel("Confirm Password:");    
    value2.setBounds(50,450, 135,30); 
	value2.setFont(font2);
	value2.setForeground(Color.black);
	login.add(value2);
	
	final JTextField textFild3 = new JTextField(); 
	textFild3.setBounds(185,452,150,30);
	textFild3.setLayout(null);
	textFild3.setFont(font2);
    textFild3.setOpaque(false);
    textFild3.setForeground(new Color(0x292929));
    textFild3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	textFild3.setVisible(false);
	login.add(textFild3);
	ImageIcon closeImgIcon12 = new ImageIcon("H:\\Java Project\\Image\\close.png");
	Image img41 = closeImgIcon12.getImage();
	Image temp_img41 = img41.getScaledInstance(20,20,Image.SCALE_SMOOTH);
	closeImgIcon12 = new ImageIcon(temp_img41);
	JLabel closeImg12 = new JLabel("", closeImgIcon12 , JLabel.CENTER);
	closeImg12.setBounds(336,455, 30,30);
	closeImg12.setLayout(null);
	login.add(closeImg12);
	
	
	ImageIcon closeImgIcon15 = new ImageIcon("H:\\Java Project\\Image\\open.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(20,20,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg1 = new JLabel("", closeImgIcon1 , JLabel.CENTER);
	openImg1.setBounds(336,455, 30,30);
	openImg1.setLayout(null);
	openImg1.setVisible(false); 
	login.add(openImg1);
	

	Cursor cursor174 = new Cursor(Cursor.HAND_CURSOR);
    closeImg12.setCursor(cursor174);
	closeImg12.setLayout(null);
	closeImg12.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
		String s1 = value1.getText();
		value1.setVisible(false);
		closeImg12.setVisible(false);
			
			textFild3.setVisible(true);
			openImg1.setVisible(true);
				textFild3.setText(s1);
	}  
	
  });
  Cursor cursor187 = new Cursor(Cursor.HAND_CURSOR);
    openImg1.setCursor(cursor187);
	openImg1.setLayout(null);
  openImg1.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e) {
		String s1 = textFild3.getText();
		value1.setVisible(true);
			closeImg12.setVisible(true);
			
			textFild3.setVisible(false);
			openImg1.setVisible(false); 
			value1.setText(s1);
	}  
	
  });
	
	JCheckBox term = new JCheckBox("MARK IF THE INFORMATIONS ARE VALID");
    term.setFont(font2);
    term.setBounds(185,490,320,30);
	term.setBackground(new Color(45,  129, 131));
    term.setFocusable(false);
    term.setForeground(Color.black);
    login.add(term);
	
	//Button------------
	 JButton b = new JButton("Sign Up");  
	 b.setBounds(200,525, 100,30);
	 // b.setContentAreaFilled(false);
	  //b.setBorderPainted(false);
	 login.add(b);
	 Cursor cursor15 = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor1);
		b.setLayout(null);
		b.addMouseListener(new MouseAdapter(){
	
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Please Sign Up");}  
	
  });
	 
	 JLabel name12 = new JLabel("");
	name12.setBounds(330,535,300,40);
	name12.setFont(font3);
	name12.setForeground(Color.black);
	login.add(name12);
	 
	 
	
	
	ImageIcon backgroundIcon = new ImageIcon("H:\\Java Project\\Image\\i.png");
    Image img = backgroundIcon.getImage();
    Image temp_img = img.getScaledInstance(15,15,Image.SCALE_SMOOTH);
	backgroundIcon = new ImageIcon(temp_img);
	JLabel background = new JLabel("", backgroundIcon , JLabel.CENTER);
	background.setBounds(310,547,15,15);
	login.add(background);
	background.setLayout(null);
	
	ImageIcon backgroundIcon1 = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
	Image img6 = backgroundIcon1.getImage();
    Image temp_img6 = img6.getScaledInstance(50,50,Image.SCALE_SMOOTH);
	backgroundIcon1 = new ImageIcon(temp_img6);
	JLabel l3 = new JLabel("", backgroundIcon1 , JLabel.CENTER);
	l3.setBounds(525,10,50,50);
	l3.setLayout(null);
	login.add(l3);
	Cursor cursor12 = new Cursor(Cursor.HAND_CURSOR);
		l3.setCursor(cursor12);
		l3.setLayout(null);
    l3.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Welcome();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    l3.setToolTipText("Back");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
	// Panel adding-----------
	f.add(heading);
	
	f.add(login);
	
	
	
	//*add
	 Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
	 f.setIconImage(icon);
	 f.setSize(800,600);    
     f.setLayout(null);    
     f.setVisible(true);
	 f.setLocationRelativeTo(null);
	 f.setResizable(false);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 co.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				s7 = (String)co.getSelectedItem();
		}});
	 
		date.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				s8 = (String)date.getSelectedItem();
		}});
		
		month.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				s9 = (String)month.getSelectedItem();
		}});
		
		year.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				s10 = (String)year.getSelectedItem();
		}});
		g.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				s13 = (String)g.getSelectedItem();
		}});
		
		
		
		
	 
	 b.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
			 
			 //boolean bln1 = male.isSelected();
//boolean bln2 = female.isSelected();
			 
			 
			 try{
				 
				 
				 s11 = text1.getText().concat(".txt");
				
				 
				 s1 = value.getText();
				 s2 = value1.getText();
				 s3 = text.getText();
				 s4 = t.getText();
				 s5 = t2.getText();
				 s6 = p.getText();
				
				File file = new File(".\\Data\\user_data.txt");
				boolean check = file.exists();
				 
				 if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()||s7==null||s8==null||s9==null||s10==null||s13==null)
				 {
					 JOptionPane.showMessageDialog(f,"Please fulfill every information");
				 }
				 
				 else{
					if(check != true){
						
						if(s1.equals(s2) ){
							FileWriter fw = new FileWriter(file,true);
							fw.write(text1.getText()+"\t"+value.getText()+"\n"+"First name :"+"\t"+s3+"\n"+"Last name :"+"\t"+s4+
							"\n"+"Number :"+"\t"+s5+"\n"+"Email :"+"\t"+s6+"\n"+"Country :"+"\t"+s7+"\n"+"Date of Birth :"+"\t"+s8+"-"+s9+"-"+s10
							+"\n"+"Gender :"+"\t"+s13+"\n");
							fw.close();
							JOptionPane.showMessageDialog(f,"Thanks, you have successfully signed up");
							OTP frame=new OTP();
                    frame.setVisible(true);
							
						}
				
						if(s1.equals(s2) != true )
						{
							JOptionPane.showMessageDialog(f,"Password did not match"); 
						}
						
					}
					
					if(check==true){
						JOptionPane.showMessageDialog(f,"Username already exists");
					}
				 }
				 
			 }catch(Exception e1){
				 System.out.println(e1);
			 }
			 
		 }
		 
	 });
	  b4.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
			 
			 new SignIn();
			f.setVisible(false);
			 
		 }
		 
	 });

  
	}
	public static void main(String [] args){
                 new Signup();
	 
	}
}  