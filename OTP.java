package Class;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OTP extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField otpField;
    private JButton verifyButton;
    private String otpCode = "1234"; // Set the correct OTP code here

    public OTP() {
        super("OTP Verification");
        this.setSize(860, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		setResizable(false);
		
    JPanel backgroundPanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);           
            Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Work\\Downloads\\Java Projects\\Java Project (1)\\Java Project\\Image\\OTP.png");
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    };

    this.setContentPane(backgroundPanel);
	backgroundPanel.setLayout(null);

        

        l1 = new JLabel("Enter OTP:");
        l1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        l1.setForeground(Color.black);
        l1.setBounds(360, 220, 100, 25);
        backgroundPanel.add(l1);

        otpField = new JTextField();
        otpField.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        otpField.setBounds(360, 250, 150, 25);
        backgroundPanel.add(otpField);

        verifyButton = new JButton("Verify");
        verifyButton.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        verifyButton.setBounds(360, 280, 100, 25);
        verifyButton.addActionListener(this);
        backgroundPanel.add(verifyButton);

        l2 = new JLabel();
        l2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        l2.setBounds(50, 120, 250, 25);
        backgroundPanel.add(l2);

        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verifyButton) {
            String enteredOTP = otpField.getText().trim();
            if (enteredOTP.equals(otpCode)) {
                l2.setForeground(Color.green);
                l2.setText("Verification Successful!");
				 dispose();
                 Welcome frame=new Welcome();
                
                 
            } else {
                l2.setForeground(Color.red);
                l2.setText("Verification Failed! Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        OTP otp = new OTP();
        otp.setVisible(true);
    }
}
