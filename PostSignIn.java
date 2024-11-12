package Class;
import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class PostSignIn{
	
	private JFrame f = new JFrame("PostSignIn Page");
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private JPanel []panel1=new JPanel[10];
	private Font font1 = new Font("Arial",Font.BOLD,22);
	private Font font2 = new Font("Arial",Font.BOLD,30);
	private Font font3 = new Font("Arial",Font.BOLD,13);
	private Font font4 = new Font("Arial",Font.BOLD,10);
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	    private JLabel label;
	
	PostSignIn(){
		
	f.setSize(800,600);
		f.getContentPane().setBackground(new Color( 229,235,226));
		f.setLayout(null);	
		
	
		
        label=new JLabel("Buy Your Ticket Hassle Free.");
        label.setBounds(100, 380, 800, 30);
        label.setForeground(Color.BLACK);
        label.setFont(font5);
        f.add(label);   
                
		
	 JLabel l9=new JLabel("Air");    
		l9.setBounds(15,15,300,40);
		l9.setFont(font5);
		l9.setForeground(Color.BLACK);
                
                JLabel l10=new JLabel("Hopper");    
		l10.setBounds(80,15,300,40);
		l10.setFont(font5);
		l10.setForeground(Color.CYAN);
	
		
		
	JPanel p1 = panel(15,50,195,2); 
		
	JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setBounds(0,0,800,230);
		menuPanel.setBackground(new Color(45,  129, 131));
		
	JLabel l1=label("Profile ",550,15,100,30,font1);    
		JPanel p2 = panel(640,15,2,30); 
		JLabel l2=label("SIGN Out",650,15,100,30,font1);
		
		
		
		
	JLabel l3=label("   Flight",100,90,100,50,font1);  
		JPanel p3 = panel(249,90,2,50); 
		JLabel l4=label("    Hotel",350,90,100,50,font1);
		JPanel p8 = panel(549,90,2,50);
		JLabel l11=label("Contribution",580,90,150,50,font1); 
                
                
		l1.setCursor(cursor);
		l2.setCursor(cursor);
		l3.setCursor(cursor);
		l4.setCursor(cursor);
		l11.setCursor(cursor);
		
		
		JLabel ll=new JLabel("");    
		ll.setBounds(580,530,300,20);
		ll.setForeground(Color.black);
		
		//--------------------------------------		

	panel1[0] = panel("Profile");
		panel1[0].setVisible(false);
		panel1[1] = panel( "Sign Out");
		panel1[1].setVisible(false);
		panel1[2] = panel("Flight");
		panel1[2].setVisible(false);
		panel1[3] = panel(" Hotel");
		panel1[3].setVisible(false);
		panel1[8] = panel(" About");
		panel1[8].setVisible(false);
		
		
		
		
		//--------------------------------------
		
	    JLabel imgLabel1 = image("H:\\Java Project\\Image\\discount.jpg",75,350,300,169,300,169);
		JLabel imgLabel2 = image("H:\\Java Project\\Image\\hotel1.png",100,230,600,100,600,100);
		JLabel imgLabel3 = image("H:\\Java Project\\Image\\bus.png",425,350,300,169,300,169);
	
		
		
		
		// Mouse listener
		
		
		mouseListener1(l1,0);
		mouseListener1(l2,1);
		mouseListener1(l3,2);
		mouseListener1(l4,3);
		//mouseListener1(l5,4);
		//mouseListener1(l6,5);
		//mouseListener1(l7,6);
		//mouseListener1(l8,7);
		mouseListener1(l11,8);
		
		
		//Add -------------------------------
		f.add(menuPanel);
		f.add(ll);
		menuPanel.add(l9);
		//menuPanel.add(l10);
		
		menuPanel.add(p1);
		menuPanel.add(p2);
		menuPanel.add(p3);
		menuPanel.add(p8);
		
		menuPanel.add(l1);
		menuPanel.add(l2);
		menuPanel.add(l3);
		menuPanel.add(l4);
		menuPanel.add(l11);
		
		
		l1.add(panel1[0]);
		l2.add(panel1[1]);
		l3.add(panel1[2]);
		l4.add(panel1[3]);
		
                
		l11.add(panel1[8]);
		
		
		//f.add(l12);
		f.add(imgLabel1);
		f.add(imgLabel2);
		f.add(imgLabel3);
		
                f.add(menuPanel);
		f.add(ll);
		menuPanel.add(l10);
		
                
                
		//------------------------------------------------------------------------
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mouseListener1(JLabel label, int i){
		
			label.addMouseListener(new MouseListener(){
				
			public void mouseClicked(MouseEvent e) {  
				if(i==0){new information();
				f.setVisible(false);}
				if(i==1){
					
					File file1 = new File("tmp.txt");
					file1.delete();
					new Welcome();
					f.setVisible(false);
				}
				if(i==2){new Reservation1();
				f.setVisible(false);}
				if(i==3){JOptionPane.showMessageDialog(f,"Service will be available soon");}
				if(i==8){new about();
				f.setVisible(false);}
				
			}  
			public void mouseEntered(MouseEvent e) {  
				panel1[i].setVisible(true);
			}  
			public void mouseExited(MouseEvent e) {  
				panel1[i].setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				panel1[i].setVisible(false);
			}  
			public void mouseReleased(MouseEvent e) {  
				panel1[i].setVisible(true);
			} 
			
		});
		
		
	}
	
	JPanel panel(String s){
		
		JLabel label=new JLabel(s);    
		label.setBounds(0,0,100,30);
		label.setFont(font1);
		label.setForeground(Color.white);
		
		JPanel panel=new JPanel();
        panel.setBounds(0,0,100,30);    
        panel.setBackground(new Color(100, 149, 237,100));
		panel.add(label); 

		return panel;
		
	}
	
	
	JLabel label(String s,int x,int y, int w, int h,Font font){
		
		JLabel label=new JLabel(s);    
		label.setBounds(x,y,w,h);
		label.setFont(font);
		label.setForeground(Color.black);
		return label;
	}
	
	JPanel panel(int x, int y, int w, int h){
		
		JPanel panel=new JPanel();  
        panel.setBounds(x,y,w,h);    
        panel.setBackground(new Color(124, 180, 107));
		return panel;
		
	}
	
	JLabel image(String s,int x,int y,int w,int h,int px, int py){
		
		ImageIcon imgIcon = new ImageIcon(s);
		Image image = imgIcon.getImage();
		Image temp_image = image.getScaledInstance(px,py,Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(temp_image);
		JLabel img = new JLabel("", imgIcon , JLabel.CENTER);
		img.setBounds(x,y,w,h);
		return img;
		
	}
	
	
	
	public static void main(String [] args){
		
		new PostSignIn();
		
	}
	
}
