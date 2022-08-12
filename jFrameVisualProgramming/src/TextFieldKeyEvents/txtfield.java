package TextFieldKeyEvents;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class txtfield extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					txtfield frame = new txtfield();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public txtfield() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt = new JTextField();
		
		txt.setBounds(50, 26, 118, 49);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(178, 26, 118, 49);
		contentPane.add(lbl);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(50, 117, 118, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//lbl.setText(txt.getText());
				//burada 0.indis ile ilgili sýkýntýlar yaþandýðý için released events'a yazmak lazým.
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lbl.setText(txt.getText());
				String s= txt.getText();
				dog(s);
			}
		});
	}
	
	void dog(String s) {
		if (s.equals("Kemal")) textField.setEnabled(true); else textField.setEnabled(false);
		//enable özelliði ile connection textfieldler yaptýk.
	}
}
