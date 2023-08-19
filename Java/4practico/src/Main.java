
public class Main {

	public static void main(String[] args) {
		auto Auto = new auto();
		
		//LE ASIGNO LA MARCA, MODELO. ANIO, COLOR 
		Auto.setModelo("650");
		Auto.setMarca("Ferrari");
		Auto.setColor("Rojo");
		Auto.setAnio("2004");
		
		//utilizo lo métodos, llamar, cortarLlamada e informar características
		Auto.encendido();
		Auto.apagado();
		Auto.info();

	}

}
