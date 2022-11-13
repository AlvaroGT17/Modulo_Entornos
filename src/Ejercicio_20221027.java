import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Ejercicio_20221027 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton articulo1;
	private JRadioButton articulo2;
	private JRadioButton articulo3;
	private JLabel resultado;
	private JComboBox comboEuros;
	private JComboBox combocentimos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_20221027 window = new Ejercicio_20221027();
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
	public Ejercicio_20221027() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		articulo1 = new JRadioButton("Articulo 1");
		buttonGroup.add(articulo1);
		articulo1.setFont(new Font("Proxy 1", Font.PLAIN, 14));
		articulo1.setBounds(31, 28, 121, 37);
		frame.getContentPane().add(articulo1);

		articulo2 = new JRadioButton("Articulo 2");
		buttonGroup.add(articulo2);
		articulo2.setFont(new Font("Proxy 1", Font.PLAIN, 14));
		articulo2.setBounds(31, 82, 121, 30);
		frame.getContentPane().add(articulo2);

		articulo3 = new JRadioButton("Articulo 3 ");
		buttonGroup.add(articulo3);
		articulo3.setFont(new Font("Proxy 1", Font.PLAIN, 14));
		articulo3.setBounds(31, 127, 121, 30);
		frame.getContentPane().add(articulo3);

		comboEuros = new JComboBox();
		comboEuros
				.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		comboEuros.setBounds(323, 44, 52, 37);
		frame.getContentPane().add(comboEuros);

		combocentimos = new JComboBox();
		combocentimos.setModel(
				new DefaultComboBoxModel(new String[] {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90"}));
		combocentimos.setBounds(323, 114, 52, 37);
		frame.getContentPane().add(combocentimos);

		JButton botonExtraer = new JButton("Extraer");
		botonExtraer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int euros=Integer.parseInt((String)comboEuros.getSelectedItem());

                int centimos=Integer.parseInt((String)combocentimos.getSelectedItem());

				if (articulo1.isSelected() && euros==0 && centimos==80)

					resultado.setText("Correcto");

                else

                    if (articulo2.isSelected() && euros==1 && centimos==20)

                    	resultado.setText("Correcto");

                    else

                        if (articulo3.isSelected() && euros==3 && centimos==10)

                        	resultado.setText("Correcto");

                        else

                        	resultado.setText("Incorrecto");
				
			}
		});
		botonExtraer.setBounds(31, 209, 85, 21);
		frame.getContentPane().add(botonExtraer);

		resultado = new JLabel("Resultado");
		resultado.setBounds(268, 204, 107, 49);
		frame.getContentPane().add(resultado);

		JLabel lblNewLabel_1 = new JLabel("Euros");
		lblNewLabel_1.setBounds(268, 52, 45, 21);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("C\u00E9ntimos");
		lblNewLabel_2.setBounds(268, 127, 45, 17);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
