package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import java.nio.file.*;

import javax.swing.*;

import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Frame extends JFrame {

            private Container c;

            private ImageIcon icon, logo;

            private JLabel label1, imgLabel;

            private Font f1, f2;

            private JButton btnUser, btn2, btnExit, btnSupervisor, nBtn;

            private Cursor cursor;

     Frame() {

// Frame Layout

			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			this.setTitle("Home");

			this.setSize(800, 450);

			this.setLocationRelativeTo(null);

			this.setResizable(false);

			c = this.getContentPane();

			c.setLayout(null);

// Fonts

               f1 = new Font("Tahoma", Font.BOLD, 48);

               f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

// Title

               label1 = new JLabel();

               label1.setText("Padma Bridge");

               label1.setBounds(0, 0, 358, 65);

               label1.setFont(new Font("Tahoma", Font.BOLD, 40));

               c.add(label1);

               label1 = new JLabel();

               label1.setText("Bangladesh");

               label1.setBounds(10, 54, 307, 65);

               label1.setFont(new Font("Tahoma", Font.BOLD, 35));

               c.add(label1);

               // Cursor for JButtons

               cursor = new Cursor(Cursor.HAND_CURSOR);

               // JButtons

               btnUser = new JButton("User");
               btnUser.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

               btnUser.setBounds(31, 229, 155, 39);

               btnUser.setFont(f2);

               btnUser.setCursor(cursor);

               btnUser.setForeground(new Color(90, 105, 209));

               btnUser.setBackground(new Color(35, 159, 220));
               
               btnUser.setForeground(Color.WHITE);

               c.add(btnUser);

               btnExit = new JButton("Exit");
               btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

               btnExit.setBounds(621, 360, 155, 43);
               btnExit.setForeground(new Color(255, 255, 255));

               btnExit.setFont(f2);

               btnExit.setCursor(cursor);

               btnExit.setForeground(Color.WHITE);

               btnExit.setBackground(new Color(193, 12, 2));

               c.add(btnExit);

               btnSupervisor = new JButton("Supervisor Login");
               btnSupervisor.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

               btnSupervisor.setBounds(31, 301, 286, 43);

               btnSupervisor.setFont(f2);

               btnSupervisor.setCursor(cursor);
               btnSupervisor.setForeground(new Color(90, 105, 209));


               btnSupervisor.setForeground(Color.WHITE);

               btnSupervisor.setBackground(new Color(35, 159, 220));

               c.add(btnSupervisor);


				
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\p-5.jpg"));
				lblNewLabel.setBounds(0, 0, 800, 413);
				getContentPane().add(lblNewLabel);

// Login

				btnUser.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

				setVisible(false);

				User u = new User();

				u.setVisible(true);

   }

  });

  // Exit

  btnExit.addActionListener(new ActionListener() {

	  public void actionPerformed(ActionEvent ae) {

		  System.exit(0);

		  }

		  });

		  // Supervisor Login

		  btnSupervisor.addActionListener(new ActionListener() {

		  public void actionPerformed(ActionEvent ae) {

		  setVisible(false);

		  Login frame = new Login();

		  frame.setVisible(true);

		  }

		  });

		  }
     public static void main(String[] args) {
    	 Frame f= new Frame();
    	 f.setVisible(true);
     }
		  }