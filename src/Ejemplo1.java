import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Ejemplo1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 window = new Ejemplo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número1");
		lblNewLabel.setFont(new Font("Proxy 1", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 43, 146, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número2");
		lblNewLabel_1.setFont(new Font("Proxy 1", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 91, 119, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 255, 0));
		textField.setForeground(new Color(255, 0, 0));
		textField.setBounds(96, 54, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(0, 255, 0));
		textField_1.setForeground(new Color(255, 0, 0));
		textField_1.setBounds(96, 98, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Proxy 1", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 150, 98, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(0, 255, 0));
		textField_2.setForeground(new Color(255, 0, 0));
		textField_2.setBounds(96, 148, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int num1=Integer.parseInt(textField.getText());

	            int num2=Integer.parseInt(textField_1.getText());

	            int suma=num1+num2;

	            textField_2.setText(String.valueOf(suma));
			}
		});
		btnNewButton.setBounds(314, 236, 126, 48);
		frame.getContentPane().add(btnNewButton);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cresn\\Temas de Escritorio\\Iconos\\Programación\\C#.ico"));
		frame.setBackground(new Color(255, 0, 0));
		frame.setBounds(100, 100, 464, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
