package SpinnerColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class spinner extends JFrame {

	private JPanel contentPane;
	static int r,g,b;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spinner frame = new spinner();
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
	public spinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner sred = new JSpinner();
		sred.setForeground(Color.RED);
		
		
		sred.setModel(new SpinnerNumberModel(0, 0, 255, 5));
		sred.setBounds(10, 37, 55, 29);
		contentPane.add(sred);
		
		JSpinner sgreen = new JSpinner();
		sgreen.setForeground(Color.GREEN);
		sgreen.setModel(new SpinnerNumberModel(0, 0, 255, 5));
		sgreen.setBounds(130, 37, 55, 29);
		contentPane.add(sgreen);
		
		JSpinner sblue = new JSpinner();
		sblue.setForeground(Color.BLUE);
		sblue.setModel(new SpinnerNumberModel(0, 0, 255, 5));
		sblue.setBounds(250, 37, 55, 29);
		contentPane.add(sblue);
		
		JButton btn = new JButton("Renk");
		btn.setForeground(Color.BLACK);
		btn.setBounds(10, 77, 305, 173);
		contentPane.add(btn);
		
		JLabel lblNewLabel = new JLabel("RED");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGreen = new JLabel("GREEN");
		lblGreen.setBounds(130, 11, 46, 14);
		contentPane.add(lblGreen);
		
		JLabel lblBlue = new JLabel("BLUE");
		lblBlue.setBounds(250, 12, 46, 14);
		contentPane.add(lblBlue);
		
		r=0;
		g=0;
		b=0;
		
		sred.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) sred.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
		
		sgreen.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				g = (int) sgreen.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
		
		sblue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b = (int) sblue.getValue();
				btn.setBackground(new Color(r,g,b));
			}
		});
	}
}
