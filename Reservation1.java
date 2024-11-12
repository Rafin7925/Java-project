package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reservation1 extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8;
    JButton b1;
    JPanel p1,p2, backgroundPanel;

    public Reservation1()
    {
        super("Reservation");
        this.setSize(860,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		l6 = new JLabel("BOOK YOUR TICKETS NOW");
		l6.setFont(new Font("Point Panther Bold", Font.PLAIN, 25));
        l6.setForeground(new Color(160,28,47,255));
        l6.setBounds(270, 150, 350, 30);
        backgroundPanel.add(l6);
		

        p2=new JPanel();
        p2.setBounds(130,190,630,170);
        p2.setBackground(new Color(255,255,255,204));
        p2.setLayout(null);

        l1 = new JLabel("From");
        l1.setFont(new Font("Century Gothic Bold", Font.PLAIN, 20));
        l1.setForeground(Color.blue);
        l1.setBounds(50, 20, 150, 20);
        p2.add(l1);

        c1 = new JComboBox(new String[]{"Dhaka", "Chittagong", "New York", "Paris", "Milan", "Amsterdam", "Bangkok"});
		c1.setBackground(new Color(229,229,152,128));
        c1.setBounds(50, 50, 150, 25);
        p2.add(c1);

        l2 = new JLabel("To");
        l2.setFont(new Font("Century Gothic Bold", Font.PLAIN, 20));
        l2.setForeground(Color.blue);
        l2.setBounds(250, 20, 150, 20);
        p2.add(l2);

        c2 = new JComboBox(new String[]{"Dhaka", "Chittagong", "Jeddah", "Paris", "New York", "Milan", "Chicago"});
        c2.setBounds(250, 50, 150, 25);
		c2.setBackground(new Color(229,229,152,128));
        p2.add(c2);

        l3 = new JLabel("Date");
        l3.setFont(new Font("Century Gothic Bold", Font.PLAIN, 20));
        l3.setForeground(Color.blue);
        l3.setBounds(450, 20, 150, 20);
        p2.add(l3);

        c3 = new JComboBox(new String[]{"01/01/2024", "02/01/2024", "03/01/2024", "04/01/2024", "05/01/2024", "06/01/2024", "07/01/2024"});
        c3.setBounds(450, 50, 150, 25);
		c3.setBackground(new Color(229,229,152,128));
        p2.add(c3);

        l4 = new JLabel("Travelers");
        l4.setFont(new Font("Century Gothic Bold", Font.PLAIN, 20));
        l4.setForeground(Color.blue);
        l4.setBounds(50, 90, 150, 20);
        p2.add(l4);

        c4 = new JComboBox(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
        c4.setBounds(50, 120, 150, 25);
		c4.setBackground(new Color(229,229,152,128));
        p2.add(c4);

        l5 = new JLabel("Class");
        l5.setFont(new Font("Century Gothic Bold", Font.PLAIN, 20));
        l5.setForeground(Color.blue);
        l5.setBounds(250, 90, 150, 20);
        p2.add(l5);
		
		c5 = new JComboBox(new String[]{"Economy", "Business", "First Class"});
        c5.setBounds(250, 120, 150, 25);
		c5.setBackground(new Color(229,229,152,128));
        p2.add(c5);
		
		
		
		b1 = new JButton("Search");
    b1.setBounds(370, 370, 100, 25);
    backgroundPanel.add(b1);
	
	b1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String from = c1.getSelectedItem().toString();
        String to = c2.getSelectedItem().toString();
        String date = c3.getSelectedItem().toString();
        String travelers = c4.getSelectedItem().toString();
        String flightClass = c5.getSelectedItem().toString();

        
        new FlightDetails(from, to, date, travelers, flightClass);
    }
});
		

        backgroundPanel.add(p2);

       this.setVisible(true);
}

       public static void main(String[] args) {
       new Reservation1();

}
}
