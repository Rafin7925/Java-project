package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class User extends JFrame {

    private Container c;
    private JLabel label1, imgLabel;
    private JLabel label1_2;
    private JLabel label1_1;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;
    private JLabel lblNewLabel;

    User() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login Window");
        this.setSize(900, 465);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(128, 128, 128));

      
        // Title
        label1 = new JLabel();
        label1.setFont(new Font("Tahoma", Font.BOLD, 25));
        label1.setText("User Login");
        label1.setBounds(430, 76, 169, 59);
        c.add(label1);

        // User Name
        label1_1 = new JLabel();
        label1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1_1.setText("User Name");
        label1_1.setBounds(430, 145, 145, 50);
        c.add(label1_1);

        tf1 = new JTextField();
        tf1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tf1.setBounds(600, 155, 200, 35);
        c.add(tf1);

        // Password
        label1_2 = new JLabel();
        label1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1_2.setText("Password");
        label1_2.setBounds(430, 205, 145, 50);
        c.add(label1_2);

        tf2 = new JPasswordField();
        tf2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tf2.setBounds(600, 215, 200, 35);
        tf2.setEchoChar('*');
        c.add(tf2);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1.setBounds(10, 353, 215, 50);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(new Color(157, 2, 2));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn2.setBounds(430, 308, 202, 50);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(90, 105, 209));
        c.add(btn2);

        btn3 = new JButton("Login");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn3.setBounds(642, 308, 200, 50);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(new Color(90, 105, 209));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\rsz_1bangladesh-may-bridge-inauguration-padma-multipurpose-th-june-flag-conceptual-background-248279251.jpg"));
        lblNewLabel.setBounds(10, 23, 404, 320);
        getContentPane().add(lblNewLabel);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Frame frame = new Frame();
                frame.setVisible(true);
            }
        });

        // Login Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name 
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\text.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\text.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\text.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Toll System!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Home hf = new Home(line2,null);
                                    hf.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
    }

   }
