package mouseEvents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class toggleButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toggleButton frame = new toggleButton();
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
	public toggleButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtn = new JToggleButton("off");
		tglbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtn.isSelected()) {
					tglbtn.setBackground(Color.GREEN);
					tglbtn.setText("on");
				}
				else {
					tglbtn.setText("off");
					tglbtn.setBackground(Color.RED);
				}
			}
		});
		tglbtn.setBounds(47, 43, 165, 44);
		contentPane.add(tglbtn);
	}
}
