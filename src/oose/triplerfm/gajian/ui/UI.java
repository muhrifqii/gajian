package oose.triplerfm.gajian.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class UI {

	private JFrame frmGajian;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmGajian.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGajian = new JFrame();
		frmGajian.setTitle("GAJIAN");
		frmGajian.setFont(new Font("Roboto", Font.PLAIN, 12));
		frmGajian.setAlwaysOnTop(true);
		frmGajian.setBounds(100, 100, 450, 500);
		frmGajian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGajian.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 6, 362, 449);
		frmGajian.getContentPane().add(panel);
		panel.setLayout(null);
		
		username = new JTextField();
		username.setBounds(0, 0, 114, 20);
		panel.add(username);
		username.setToolTipText("USERNAME");
		username.setColumns(10);
	}
}
