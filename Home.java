package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;



public class Home extends JFrame{
	private JLabel lblWelcome;
	private JButton btnLogout;
	private Login f1;
//private HomeFrame fr;
	private JButton btnNext;
	private JLabel lblPadmaBridge;
	private JLabel lblTollSystem;
	private JLabel lblNewLabel;

	public Home(String s1, Login f1) {
		super("Home Window");
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("Welcome");
		this.addComponent();

//String s = this.lblWelcome.getText() + s1;
//this.lblWelcome.setText(s);
//this.f1 = f1;
//this.fr=fr;
		this.setSize(384, 330);
		getContentPane().setLayout(null);
		
		lblPadmaBridge = new JLabel("PADMA BRIDGE");
		lblPadmaBridge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPadmaBridge.setBounds(25, 98, 169, 30);
		getContentPane().add(lblPadmaBridge);
		
		lblTollSystem = new JLabel("Toll System");
		lblTollSystem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTollSystem.setBounds(110, 138, 137, 30);
		getContentPane().add(lblTollSystem);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\eclipse-workspace\\Final_Project\\Photos\\toll-gate-icon_609277-3154.jpg"));
		lblNewLabel.setBounds(-48, 123, 388, 188);
		getContentPane().add(lblNewLabel);
//this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void addComponent() {
		this.lblWelcome = new JLabel("Welcome to");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		this.lblWelcome.setBounds(65, 58, 148, 30);

		this.btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(193, 12, 2));
		this.btnLogout.setBounds(281, 242, 80, 30);

		this.btnNext = new JButton("Next");
		btnNext.setBackground(new Color(0, 128, 255));
		this.btnNext.setBounds(281, 202, 80, 30);

		getContentPane().add(this.lblWelcome);
		getContentPane().add(this.btnLogout);
		getContentPane().add(this.btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomeFrame hf = new HomeFrame();
				hf.setVisible(true);
			}
		});

		this.btnLogout.addActionListener(new HomeEvent());

	}

	class HomeEvent implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
//LoginFrame f= new LoginFrame();
			setVisible(false);
			JOptionPane.showMessageDialog(null, "Logout from Home", "Info", JOptionPane.CLOSED_OPTION);
			f1.setVisible(true);
		}
	}

}
