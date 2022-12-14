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
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

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
		frmSubvenciones.getContentPane().setBackground(new Color(255, 208, 255));
		frmSubvenciones.setFont(new Font("Proxy 1", Font.PLAIN, 14));
		frmSubvenciones.setTitle("Comprobación de subvenciones");
		frmSubvenciones.setBounds(100, 100, 450, 300);
		frmSubvenciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubvenciones.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Alvaro Gómez Tejada");
		lblNewLabel.setFont(new Font("Proxy 1", Font.BOLD, 14));
		lblNewLabel.setBounds(229, 10, 197, 19);
		frmSubvenciones.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Introducir nombre de la empresa");
		lblNewLabel_1.setBounds(10, 28, 209, 32);
		frmSubvenciones.getContentPane().add(lblNewLabel_1);

		JTextField textEmpresa = new JTextField();
		textEmpresa.setBounds(10, 67, 157, 19);
		frmSubvenciones.getContentPane().add(textEmpresa);
		textEmpresa.setColumns(10);

		JRadioButton radioHombre = new JRadioButton("Hombres");
		radioHombre.setForeground(new Color(0, 0, 0));
		radioHombre.setBackground(new Color(255, 208, 255));
		radioHombre.setBounds(10, 112, 103, 21);
		frmSubvenciones.getContentPane().add(radioHombre);

		JRadioButton radioMayor = new JRadioButton("Mayores de 18 años");
		radioMayor.setBackground(new Color(255, 208, 255));
		radioMayor.setBounds(119, 112, 157, 21);
		frmSubvenciones.getContentPane().add(radioMayor);

		JRadioButton Espanol = new JRadioButton("Español");
		Espanol.setBackground(new Color(255, 208, 255));
		Espanol.setBounds(278, 112, 103, 21);
		frmSubvenciones.getContentPane().add(Espanol);

		JLabel lblNewLabel_2 = new JLabel("Contrata a :");
		lblNewLabel_2.setBounds(10, 96, 65, 13);
		frmSubvenciones.getContentPane().add(lblNewLabel_2);

		JRadioButton radioMujer = new JRadioButton("Mujeres");
		radioMujer.setBackground(new Color(255, 208, 255));
		radioMujer.setBounds(20, 135, 103, 21);
		frmSubvenciones.getContentPane().add(radioMujer);

		JRadioButton radioMenor = new JRadioButton("Menores de 18 años");
		radioMenor.setBackground(new Color(255, 208, 255));
		radioMenor.setBounds(129, 135, 147, 21);
		frmSubvenciones.getContentPane().add(radioMenor);

		JRadioButton extranjero = new JRadioButton("Extranjero");
		extranjero.setBackground(new Color(255, 208, 255));
		extranjero.setBounds(288, 135, 103, 21);
		frmSubvenciones.getContentPane().add(extranjero);

		JLabel lblResul = new JLabel("");
		lblResul.setHorizontalAlignment(SwingConstants.CENTER);
		lblResul.setBounds(10, 240, 416, 13);
		frmSubvenciones.getContentPane().add(lblResul);

		JButton btnComprobar = new JButton("Solicitar subvención");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empresa = textEmpresa.getText();
				if (textEmpresa.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Error!!! Inutil introdudca un nombre de empresa", "Error",
							JOptionPane.INFORMATION_MESSAGE);
					lblResul.setText("");
				} else if (radioMujer.isSelected() && radioMayor.isSelected() && extranjero.isSelected()) {
					lblResul.setText("La empresa " + empresa + " puede solicitar la subvención");
				} else {
					lblResul.setText("La empresa " + empresa + " no puede solicitar la subvención");
				}
			}
		});

		btnComprobar.setBounds(129, 184, 176, 46);
		frmSubvenciones.getContentPane().add(btnComprobar);
	}
}
