import java.util.Scanner;

public class Estudiante extends Persona {
	Scanner scanner = new Scanner(System.in);
	
	private int codigEstudiante;
	private float notaFinal;
	
	public Estudiante(){
		super();
	}
	
	public Estudiante(String Nombre,String Apellido,int Edad, int codigoEstudiante,float notaFinal) {
		super(Nombre, Apellido, Edad);
		this.codigEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		System.out.println("Edad: " + getEdad());
		System.out.println("Codigo Estudiante: " + codigEstudiante);
		System.out.println("Nota Final: " + notaFinal);
	}

	public int getCodigEstudiante() {
		return codigEstudiante;
	}

	public void setCodigEstudiante(int codigEstudiante) {
		this.codigEstudiante = codigEstudiante;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	
	
}
