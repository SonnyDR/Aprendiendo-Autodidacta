
public class Persona {
	
	private String Nombre;
	private String Apellido;
	private int Edad;
	
	
	public Persona(String Nombre,String Apellido,int Edad) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
	}


	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return Nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public int getEdad() {
		return Edad;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	

}
