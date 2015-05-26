package oose.triplerfm.gajian.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

public class UI {

	private JFrame frmGajian;

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
	}

}
