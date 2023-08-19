import java.util.Scanner;

public class Celular {
	Scanner sc = new Scanner(System.in);
	
	//ATRUBUTOS DEL AUTO
	private String modelo;
	private String color;
	private String marca;
	private String condicionBateria;
	private String camaraPX;
	
	
	//CONSTRUCTOR
	public Celular(String modelo, String color, String marca, String condicionBateria, String camaraPX) {
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
		this.condicionBateria = condicionBateria;
		this.camaraPX =camaraPX;
	}
	
	public Celular() {}
	
	//METODOS
	
	public void EncenderCelular() {
		
		System.out.println("ENCENDIDO");
		
	}
	
	public void ReiniciarCelular() {
		System.out.println("REINICIANDO");
	}
	
	public void ApagarCelular() {
		System.out.println("APAGANDO");
	}
	
	//FUNCIONALIDAD
	
	//PEDIR DATOS
	public void PedirDatos() {
		System.out.println("Ingrese el modelo:");
		modelo =sc.next();
		
		System.out.println("Ingrese el color:");
		color =sc.next();
		
		System.out.println("Ingrese el marca:");
		marca =sc.next();
		
		System.out.println("Ingrese el Condicion de bateria:");
		condicionBateria =sc.next();
		
		System.out.println("Ingrese el PX de Camara:");
		camaraPX =sc.next();
	}
	
	
	//METODO INFORMACION
	public void Info() {
		System.out.println("________________________*___________________________");
		System.out.println("");
		System.out.println("Modelo: " + modelo);
		System.out.println("Color: " + color);
		System.out.println("Marca: " + marca);
		System.out.println("Bateria Condiciion: " + condicionBateria);
		System.out.println("Px Camara: " + camaraPX);
		System.out.println("_________________________*__________________________");
	}
	
	//GETTERS Y SETTERS

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCondicionBateria() {
		return condicionBateria;
	}

	public void setCondicionBateria(String condicionBateria) {
		this.condicionBateria = condicionBateria;
	}

	public String getCamaraPX() {
		return camaraPX;
	}

	public void setCamaraPX(String camaraPX) {
		this.camaraPX = camaraPX;
	}
	
	

}
