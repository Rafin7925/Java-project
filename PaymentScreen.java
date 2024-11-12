package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentScreen extends JFrame {
    JLabel fareLabel, paymentLabel;
    JLabel fareValueLabel;
    JComboBox<String> paymentMethodComboBox;
    JButton payButton;
    JPanel backgroundPanel;

    public PaymentScreen(double fare) {
        super("Payment");
        this.setSize(860, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);

        JPanel backgroundPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Work\\Downloads\\Java Projects\\Java Project (1)\\Java Project\\Image\\Conf-02.png");            
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        this.setContentPane(backgroundPanel);
        backgroundPanel.setLayout(null);
		
		JLabel travel = new JLabel("AirHopper");
        travel.setBounds(20, 15, 150, 40);
        travel.setForeground(Color.BLUE);
        Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
        travel.setCursor(cursor1);
        travel.setLayout(null);
        travel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                new PostSignIn();
                setVisible(false);
            }

            public void mouseEntered(MouseEvent e) {
                travel.setToolTipText("Home Page");
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }
        });
        backgroundPanel.add(travel);

        fareLabel = new JLabel("Fare: ");
        fareLabel.setBounds(50, 200, 100, 20);
        fareLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		fareLabel.setForeground(new Color(160,28,47,255));
        backgroundPanel.add(fareLabel);

        fareValueLabel = new JLabel("$" + String.format("%.2f", fare));
        fareValueLabel.setBounds(150, 200, 100, 20);
        fareValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		fareValueLabel.setForeground(new Color(160,28,47,255));
        backgroundPanel.add(fareValueLabel);

        paymentLabel = new JLabel("Payment Method: ");
        paymentLabel.setBounds(50, 260, 150, 20);
        paymentLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(paymentLabel);

        String[] paymentMethods = {"Credit Card", "BKash", "Nagad"};
        paymentMethodComboBox = new JComboBox<>(paymentMethods);
        paymentMethodComboBox.setBounds(200, 260, 150, 20);
        paymentMethodComboBox.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(paymentMethodComboBox);

        payButton = new JButton("Pay");
        payButton.setBounds(150, 320, 100, 30);
        payButton.setFont(new Font("Century Gothic", Font.BOLD, 14));
        payButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String selectedPaymentMethod = (String) paymentMethodComboBox.getSelectedItem();
        double fare = Double.parseDouble(fareValueLabel.getText().substring(1));
        
        if (selectedPaymentMethod.equals("BKash")) {
            BkashPage bkashPage = new BkashPage();
        } 
		else if (selectedPaymentMethod.equals("Nagad")) {
            Nagad nagadPage = new Nagad();
		}
			
		else if(selectedPaymentMethod.equals("Credit Card")) {
    CreditCardPage creditCardPage = new CreditCardPage();
}
       else {
            JOptionPane.showMessageDialog(null, "Payment Successful!");
        }
        
        dispose();
    }
});
        backgroundPanel.add(payButton);
		
		
    }
	
}
