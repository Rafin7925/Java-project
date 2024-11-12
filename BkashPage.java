package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashPage extends JFrame {
    private JTextField phoneNumberField;
    private JPasswordField passwordField;
    private JButton payButton;

    public BkashPage() {
        super("Bkash Payment");
        this.setSize(404, 316); // Set the frame size to 404x316
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // Create a panel with a background image
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image from a file
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\Work\\Downloads\\bkash1.jpg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        // Set the layout for the background panel
        backgroundPanel.setLayout(new GridLayout(3, 2));

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String phoneNumber = phoneNumberField.getText();
                String password = new String(passwordField.getPassword());
                performBkashPayment(phoneNumber, password);
                dispose();
            }
        });

        backgroundPanel.add(phoneNumberLabel);
        backgroundPanel.add(phoneNumberField);
        backgroundPanel.add(passwordLabel);
        backgroundPanel.add(passwordField);
        backgroundPanel.add(new JLabel()); // Placeholder
        backgroundPanel.add(payButton);

        this.add(backgroundPanel);
        this.setVisible(true);
    }

    private void performBkashPayment(String phoneNumber, String password) {
        JOptionPane.showMessageDialog(null, "Bkash Payment Successful!");
    }
}
