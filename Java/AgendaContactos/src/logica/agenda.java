package logica;

public class agenda {
	
	
	/*GESTOR DE CONTACTOS: Crea una aplicacion para almacenar y administrar la informacion
	 * de contactos, incluyendo nombres, numeros de telefonos y correos electronicos.*/

	private String nombre;
	private int numero;
	private String correo;
	
	
	public agenda () {
		
	}
	
	public agenda (String nombre,int numero, String correo) {
		this.nombre = nombre;
		this.numero = numero;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return	"El nombre agendado es: " + nombre + 
				"\nEl numero agendado es: " + numero + 
				"\nEl correo agendado es: " + correo + 
				"\n--------------------------------------"; 
	}
	
}
