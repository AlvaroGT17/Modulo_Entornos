import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Ejemplo2 {

	private JFrame frmEjemplo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 window = new Ejemplo2();
					window.frmEjemplo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemplo = new JFrame();
		frmEjemplo.setTitle("Ejemplo2");
		frmEjemplo.setBounds(100, 100, 450, 300);
		frmEjemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjemplo.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBounds(266, 36, 139, 35);
		frmEjemplo.getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0.0, 0.0, 20.0, 0.0));
		spinner.setBounds(331, 104, 74, 41);
		frmEjemplo.getContentPane().add(spinner);
	}
}
