
public class auto {

	//ATRUBUTOS DEL AUTO
	private String modelo;
	private String marca;
	private String anio;
	private String color;
	
	//CONSTRUCOR PARA LOS OBJETOS
	public auto(String modelo, String marca, String anio, String color) {
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
		this.color = color;
	}
	
	public auto() {} // CONSTRUCOTOR VACIO PARA LLMARLO DESDE EL MAIN
	
	//METODOS DE LA CLASE/FUNCIONAMIENTO
	public void encendido() {
		System.out.println("Encendido");
	}
	
	public void apagado() {
		System.out.println("apagado");
	}
	
	public void info() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Anio: " + anio);
		System.out.println("Color: " + color);
	}
	
	//GETTERS Y SETERS (se retorna en el metodo info)
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
