
public class Producto {

	int codigo;
	String descripcion;
	double precio;
	
	//Fija el precio del producto
	void fijarPrecio(double precioNuevo) {
		precio = precioNuevo;
	}
	
	//Muestra el precio del producto
	double obtenerPrecio() {
		return precio;
	}
	
	void precioFijo(double precio) {
		this.precio = precio;
		
		this.precio = 0.10;
		
		System.out.println(this.precio);
	}
}


