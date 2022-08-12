package odev06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class hesapMakinesiii extends JFrame {

	private JPanel contentPane;
	JButton[][] cal = new JButton[4][4];
	int i,j;
	private JTextField txtCalcul;
	
	String[][] s ={ {"1","2","3","+"}, 
					{"4","5","6","-"}, 
					{"7","8","9","*"},
					{"0",",","=","/"} };
	
	int islem;
	float n1,n2,sonuc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesapMakinesiii frame = new hesapMakinesiii();
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
	public hesapMakinesiii() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Kemal Alper K\u00FC\u00E7\u00FCk");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblName.setBounds(150, 307, 94, 14);
		contentPane.add(lblName);
		
		txtCalcul = new JTextField();
		txtCalcul.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCalcul.setBackground(new Color(255, 255, 255));
		txtCalcul.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCalcul.setBounds(10, 11, 234, 40);
		contentPane.add(txtCalcul);
		txtCalcul.setColumns(10);
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				cal[i][j] = new JButton();
				cal[i][j].setFont(new Font("Tahoma", Font.PLAIN, 13));
				cal[i][j].setBounds(j*60+10, i*60+60, 50, 50);
				cal[i][j].setText(s[i][j]);
				contentPane.add(cal[i][j]);
			}
		}
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cal[0][0] ) txtCalcul.setText(txtCalcul.getText()+"1");
				if(e.getSource()==cal[0][1] ) txtCalcul.setText(txtCalcul.getText()+"2");
				if(e.getSource()==cal[0][2] ) txtCalcul.setText(txtCalcul.getText()+"3"); // Number
				if(e.getSource()==cal[0][3] ) { // toplama iþlemi için
					islem = 1;
					n1 = Float.parseFloat(txtCalcul.getText());
					txtCalcul.setText("");
				}
				
				if(e.getSource()==cal[1][0] ) txtCalcul.setText(txtCalcul.getText()+"4");
				if(e.getSource()==cal[1][1] ) txtCalcul.setText(txtCalcul.getText()+"5");
				if(e.getSource()==cal[1][2] ) txtCalcul.setText(txtCalcul.getText()+"6"); // Number
				if(e.getSource()==cal[1][3] ) { // extraction process
					islem = 2;
					n1 = Float.parseFloat(txtCalcul.getText());
					txtCalcul.setText("");
				}
				
				if(e.getSource()==cal[2][0] ) txtCalcul.setText(txtCalcul.getText()+"7");
				if(e.getSource()==cal[2][1] ) txtCalcul.setText(txtCalcul.getText()+"8");
				if(e.getSource()==cal[2][2] ) txtCalcul.setText(txtCalcul.getText()+"9"); // Number
				if(e.getSource()==cal[2][3] ) { // multiplication process
					islem = 3;
					n1 = Float.parseFloat(txtCalcul.getText());
					txtCalcul.setText("");
				}
				
				if(e.getSource()==cal[3][0] ) txtCalcul.setText(txtCalcul.getText()+"0"); // Zero (0)
				if(e.getSource()==cal[3][1] ) txtCalcul.setText(txtCalcul.getText()+","); // , 
				if(e.getSource()==cal[3][2] ) { // equals process
					n2 = Float.parseFloat(txtCalcul.getText());
					txtCalcul.setText("");
					if (islem==1) sonuc = n1+n2;
					if (islem==2) sonuc = n1-n2;
					if (islem==3) sonuc = n1*n2;
					if (islem==4) sonuc = n1/n2;
					txtCalcul.setText(Float.toString(sonuc));
				}
				if(e.getSource()==cal[3][3] ) { // divide process
					islem = 4;
					n1 = Float.parseFloat(txtCalcul.getText());
					txtCalcul.setText("");
				}
			}
		};
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				cal[i][j].addActionListener(al);
			}
		}
		
	}
}
