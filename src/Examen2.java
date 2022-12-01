/* Alvaro Gómez Tejada */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JTextField;

public class Examen2 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen2 frame = new Examen2();
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
	public Examen2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(118, 163, 58));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subvenciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 10, 237, 68);
		contentPane.add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(20, 79, 85, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(20, 115, 85, 21);
		contentPane.add(rdbtnMujer);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mayor de 18 años");
		rdbtnNewRadioButton_1.setBounds(110, 115, 137, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Menor de 18 años");
		rdbtnNewRadioButton_1_1.setBounds(110, 79, 137, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JButton btnNewButton = new JButton("Corresponde?");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(20, 175, 155, 51);
		contentPane.add(btnNewButton);
		
		JButton btnSolicitarSubvencin = new JButton("Solicitar subvención");
		btnSolicitarSubvencin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSolicitarSubvencin.setBounds(185, 175, 241, 51);
		contentPane.add(btnSolicitarSubvencin);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nacionalidad Española");
		chckbxNewCheckBox.setBounds(260, 96, 166, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("Alvaro Gómez Tejada");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 237, 21);
		contentPane.add(lblNewLabel_1);
	}
}
