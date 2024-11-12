package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingConfirmation extends JFrame {
    JLabel confirmationLabel, flightLabel, fromLabel, toLabel, dateLabel, travelersLabel, classLabel;
    JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
    JLabel nameValueLabel, addressValueLabel, phoneValueLabel, emailValueLabel;
	JPanel backgroundPanel;

    public BookingConfirmation(String from, String to, String date, String travelers, String flightClass,
                                String name, String address, String phone, String email) {
        super("Booking Confirmation");
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

        confirmationLabel = new JLabel("Your Booking is Confirmed!");
        confirmationLabel.setBounds(300, 30, 300, 30);
        confirmationLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
        backgroundPanel.add(confirmationLabel);

        flightLabel = new JLabel("Flight Details:");
        flightLabel.setBounds(50, 80, 150, 20);
        flightLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
        backgroundPanel.add(flightLabel);

        fromLabel = new JLabel("From: ");
        fromLabel.setBounds(50, 120, 50, 20);
        fromLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(fromLabel);
        JLabel fromValueLabel = new JLabel(from);
        fromValueLabel.setBounds(120, 120, 150, 20);
        fromValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(fromValueLabel);

        toLabel = new JLabel("To: ");
        toLabel.setBounds(50, 150, 50, 20);
        toLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(toLabel);
        JLabel toValueLabel = new JLabel(to);
        toValueLabel.setBounds(120, 150, 150, 20);
        toValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(toValueLabel);

        dateLabel = new JLabel("Date: ");
        dateLabel.setBounds(50, 180, 50, 20);
        dateLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(dateLabel);
        JLabel dateValueLabel = new JLabel(date);
        dateValueLabel.setBounds(120, 180, 150, 20);
        dateValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(dateValueLabel);

        travelersLabel = new JLabel("Travelers: ");
        travelersLabel.setBounds(50, 210, 70, 20);
        travelersLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(travelersLabel);
        JLabel travelersValueLabel = new JLabel(travelers);
        travelersValueLabel.setBounds(120, 210, 150, 20);
        travelersValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(travelersValueLabel);

        classLabel = new JLabel("Class: ");
        classLabel.setBounds(50, 240, 50, 20);
        classLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        backgroundPanel.add(classLabel);
        JLabel classValueLabel = new JLabel(flightClass);
        classValueLabel.setBounds(120, 240, 150, 20);
        classValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
backgroundPanel.add(classValueLabel);

    nameLabel = new JLabel("Name: ");
    nameLabel.setBounds(50, 280, 150, 20);
    nameLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    backgroundPanel.add(nameLabel);
    nameValueLabel = new JLabel(name);
    nameValueLabel.setBounds(120, 280, 150, 20);
    nameValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    backgroundPanel.add(nameValueLabel);

    addressLabel = new JLabel("Address: ");
    addressLabel.setBounds(50, 310, 150, 20);
    addressLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    backgroundPanel.add(addressLabel);
    addressValueLabel = new JLabel(address);
    addressValueLabel.setBounds(120, 310, 250, 20);
    addressValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    backgroundPanel.add(addressValueLabel);

    phoneLabel = new JLabel("Phone: ");
    phoneLabel.setBounds(50, 340, 150, 20);
    phoneLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    backgroundPanel.add(phoneLabel);
    phoneValueLabel = new JLabel(phone);
    phoneValueLabel.setBounds(120, 340, 150, 20);
    phoneValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    backgroundPanel.add(phoneValueLabel);

    emailLabel = new JLabel("Email: ");
    emailLabel.setBounds(50, 370, 150, 20);
    emailLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    backgroundPanel.add(emailLabel);
    emailValueLabel = new JLabel(email);
    emailValueLabel.setBounds(120, 370, 250, 20);
    emailValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    backgroundPanel.add(emailValueLabel);

    JLabel thankYouLabel = new JLabel("Thank you for choosing our airline!");
    thankYouLabel.setBounds(300, 700, 300, 30);
    thankYouLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
    backgroundPanel.add(thankYouLabel);
	
	 JButton paymentButton = new JButton("Payment");
	 paymentButton.setBounds(160,430,100,50);
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
				double fare = 99.99;
                PaymentScreen paymentScreen = new PaymentScreen(fare);
                paymentScreen.setVisible(true);
            }
        });

        backgroundPanel.add(paymentButton);
    

  
    this.setVisible(true);
}
}
