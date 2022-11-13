package EjercicioA_20221103;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Windows_B extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows_B frame = new Windows_B();
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
	public Windows_B() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 335);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), new Color(0, 0, 255), new Color(0, 0, 0), new Color(0, 255, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vienvenida = new JLabel("Amo");
		vienvenida.setForeground(new Color(255, 0, 0));
		vienvenida.setFont(new Font("Algerian", Font.BOLD, 32));
		vienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		vienvenida.setBounds(10, 86, 473, 53);
		contentPane.add(vienvenida);
		
		JLabel lblVienvenidoASus = new JLabel("Vienvenido a sus dominios");
		lblVienvenidoASus.setHorizontalAlignment(SwingConstants.CENTER);
		lblVienvenidoASus.setForeground(Color.RED);
		lblVienvenidoASus.setFont(new Font("Algerian", Font.BOLD, 32));
		lblVienvenidoASus.setBounds(10, 149, 473, 53);
		contentPane.add(lblVienvenidoASus);
	}
}
