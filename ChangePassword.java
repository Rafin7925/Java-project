package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class ChangePassword{
	
	private JFrame f = new JFrame("Change Password");
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	private Font font2 = new Font("Arial ", Font.BOLD, 14);
	private Font font1 = new Font("Arial",Font.BOLD,15);
	private String []arr;
	private String st1,st2,st3,st4,st5,st6,st7,st8;
	private boolean matched;
	
	
	ChangePassword(){
		f.setSize(800,600);
		f.getContentPane().setBackground(new Color(229,235,226));
		f.setLayout(null);
		
		//------------------------------------
		
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setBounds(0,0,800,130);
		menuPanel.setBackground(new Color(135, 206, 235));
		
		JLabel l9=new JLabel("AirHopper");    
		l9.setBounds(15,15,300,40);
		l9.setFont(font5);
		l9.setForeground(Color.BLUE);
		
		JLabel l10=new JLabel("");    
		l10.setBounds(155,17,80,40);
		l10.setFont(font6);
		l10.setForeground(Color.red);
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		l9.setCursor(cursor);
		l10.setCursor(cursor);
		
		JLabel l4=new JLabel("Change Password");    
		l4.setBounds(300,80,300,40);
		l4.setFont(font6);
		l4.setForeground(Color.black);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(15,50,195,2);
		panel.setBackground(new Color(124, 180, 107));
		panel.setCursor(cursor);
		
		ImageIcon imgReturn = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
		Image image1 = imgReturn.getImage();
		Image temp_image = image1.getScaledInstance(40,40,Image.SCALE_SMOOTH);
		imgReturn = new ImageIcon(temp_image);
		JLabel imgIcon = new JLabel("", imgReturn , JLabel.CENTER);
		imgIcon.setBounds(720,10,40,40);
		imgIcon.setCursor(cursor);
		
		
		JPanel changePanel = new JPanel();
		changePanel.setLayout(null);
		changePanel.setBounds(140,205,520,280);
		changePanel.setBackground(new Color(124, 180, 107));
		
		JPanel changePanel1 = new JPanel();
		changePanel1.setLayout(null);
		changePanel1.setBounds(259,55,2,160);
		changePanel1.setBackground(new Color(229,235,226));
		
		final JTextField text = new JTextField();
		text.setBounds(50,80, 150,30);
		text.setLayout(null);
		text.setFont(font2);
		text.setOpaque(false);
		text.setForeground(new Color(0x292929));
		text.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		
		JLabel l1=new JLabel("Username");    
		l1.setBounds(50,55,150,28);
		l1.setFont(font1);
		l1.setForeground(Color.black);
		
		final JPasswordField pf = new JPasswordField();   // ***************************************************
		pf.setEchoChar('*');
		pf.setBounds(50,155, 150,30);
		pf.setLayout(null);
		pf.setFont(font2);
		pf.setOpaque(false);
		pf.setForeground(new Color(0x292929));
		pf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		
		final JTextField text1 = new JTextField();
		text1.setBounds(50,155, 150,30);
		text1.setLayout(null);
		text1.setFont(font2);
		text1.setOpaque(false);
		text1.setForeground(new Color(0x292929));
		text1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		text1.setVisible(false);
		
		
		JLabel l2=new JLabel("Old Password");    
		l2.setBounds(50,130,150,28);
		l2.setFont(font1);
		l2.setForeground(Color.black);
		
		ImageIcon closeImgIcon = new ImageIcon("H:\\Java Project\\Image\\close.png");
		Image img4 = closeImgIcon.getImage();
		Image temp_img4 = img4.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon = new ImageIcon(temp_img4);
		JLabel closeImg = new JLabel("", closeImgIcon , JLabel.CENTER);
		closeImg.setBounds(210,160, 20,20);
		closeImg.setLayout(null);
		closeImg.setCursor(cursor);
		
		ImageIcon closeImgIcon1 = new ImageIcon("H:\\Java Project\\Image\\open.png");
		Image img1 = closeImgIcon1.getImage();
		Image temp_img1 = img1.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon1 = new ImageIcon(temp_img1);
		JLabel openImg = new JLabel("", closeImgIcon1 , JLabel.CENTER);
		openImg.setBounds(210,160, 20,20);
		openImg.setLayout(null);
		openImg.setVisible(false); 
		openImg.setCursor(cursor);
		
		closeImg.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s1 = pf.getText();
				pf.setVisible(false);
				closeImg.setVisible(false);
			
				text1.setVisible(true);
				openImg.setVisible(true);
				text1.setText(s1);
		} });
		
		openImg.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s2 = text1.getText();
				text1.setVisible(false);
				openImg.setVisible(false);
			
				pf.setVisible(true);
				closeImg.setVisible(true);
				pf.setText(s2);
		} });
		
		
		// new password
		
		final JPasswordField pf10 = new JPasswordField();   // ***************************************************
		pf10.setEchoChar('*');
		pf10.setBounds(310,80, 150,30);
		pf10.setLayout(null);
		pf10.setFont(font2);
		pf10.setOpaque(false);
		pf10.setForeground(new Color(0x292929));
		pf10.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		
		final JTextField text20 = new JTextField();
		text20.setBounds(310,80, 150,30);
		text20.setLayout(null);
		text20.setFont(font2);
		text20.setOpaque(false);
		text20.setForeground(new Color(0x292929));
		text20.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		text20.setVisible(false);
		
		
		JLabel l30=new JLabel("New Password");    
		l30.setBounds(310,55,150,28);
		l30.setFont(font1);
		l30.setForeground(Color.black);
		
		ImageIcon closeImgIcon00 = new ImageIcon("H:\\Java Project\\Image\\close.png");
		Image img400 = closeImgIcon00.getImage();
		Image temp_img400 = img400.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon00 = new ImageIcon(temp_img400);
		JLabel closeImg00 = new JLabel("", closeImgIcon00 , JLabel.CENTER);
		closeImg00.setBounds(470,80, 20,20);
		closeImg00.setLayout(null);
		closeImg00.setCursor(cursor);
		
		ImageIcon closeImgIcon100 = new ImageIcon("H:\\Java Project\\Image\\open.png");
		Image img100 = closeImgIcon100.getImage();
		Image temp_img100 = img100.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon100 = new ImageIcon(temp_img100);
		JLabel openImg00 = new JLabel("", closeImgIcon100 , JLabel.CENTER);
		openImg00.setBounds(470,80, 20,20);
		openImg00.setLayout(null);
		openImg00.setVisible(false); 
		openImg00.setCursor(cursor);
		
		closeImg00.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s3 = pf10.getText();
				pf10.setVisible(false);
				closeImg00.setVisible(false);
			
				text20.setVisible(true);
				openImg00.setVisible(true);
				text20.setText(s3);
		} });
		
		openImg00.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s3 = text20.getText();
				text20.setVisible(false);
				openImg00.setVisible(false);
			
				pf10.setVisible(true);
				closeImg00.setVisible(true);
				pf10.setText(s3);
		} });
		
		
		// confirm new pass --------------------
		
		final JPasswordField pf1 = new JPasswordField();   // ***************************************************
		pf1.setEchoChar('*');
		pf1.setBounds(310,155, 150,30);
		pf1.setLayout(null);
		pf1.setFont(font2);
		pf1.setOpaque(false);
		pf1.setForeground(new Color(0x292929));
		pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		
		final JTextField text2 = new JTextField();
		text2.setBounds(310,155, 150,30);
		text2.setLayout(null);
		text2.setFont(font2);
		text2.setOpaque(false);
		text2.setForeground(new Color(0x292929));
		text2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
		text2.setVisible(false);
		
		
		JLabel l3=new JLabel("Confirm Password");    
		l3.setBounds(310,130,150,28);
		l3.setFont(font1);
		l3.setForeground(Color.black);
		
		ImageIcon closeImgIcon0 = new ImageIcon("H:\\Java Project\\Image\\close.png");
		Image img40 = closeImgIcon0.getImage();
		Image temp_img40 = img40.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon0 = new ImageIcon(temp_img40);
		JLabel closeImg0 = new JLabel("", closeImgIcon0 , JLabel.CENTER);
		closeImg0.setBounds(470,160, 20,20);
		closeImg0.setLayout(null);
		closeImg0.setCursor(cursor);
		
		ImageIcon closeImgIcon10 = new ImageIcon("H:\\Java Project\\Image\\open.png");
		Image img10 = closeImgIcon10.getImage();
		Image temp_img10 = img10.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon10 = new ImageIcon(temp_img10);
		JLabel openImg0 = new JLabel("", closeImgIcon10 , JLabel.CENTER);
		openImg0.setBounds(470,160, 20,20);
		openImg0.setLayout(null);
		openImg0.setVisible(false); 
		openImg0.setCursor(cursor);
		
		closeImg0.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s4 = pf1.getText();
				pf1.setVisible(false);
				closeImg0.setVisible(false);
			
				text2.setVisible(true);
				openImg0.setVisible(true);
				text2.setText(s4);
		} });
		
		openImg0.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s4 = text2.getText();
				text2.setVisible(false);
				openImg0.setVisible(false);
			
				pf1.setVisible(true);
				closeImg0.setVisible(true);
				pf.setText(s4);
		} });
		
		JLabel l5=new JLabel("");    
		l5.setBounds(580,530,300,20);
		l5.setForeground(Color.black);
		
		JButton confirmButton = new JButton("Confirm");  
		confirmButton.setBounds(210,230, 100,30);
		confirmButton.setBackground(new Color(192, 213, 232));
		confirmButton.setCursor(cursor);
		
		 
		
		//add-------------------------
		f.add(menuPanel);
		f.add(changePanel);
		f.add(l5);
		
		menuPanel.add(l9);
		menuPanel.add(l10);
		menuPanel.add(l4);
		menuPanel.add(panel);
		menuPanel.add(imgIcon);
		
		changePanel.add(changePanel1);
		changePanel.add(text);
		changePanel.add(text1);
		changePanel.add(l1);
		
		changePanel.add(l2);
		changePanel.add(pf);
		changePanel.add(closeImg);
		changePanel.add(openImg);;
		
		changePanel.add(text2);
		changePanel.add(l3);
		changePanel.add(pf1);
		changePanel.add(closeImg0);
		changePanel.add(openImg0);
		
		changePanel.add(text20);
		changePanel.add(l30);
		changePanel.add(pf10);
		changePanel.add(closeImg00);
		changePanel.add(openImg00);
		
		changePanel.add(confirmButton);
		
		
		
		
		actionListener(l9,0);
		actionListener(l10,0);
		actionListener(imgIcon,1);
		
		
		confirmButton.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
			matched = false;
			
			try{
				String s1 = text.getText();
				String s2 = pf.getText();
				String s3 = text.getText().concat(".txt");
				
				File file = new File(s3);
				boolean check = file.exists();
				
				System.out.println(s3);
				
				if(check==true){
					
					FileReader fr = new FileReader(s3);
					BufferedReader br = new BufferedReader(fr);
					String line;
					
					
					int count = 1 ;
					int x = 0;
					System.out.println(s3);
				
					while((line = br.readLine())!=null){
						
						
						if(line.equals(s1+"\t"+s2) || x>0){
							matched = true;
							if(count==1){
								st1 = text.getText()+"\t"+pf1.getText();
								System.out.println("st1 ::"+st1+"\n");
							}
							if(count==2){
								st2=line;
								System.out.println("st2 ::"+st2+"\n");
							}
							if(count==3){
								st3=line;
								System.out.println("st3 ::"+st3+"\n");
							}
							if(count==4){
								st4=line;
								System.out.println("st4 ::"+st4+"\n");
							}
							if(count==5){
								st5=line;
								System.out.println("st5 ::"+st5+"\n");
							}
							if(count==6){
								st6=line;
								System.out.println("st6 ::"+st6+"\n");
							}
							if(count==7){
								st7=line;
								System.out.println("st7 ::"+st7+"\n");
							}
							if(count==8){
								st8 = line;
								System.out.println("st8 ::"+st8+"\n");
							}
							x++;
						}
						
						count++;
					}
					fr.close();
					if(matched){
						
						if(pf10.getText().isEmpty()||pf1.getText().isEmpty()){
							JOptionPane.showMessageDialog(f,"Please enter the new password");
						}
						
						else{
						
							if(pf10.getText().equals(pf1.getText())){
								
								if(pf10.getText().equals(pf.getText())){
									JOptionPane.showMessageDialog(f,"New password and old password are same");
								}else{
									System.out.println("matched");
									File file1 = new File(s3);
									boolean b = file1.delete();
									if(b){
										System.out.println("File delete & creation");
										FileWriter fw = new FileWriter(s3,true);
										fw.write(st1+"\n"+st2+"\n"+st3+"\n"+st4+"\n"+st5+"\n"+st6+"\n"+st7+"\n"+st8);
										fw.close();
										JOptionPane.showMessageDialog(f,"Password changed successfully");
										new SignIn();
										f.setVisible(false);
									}
								}
							}else{JOptionPane.showMessageDialog(f,"New passwords did not matched ");}
						}
						
					}else{
						JOptionPane.showMessageDialog(f,"Old Password is Wrong");  
					}
					
				}else{
					JOptionPane.showMessageDialog(f,"Username is Wrong");
				}
				
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
			
			
				
				
				
		 }});
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	public void actionListener(JLabel label,int x){
		
		label.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(x==0){
					new Welcome();
					f.setVisible(false);
				}
				
				if(x==1){
					new SignIn();
					f.setVisible(false);
				}
				
			}			
		});
	}
	
	
	
	
	public static void main(String [] args){
		
		new ChangePassword();
		
	}
	
}