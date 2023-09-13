		/*GESTOR DE CONTACTOS: Crea una aplicacion para almacenar y administrar la informacion
	 * de contactos, incluyendo nombres, numeros de telefonos y correos electronicos.*/
package consola;
import logica.agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class main_agenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<agenda> lista = new ArrayList<>();
		
		int op;
		
		do {
			System.out.println("1.Agregar Contacto");
			System.out.println("2.Ver Contactos");
			System.out.println("3.Remover Contactos");
			System.out.println("0.Salir");
			System.out.println("Ingrese una opcion: ");
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				
				for (int i = 0; i <= lista.size(); i++) {
					
					System.out.println("Ingrese el nombre a agendar: ");
					String nombre = entrada.next();
					System.out.println("Ingrese el numero a agendar: ");
					int numero = entrada.nextInt();
					System.out.println("Ingrese el correo a agendar: ");
					String correo = entrada.next();
					
					agenda contactos = new agenda(nombre,numero,correo);
					lista.add(contactos);
					
					System.out.println("-------- Contacto numero: " + i + " ---------");
					System.out.println(contactos.toString());
					
					System.out.println("Quiere seguir agregando contactos? " +
					"\n1.Si" + 
					"\n2.No" + 
					"\n---------------------------------------");
					
					System.out.println("Respuesta: ");
					int respuesta = entrada.nextInt();
					
					if (respuesta == 2) {				
						
						System.out.println("--------------------------------------------"
								+ "\nEl numero de contactos agendados fueron: " + lista.size() + 
								"\n---------------------------------------------");
						break;
					} 
					
				}
				break;
			
			case 2:
				
				System.out.println("Los contactos agregados fueron: ");
				System.out.println("\n--------------------------------------");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(lista.get(i).toString());
				}
				
				break;
			
			case 3:

				System.out.println("Contactos disponibles:");
				for (int i = 0; i < lista.size(); i++) {
					
					System.out.println("-------- Contacto numero: " + i + " ---------");
					System.out.println(i + "." + lista.get(i).toString());
					
				}
				
				System.out.println("Ingrese el numero de contacto a eliminar: ");
				int opBorrar = entrada.nextInt();
				
				if (opBorrar >=0 && opBorrar < lista.size()) {
					lista.remove(opBorrar);
					System.out.println("Contacto eliminado");
				}
				
				
				break;
				

			case 0:
				System.out.println("Agenda Cerrada.!!");
				break;
			}
			
		} while (op != 0);

	}

}
