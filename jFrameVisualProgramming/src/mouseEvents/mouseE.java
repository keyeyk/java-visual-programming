package mouseEvents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mouseE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mouseE frame = new mouseE();
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
	public mouseE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("New label");
		
		lbl.setOpaque(true);
		lbl.setBackground(Color.LIGHT_GRAY);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(121, 59, 117, 55);
		contentPane.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//Mouse labelýn içine girince ki hareketi
				lbl.setText("Mouse içeride");
				lbl.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//Mouse labelýn dýþýna çýkýnca ki hareketi
				lbl.setText("Mouse dýþarýda");
				lbl.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//Mouse ile label'e basýnca ki hareketi
				lbl.setText("Mouse basýlý");
				lbl.setBackground(Color.GREEN);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				//Mouse'a basmayý býrakýnca ki hareketi
				lbl.setText("Mouse basýlý deðil");
				lbl.setBackground(Color.LIGHT_GRAY);
			}
		});
	}
}
