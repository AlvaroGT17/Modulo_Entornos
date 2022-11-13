package EjercicioA_20221103;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class Windows_A extends JFrame {

	private JPanel contentPane;
	private JTextField entradaUsuario;
	private JPasswordField entradapass;
	private JButton aceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows_A frame = new Windows_A();
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
	public Windows_A() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lebel1 = new JLabel("New label");
		lebel1.setIcon(new ImageIcon("C:\\Users\\Cresnik\\Dropbox\\Curso 22-23\\5.-Entornos de desarrollo\\Eclipse\\src\\EjercicioA_20221103\\titulo.png"));
		lebel1.setHorizontalAlignment(SwingConstants.CENTER);
		lebel1.setBackground(new Color(255, 255, 0));
		lebel1.setBounds(132, 29, 194, 45);
		contentPane.add(lebel1);

		JLabel usuario = new JLabel("Usuario");
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setFont(new Font("Terminator Two", Font.PLAIN, 20));
		usuario.setBounds(15, 99, 100, 32);
		contentPane.add(usuario);

		JLabel password = new JLabel("Password ");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Terminator Two", Font.PLAIN, 20));
		password.setBounds(15, 141, 142, 27);
		contentPane.add(password);

		aceptar = new JButton(" Aceptar");
		aceptar.setFont(new Font("Terminator Two", Font.PLAIN, 13));
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char[] password = entradapass.getPassword();
				String passdef = new String(password);
					
				if (entradaUsuario.getText().equals("Alvaro") && passdef.equals("1702")) {;
					dispose();
					JOptionPane.showMessageDialog(null," Vienvenido amo ","ADELANTE", JOptionPane.INFORMATION_MESSAGE);
					
					Windows_B win = new Windows_B();
					win.setVisible(true);
				} else {
					JOptionPane.showInternalMessageDialog(null, "Liberen al KRAKEEEEENNNNNN!!!!!!","Usted no es mi amo", 
					JOptionPane.ERROR_MESSAGE);
					entradaUsuario.setText("");
					entradapass.setText("");
					entradaUsuario.requestFocus();
				}
			}
				
		});
		aceptar.setIcon(new ImageIcon(
				"C:\\Users\\cresn\\Dropbox\\Curso 22-23\\5.-Entornos de desarrollo\\Eclipse\\src\\EjercicioA_20221103\\aceptar.png"));
		aceptar.setBounds(132, 197, 194, 52);
		contentPane.add(aceptar);

		entradaUsuario = new JTextField();
		entradaUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		entradaUsuario.setText("  ");
		entradaUsuario.setBounds(150, 99, 250, 32);
		contentPane.add(entradaUsuario);
		entradaUsuario.setColumns(10);

		entradapass = new JPasswordField();
		entradapass.setHorizontalAlignment(SwingConstants.CENTER);
		entradapass.setToolTipText("");
		entradapass.setEchoChar('*');
		entradapass.setBounds(150, 141, 250, 27);
		contentPane.add(entradapass);
	}
}
