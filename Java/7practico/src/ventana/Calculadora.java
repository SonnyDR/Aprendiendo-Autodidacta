package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroDos;
	private JTextField txtNumeroUno;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtNumeroDos = new JTextField();
		txtNumeroDos.setColumns(10);
		
		txtNumeroUno = new JTextField();
		txtNumeroUno.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dato1");
		
		JLabel lblNewLabel_1 = new JLabel("Dato2");
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		
		JButton btSuma = new JButton("SUMA");
		btSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int numeroUno = 0;
				int numeroDos = 0;
				int resultado = 0;
				
				numeroUno = Integer.parseInt(txtNumeroUno.getText());
				numeroDos = Integer.parseInt(txtNumeroDos.getText());
				
				resultado = numeroUno + numeroDos;
				
				txtResult.setText("" + resultado);
			}
		});
		
		JButton btDividir = new JButton("DIVIDIR");
		btDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroUno = 0;
				int numeroDos = 0;
				int resultado = 0;
				
				numeroUno = Integer.parseInt(txtNumeroUno.getText());
				numeroDos = Integer.parseInt(txtNumeroDos.getText());
				
				resultado = numeroUno / numeroDos;
				
				txtResult.setText("" + resultado);
			}
		});
		
		JButton btMultiplicar = new JButton("MULTIPLICAR");
		btMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroUno = 0;
				int numeroDos = 0;
				int resultado = 0;
				
				numeroUno = Integer.parseInt(txtNumeroUno.getText());
				numeroDos = Integer.parseInt(txtNumeroDos.getText());
				
				resultado = numeroUno * numeroDos;
				
				txtResult.setText("" + resultado);
				
			}
		});
		
		JButton btResta = new JButton("RESTA");
		btResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numeroUno = 0;
				int numeroDos = 0;
				int resultado = 0;
				
				numeroUno = Integer.parseInt(txtNumeroUno.getText());
				numeroDos = Integer.parseInt(txtNumeroDos.getText());
				
				resultado = numeroUno - numeroDos;
				
				txtResult.setText("" + resultado);
				
			}
		});
		
		JButton btnNewButton = new JButton("BORRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNumeroUno.setText(null);
				txtNumeroDos.setText(null);
				txtResult.setText(null); 
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(83))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(186)
					.addComponent(lblNewLabel_2)
					.addContainerGap(190, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtNumeroUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
							.addComponent(txtNumeroDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(56))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btSuma)
								.addComponent(btResta))
							.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btMultiplicar)
									.addGap(95))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btDividir)
									.addGap(111))))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(173)
					.addComponent(btnNewButton)
					.addContainerGap(176, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNumeroDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumeroUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(4)))
					.addComponent(txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btDividir)
						.addComponent(btSuma))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btMultiplicar)
						.addComponent(btResta))
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(7))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
