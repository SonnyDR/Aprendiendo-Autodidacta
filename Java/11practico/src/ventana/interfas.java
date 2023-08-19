package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class interfas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCorreo;
	private JPasswordField passContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					interfas frame = new interfas();
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
	public interfas() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(interfas.class.getResource("/imagenes/icon_para_logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 445);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabelFondo = new JLabel("");
		lblNewLabelFondo.setBounds(0, -14, 275, 430);
		lblNewLabelFondo.setIcon(new ImageIcon(interfas.class.getResource("/imagenes/wallpaper2.jpg")));
		contentPane.setLayout(null);
		
		JButton btSalir = new JButton("Salir");
		btSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btSalir.setForeground(new Color(255, 255, 255));
		btSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btSalir.setBackground(new Color(72, 61, 139));
		btSalir.setBounds(189, 11, 70, 23);
		contentPane.add(btSalir);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(interfas.class.getResource("/imagenes/User.png")));
		lblIcon.setBounds(31, 11, 228, 282);
		contentPane.add(lblIcon);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setForeground(new Color(255, 255, 255));
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCorreo.setBounds(20, 304, 59, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(86, 303, 161, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contrasena:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(20, 343, 90, 14);
		contentPane.add(lblNewLabel);
		
		passContra = new JPasswordField();
		passContra.setBounds(115, 342, 132, 20);
		contentPane.add(passContra);
		
		JButton btLogin = new JButton("Login");
		btLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				String Dato1;
				String valorPass;
				
				valorPass = new String(passContra.getPassword());
				Dato1 = txtCorreo.getText();
			
				if (valorPass.isEmpty() || Dato1.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR, INGRESE LOS DATOS!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Datos Registrados Correctamente"
							+ "\n Tus datos son: "
							+ "\n Correo: " + Dato1 + ""
									+ "\n Contrase�a: " + valorPass );
					
					dispose();
                                        
                                        
				}

					
			}
			
		});
		btLogin.setBackground(new Color(0, 0, 128));
		btLogin.setForeground(new Color(255, 255, 255));
		btLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btLogin.setBounds(178, 372, 70, 23);
		contentPane.add(btLogin);
		
		JButton btRegister = new JButton("Registrarse");
		btRegister.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				registro registro = new registro();
				registro.show();
				
			}
			
			
		});
		btRegister.setForeground(Color.WHITE);
		btRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
		btRegister.setBackground(new Color(0, 0, 128));
		btRegister.setBounds(20, 373, 109, 23);
		contentPane.add(btRegister);
		contentPane.add(lblNewLabelFondo);
	}
}
