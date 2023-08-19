package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumaNumerosBasico extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroUno;
	private JTextField txtNumeroDos;
	private JTextField txtResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumaNumerosBasico frame = new SumaNumerosBasico();
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
	public SumaNumerosBasico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("SUMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		
		txtNumeroUno = new JTextField();
		txtNumeroUno.setColumns(10);
		
		txtNumeroDos = new JTextField();
		txtNumeroDos.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dato1");
		
		JLabel lblNewLabel_2 = new JLabel("Dato 2");
		
		JButton btSuma = new JButton("SUMA");
		btSuma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int numeroUno = 0;
				int numeroDos = 0;
				int resultado = 0;
				
				numeroUno = Integer.parseInt(txtNumeroUno.getText());
				numeroDos = Integer.parseInt(txtNumeroDos.getText());
				resultado = numeroUno + numeroDos;
				
				txtResul.setText("" + resultado);
			}
		});
		
		JButton btBorrar = new JButton("BORRAR");
		btBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNumeroUno.setText(null);
				txtNumeroDos.setText(null);
				txtResul.setText(null);
				
			}
		});
		
		txtResul = new JTextField();
		txtResul.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(txtNumeroUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
					.addComponent(txtNumeroDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addGap(108))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(334)
					.addComponent(lblNewLabel)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(163)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtResul, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(btSuma, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btBorrar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(186, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumeroUno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumeroDos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtResul, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(btSuma)
					.addGap(18)
					.addComponent(btBorrar)
					.addGap(34))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
