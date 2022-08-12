package PassFieldAndFormatText;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class password extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password frame = new password();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public password() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pass = new JPasswordField();
		pass.setBounds(127, 31, 117, 20);
		contentPane.add(pass);
		
		JLabel lblpass = new JLabel("PasswordField");
		lblpass.setBounds(10, 31, 107, 20);
		contentPane.add(lblpass);
		
		JLabel lblfor = new JLabel("FormatText");
		lblfor.setBounds(10, 113, 107, 14);
		contentPane.add(lblfor);
		
		MaskFormatter mf = new MaskFormatter("(0###) ### - ## - ##");
		/* Burada #-Sadece sayýsal
		 * U-Upper Case - Sadece büyük harf
		 * L-Lower Case - Sadece küçük harf
		 * A-Büyük/Küçük - Büyük ve küçük harf farketmez
		 */
		
		JFormattedTextField format = new JFormattedTextField(mf);
		format.setBounds(127, 110, 117, 20);
		contentPane.add(format);
	}
}
