package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.management.loading.PrivateClassLoader;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreUsu;
	private JLabel lblApellido;
	private JTextField txtApellidoUsu;
	private JLabel lblCorreoUsu;
	private JTextField txtCorreoUsu;
	private JLabel lblContraUsu;
	private JPasswordField passContraUsu;
	private JButton btRegisterUsu;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(registro.class.getResource("/imagenes/icon_para_logo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 335);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 51, 67, 14);
		contentPane.add(lblNewLabel);
		
		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(115, 50, 172, 20);
		contentPane.add(txtNombreUsu);
		txtNombreUsu.setColumns(10);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(32, 107, 67, 14);
		contentPane.add(lblApellido);
		
		txtApellidoUsu = new JTextField();
		txtApellidoUsu.setColumns(10);
		txtApellidoUsu.setBounds(115, 106, 172, 20);
		contentPane.add(txtApellidoUsu);
		
		lblCorreoUsu = new JLabel("Correo:");
		lblCorreoUsu.setForeground(Color.WHITE);
		lblCorreoUsu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCorreoUsu.setBounds(32, 163, 67, 14);
		contentPane.add(lblCorreoUsu);
		
		txtCorreoUsu = new JTextField();
		txtCorreoUsu.setColumns(10);
		txtCorreoUsu.setBounds(115, 162, 172, 20);
		contentPane.add(txtCorreoUsu);
		
		passContraUsu = new JPasswordField();
		passContraUsu.setBounds(115, 219, 172, 20);
		contentPane.add(passContraUsu);
		
		lblContraUsu = new JLabel("Contrasenia:");
		lblContraUsu.setForeground(Color.WHITE);
		lblContraUsu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContraUsu.setBounds(22, 220, 97, 14);
		contentPane.add(lblContraUsu);
		
		btRegisterUsu = new JButton("Registrarse");
		btRegisterUsu.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				String nombre;
				String apellido;
				String correoUsu;
				String contraUsu;
			
				if (txtNombreUsu.getText().isEmpty() || txtApellidoUsu.getText().isEmpty() || txtCorreoUsu.getText().isEmpty() || passContraUsu.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Error, COMPLETE LOS CAMPOS!");
				}
				
				nombre = txtNombreUsu.getName();
				apellido = txtApellidoUsu.getName();
				correoUsu = txtCorreoUsu.getName();
				contraUsu = new String(passContraUsu.getPassword());
				
				JOptionPane.showMessageDialog(null, "Datos registrado con exito!");
				dispose();
				
				
			}
			
			
			
			
		});
		
		btRegisterUsu.setForeground(new Color(255, 255, 255));
		btRegisterUsu.setBackground(new Color(0, 0, 128));
		btRegisterUsu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btRegisterUsu.setBounds(139, 262, 112, 23);
		contentPane.add(btRegisterUsu);
		
		lblNewLabel_1 = new JLabel("REGISTRO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(134, 11, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbFondo = new JLabel("");
		lbFondo.setIcon(new ImageIcon(registro.class.getResource("/imagenes/wallpaper2.jpg")));
		lbFondo.setBounds(0, 0, 347, 296);
		contentPane.add(lbFondo);
	}

	public JTextField getTxtNombreUsu() {
		return txtNombreUsu;
	}
	public JTextField getTxtApellidoUsu() {
		return txtApellidoUsu;
	}
}
