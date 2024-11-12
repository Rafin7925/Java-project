package Class;
import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.io.*;

public class about{
	about() { 
	//font --------------- 
	Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
    Font font6 = new Font("MANOSPAC", Font.BOLD, 20);
    Font font7 = new Font("Old English Text MT", Font.BOLD, 30);
	
	
	//Frame --------------
	JFrame f=new JFrame("About");
	f.getContentPane().setBackground(new Color(229,235,226));
	
	
	//Header -------------
	JPanel heading = new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(45,  129, 131));
	heading.setBounds(0,0,800,230);
	
	
	JLabel travel = new JLabel("AirHopper");
	travel.setBounds(20,15,300,40);
    travel.setForeground(Color.CYAN);
	travel.setFont(font5);
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
	com.setForeground(new Color(229,235,226));
	com.setBounds(120,17,80,40);
    com.setFont(font4);
    heading.add(com);
	
	JPanel panel5=new JPanel();  
    panel5.setBounds(18,45,145,2);    
    panel5.setBackground(new Color(229,235,226)); 
    heading.add(panel5);
	
	ImageIcon backgroundIcon1 = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
	Image img6 = backgroundIcon1.getImage();
    Image temp_img6 = img6.getScaledInstance(50,50,Image.SCALE_SMOOTH);
	backgroundIcon1 = new ImageIcon(temp_img6);
	JLabel l3 = new JLabel("", backgroundIcon1 , JLabel.CENTER);
	l3.setBounds(725,10,50,50);
	l3.setLayout(null);
	heading.add(l3);
	Cursor cursor123 = new Cursor(Cursor.HAND_CURSOR);
		l3.setCursor(cursor123);
		l3.setLayout(null);
    l3.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new PostSignIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    l3.setToolTipText("Back");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
    JLabel team9 = new JLabel("About Us");
	team9.setBounds(350,50,350,40);
	team9.setFont(font5);
	heading.add(team9);
	
	JLabel team0 = new JLabel("We try to provide the best experience on your way to exploring");
	team0.setBounds(200,80,500,40);
	team0.setFont(font2);
	heading.add(team0);
	JLabel team01 = new JLabel("  the world. An easier way to book flights,and hotels ");
	team01.setBounds(230,100,500,40);
	team01.setFont(font2);
	heading.add(team01);
	JLabel team012 = new JLabel("      will hopefully fulfill your demands as we have  ");
	team012.setBounds(230,120,500,40);
	team012.setFont(font2);
	heading.add(team012);
	JLabel team0123 = new JLabel("       gathered everything into a single package.");
	team0123.setBounds(235,140,500,40);
	team0123.setFont(font2);
	heading.add(team0123);
	
	//Login panel---------------
	JPanel login = new JPanel();
	login.setLayout(null);
	login.setBounds(0,230,800,400);
	//login.setBackground(Color.Blue);
	login.setBackground(new Color(229,235,226));
	
	JLabel team = new JLabel("Our Teams");
	team.setBounds(330,15,350,40);
	team.setFont(font5);
	login.add(team);
    
	
	JLabel team1 = new JLabel("Arafat Helal");
	team1.setBounds(50,50,200,40);
	team1.setFont(font6);
	login.add(team1);
	JLabel team11 = new JLabel("Student,Department of Computer ");
	team11.setBounds(50,75,200,40);
	team11.setFont(font3);
	login.add(team11);
	JLabel team121 = new JLabel("Science (AIUB). ");
	team121.setBounds(50,90,350,40);
	team121.setFont(font3);
	login.add(team121);
	
	
	JLabel team12 = new JLabel("Abu Jafar Sisty");
	team12.setBounds(315,50,200,40);
	team12.setFont(font6);
	login.add(team12);
	JLabel team011 = new JLabel("Student,Department of ");
	team011.setBounds(315,75,200,40);
	team011.setFont(font3);
	login.add(team011);
	JLabel team0121 = new JLabel("Computer Science (AIUB).");
	team0121.setBounds(315,90,350,40);
	team0121.setFont(font3);
	login.add(team0121);
	
	JLabel team123 = new JLabel("Tahmid Jawad Shafi");
	team123.setBounds(540,50,250,40);
	team123.setFont(font6);
	login.add(team123);
	JLabel team0112 = new JLabel("Student,Department of Computer ");
	team0112.setBounds(540,75,200,40);
	team0112.setFont(font3);
	login.add(team0112);
	JLabel team01212 = new JLabel("Science (AIUB).");
	team01212.setBounds(540,90,350,40);
	team01212.setFont(font3);
	login.add(team01212);
	
	JLabel team1230 = new JLabel("Gazi MD Rafayet Hossen");
	team1230.setBounds(315,160,250,40);
	team1230.setFont(font6);
	login.add(team1230);
	JLabel team01120 = new JLabel("Student,Department of ");
	team01120.setBounds(315,185,200,40);
	team01120.setFont(font3);
	login.add(team01120);
	JLabel team012120 = new JLabel("Computer Science (AIUB).");
	team012120.setBounds(315,200,350,40);
	team012120.setFont(font3);
	login.add(team012120);
	
	
	JLabel team1240 = new JLabel("Supervised by MD. Nazmul Hossain");
	team1240.setBounds(130,250,550,100);
	team1240.setFont(font7);
	login.add(team1240);
	
	
	
	
	
	
	
	JLabel team12301 = new JLabel("");
	team12301.setBounds(420,160,250,40);
	team12301.setFont(font6);
	login.add(team12301);
	JLabel team011201 = new JLabel(" ");
	team011201.setBounds(420,185,200,40);
	team011201.setFont(font3);
	login.add(team011201);
	JLabel team0121201 = new JLabel("");
	team0121201.setBounds(420,200,350,40);
	team0121201.setFont(font3);
	login.add(team0121201);
	
	JLabel name12 = new JLabel("");
	name12.setBounds(520,300,300,40);
	name12.setFont(font3);
	name12.setForeground(Color.black);
	login.add(name12);
	
	
	// Panel adding-----------
	f.add(heading);
	
	f.add(login);
	
	
	
	//*add
	// f.add(b1);
	Image icon = Toolkit.getDefaultToolkit().getImage("travel.png");
		f.setIconImage(icon);
	 f.setSize(800,600);    
     f.setLayout(null);    
     f.setVisible(true);
	 f.setLocationRelativeTo(null);
	 f.setResizable(false);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
                 new about();
	 
	}
}