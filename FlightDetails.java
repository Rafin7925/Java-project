package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlightDetails extends JFrame {
    JLabel fromLabel, toLabel, dateLabel, travelersLabel, classLabel;
    JButton nextButton;
	JPanel backgroundPanel;

public FlightDetails(String from, String to, String date, String travelers, String flightClass) {
    super("Flight Details");
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

    fromLabel = new JLabel("From: ");
    fromLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    fromLabel.setBounds(300, 50, 100, 20);
    backgroundPanel.add(fromLabel);
    JLabel fromValueLabel = new JLabel(from);
    fromValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    fromValueLabel.setBounds(450, 50, 200, 20);
    backgroundPanel.add(fromValueLabel);

    toLabel = new JLabel("To: ");
    toLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    toLabel.setBounds(300, 100, 100, 20);
    backgroundPanel.add(toLabel);
    JLabel toValueLabel = new JLabel(to);
    toValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    toValueLabel.setBounds(450, 100, 200, 20);
    backgroundPanel.add(toValueLabel);

    dateLabel = new JLabel("Date: ");
    dateLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    dateLabel.setBounds(300, 150, 100, 20);
    backgroundPanel.add(dateLabel);
    JLabel dateValueLabel = new JLabel(date);
    dateValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    dateValueLabel.setBounds(450, 150, 200, 20);
    backgroundPanel.add(dateValueLabel);

    travelersLabel = new JLabel("Travelers: ");
    travelersLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    travelersLabel.setBounds(300, 200, 100, 20);
    backgroundPanel.add(travelersLabel);
    JLabel travelersValueLabel = new JLabel(travelers);
    travelersValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    travelersValueLabel.setBounds(450, 200, 200, 20);
    backgroundPanel.add(travelersValueLabel);

    classLabel = new JLabel("Class: ");
    classLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    classLabel.setBounds(300, 250, 100, 20);
    backgroundPanel.add(classLabel);
    JLabel classValueLabel = new JLabel(flightClass);
    classValueLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    classValueLabel.setBounds(450, 250, 200, 20);
    backgroundPanel.add(classValueLabel);

    JButton nextButton = new JButton("Next");
    nextButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
    nextButton.setBounds(700, 500, 100, 30);
    nextButton.addActionListener(e -> {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setVisible(true);
    });
    backgroundPanel.add(nextButton);

 
    this.setVisible(true);
}

public static void main(String[] args) {
    new FlightDetails("New York", "Los Angeles", "05/01/2023", "2 Adults, 1 Child", "Business").setVisible(true);
}
}
