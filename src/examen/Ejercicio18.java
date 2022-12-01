package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio18 {

	private JFrame frmSubvenciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio18 window = new Ejercicio18();
					window.frmSubvenciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio18() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubvenciones = new JFrame();
		frmSubvenciones.setTitle("Subvenciones");
		frmSubvenciones.setBounds(100, 100, 450, 300);
		frmSubvenciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubvenciones.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Al");
		lblNewLabel.setBounds(270, 240, 156, 13);
		frmSubvenciones.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de empresa");
		lblNewLabel_1.setBounds(10, 28, 118, 13);
		frmSubvenciones.getContentPane().add(lblNewLabel_1);
		
		JTextField textEmpresa = new JTextField();
		textEmpresa.setBounds(138, 25, 96, 19);
		frmSubvenciones.getContentPane().add(textEmpresa);
		textEmpresa.setColumns(10);
		
		JRadioButton radioH = new JRadioButton("Hombres");
		radioH.setBounds(138, 66, 103, 21);
		frmSubvenciones.getContentPane().add(radioH);
		
		JRadioButton radioMayor = new JRadioButton("Mayores de 18");
		radioMayor.setBounds(138, 89, 130, 21);
		frmSubvenciones.getContentPane().add(radioMayor);
		
		JRadioButton radioEsp = new JRadioButton("Español");
		radioEsp.setBounds(138, 112, 103, 21);
		frmSubvenciones.getContentPane().add(radioEsp);
		
		JLabel lblNewLabel_2 = new JLabel("Contrata a :");
		lblNewLabel_2.setBounds(10, 70, 65, 13);
		frmSubvenciones.getContentPane().add(lblNewLabel_2);
		
		JRadioButton radioM = new JRadioButton("Mujeres");
		radioM.setBounds(270, 66, 103, 21);
		frmSubvenciones.getContentPane().add(radioM);
		
		JRadioButton radioMenor = new JRadioButton("Menores de 18");
		radioMenor.setBounds(270, 89, 130, 21);
		frmSubvenciones.getContentPane().add(radioMenor);
		
		JRadioButton radioExt = new JRadioButton("Extranjero");
		radioExt.setBounds(270, 112, 103, 21);
		frmSubvenciones.getContentPane().add(radioExt);
	
		
		JLabel lblResul = new JLabel("");
		lblResul.setBounds(121, 186, 305, 13);
		frmSubvenciones.getContentPane().add(lblResul);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empresa= textEmpresa.getText();
				if (textEmpresa.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Debes introducir un nombre de empresa" , "Error",
							JOptionPane.INFORMATION_MESSAGE);
					lblResul.setText("");
				}else if (radioM.isSelected() && radioMayor.isSelected() && radioExt.isSelected()) {
					lblResul.setText("La empresa "+ empresa + " puede solicitar la subvención");
				} else {
					lblResul.setText("La empresa "+ empresa + " no puede solicitar la subvención");
				}
			}
		});

		btnComprobar.setBounds(10, 182, 101, 21);
		frmSubvenciones.getContentPane().add(btnComprobar);
	}
}
