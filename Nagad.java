package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nagad extends JFrame {
    private JTextField phoneNumberField;
    private JPasswordField passwordField;
    private JButton payButton;

    public Nagad() {
        super("Nagad Payment");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3, 2));

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String phoneNumber = phoneNumberField.getText();
                String password = new String(passwordField.getPassword());
                performNagadPayment(phoneNumber, password);
                dispose();
            }
        });

        this.add(phoneNumberLabel);
        this.add(phoneNumberField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(new JLabel()); // Placeholder
        this.add(payButton);

        this.setVisible(true);
    }

    private void performNagadPayment(String phoneNumber, String password) {
        
        JOptionPane.showMessageDialog(null, "Nagad Payment Successful!");
    }
}
