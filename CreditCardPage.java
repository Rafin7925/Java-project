package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditCardPage extends JFrame {
    private JTextField cardNumberField;
    private JTextField cardholderNameField;
    private JPasswordField cvvField;
    private JTextField expiryDateField;
    private JButton payButton;

    public CreditCardPage() {
        super("Credit Card Payment");
        this.setSize(400, 250);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 2));

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();

        JLabel cardholderNameLabel = new JLabel("Cardholder Name:");
        cardholderNameField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JPasswordField();

        JLabel expiryDateLabel = new JLabel("Expiry Date:");
        expiryDateField = new JTextField();

        payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cardNumber = cardNumberField.getText();
                String cardholderName = cardholderNameField.getText();
                String cvv = new String(cvvField.getPassword());
                String expiryDate = expiryDateField.getText();
                performCreditCardPayment(cardNumber, cardholderName, cvv, expiryDate);
                dispose();
            }
        });

        this.add(cardNumberLabel);
        this.add(cardNumberField);
        this.add(cardholderNameLabel);
        this.add(cardholderNameField);
        this.add(cvvLabel);
        this.add(cvvField);
        this.add(expiryDateLabel);
        this.add(expiryDateField);
        this.add(new JLabel()); // Placeholder
        this.add(payButton);

        this.setVisible(true);
    }

    private void performCreditCardPayment(String cardNumber, String cardholderName, String cvv, String expiryDate) {
        
        JOptionPane.showMessageDialog(null, "Credit Card Payment Successful!");
    }
}
