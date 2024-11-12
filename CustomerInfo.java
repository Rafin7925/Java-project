package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInfo extends JFrame {
    JLabel nameLabel, addressLabel, emailLabel, phoneLabel, travel;
    JTextField nameTextField, addressTextField, emailTextField, phoneTextField;
    JButton submitButton;
    JPanel backgroundPanel;

    public CustomerInfo() {
        super("Customer Information");
        this.setSize(860, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);

        JPanel backgroundPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Work\\Downloads\\Java Projects\\Java Project (1)\\Java Project\\Image\\landing-02.png");
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

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(300, 20, 80, 25);
        backgroundPanel.add(nameLabel);

        nameTextField = new JTextField(20);
        nameTextField.setBounds(400, 20, 200, 25);
        backgroundPanel.add(nameTextField);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(300, 50, 80, 25);
        backgroundPanel.add(addressLabel);

        addressTextField = new JTextField(20);
        addressTextField.setBounds(400, 50, 200, 25);
        backgroundPanel.add(addressTextField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(300, 80, 80, 25);
        backgroundPanel.add(emailLabel);

        emailTextField = new JTextField(20);
        emailTextField.setBounds(400, 80, 200, 25);
        backgroundPanel.add(emailTextField);

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(300, 110, 80, 25);
        backgroundPanel.add(phoneLabel);

        phoneTextField = new JTextField(20);
        phoneTextField.setBounds(400, 110, 200, 25);
        backgroundPanel.add(phoneTextField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(300, 160, 80, 25);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookingConfirmation bookingConfirmation = new BookingConfirmation(
                        "New York", "Paris", "2023-05-15", "2", "Business",
                        nameTextField.getText(), addressTextField.getText(),
                        phoneTextField.getText(), emailTextField.getText());
                bookingConfirmation.setVisible(true);
            }
        });
        backgroundPanel.add(submitButton);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        CustomerInfo customerInfo = new CustomerInfo();
    }
}
