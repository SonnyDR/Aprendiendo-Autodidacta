//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nombresBebes {

	Scanner sc = new Scanner(System.in);
	
	int Nh;
	int Nm;
	String generoBebe;
	String n;
	
	public void Datos() {
		
		System.out.println("Ingrese el genero del bebe: ");
		generoBebe = sc.next();
		
		//NOMBRE FEMININOS
		/*ArrayList<String> nombresBebesM = new ArrayList<String>();
		nombresBebesM.add("Maria");
		nombresBebesM.add("Agustina");
		nombresBebesM.add("Juana");
		nombresBebesM.add("Manuela");
		nombresBebesM.add("Kiki");
		
		ArrayList<String> nombresBebesH = new ArrayList<String>();
		nombresBebesH.add("Federico");
		nombresBebesH.add("Alejo");
		nombresBebesH.add("Manuel");
		nombresBebesH.add("Gerardo");
		nombresBebesH.add("Jorge");*/
		
		String [] nombresBebesH;
		nombresBebesH = new String[] {"Juan","Felipe","Franco","Juancito","Ivan"};
		
		String [] nombreBebeM;
		nombreBebeM = new String[] {"Maria","Juana","Kiki","Bobita","Estupida"};
		
		//MUESTRA EL NOMBRE DE LOS HOMBRES
		
		if (generoBebe.contains("Hombre")) {
			for (int i = 0; i <=4; i++) {
				System.out.println(i + "." + nombresBebesH[i]);
			}
			
			System.out.println("");
			System.out.println("Elije el numero que contiene el nombre que quiere: ");
			Nh = sc.nextInt();
		} 
		
		else if (generoBebe.contains("hombre")) {
			for (int i = 0; i <=4; i++) {
				System.out.println(i + "." + nombresBebesH[i]);
			}
			
			System.out.println("");
			System.out.println("Elije el numero que contiene el nombre que quiere: ");
			Nh = sc.nextInt();
		} 
			
		
		//MUESTRA EL NOMBRE DE LAS MUJERES
		
		if (generoBebe.contains("mujer")) {
			for (int i = 0; i <= 4; i++) {
				System.out.println(i +"." + nombreBebeM[i]);
			}
			System.out.println("");
			System.out.println("Elije el numero que contiene el nombre que quiere: ");
			Nm = sc.nextInt();	
		}
		
		if (generoBebe.contains("Mujer")) {
			for (int i = 0; i <= 4; i++) {
				System.out.println(i +"." + nombreBebeM[i]);
			}
			System.out.println("");
			System.out.println("Elije el numero que contiene el nombre que quiere: ");
			Nm = sc.nextInt();
		}
		
		//PEDIR QUE ELIJA UN NOMBRE DE LOS QUE SE MUESTRA
		
		switch (Nm) {
		case 0:
			System.out.println("El nombre de su bebe va a ser: " + nombreBebeM[0]);
			break;

		case 1:
			System.out.println("El nombre de su bebe va a ser: " + nombreBebeM[1]);
			break;
			
		case 2:
			System.out.println("El nombre de su bebe va a ser: " + nombreBebeM[2]);
			break;
			
		case 3:
			System.out.println("El nombre de su bebe va a ser: " + nombreBebeM[3]);
			break;
			
		case 4:
			System.out.println("El nombre de su bebe va a ser: " + nombreBebeM[4]);
			break;
		}
		
		// ELEJIR NOMBRE PARA HOMBRE
		
		switch (Nh) {
		case 5:
			System.out.println("El nombre de su bebe va a ser: " + nombresBebesH[0]);
			break;

		case 6:
			System.out.println("El nombre de su bebe va a ser: " + nombresBebesH[1]);
			break;
			
		case 7:
			System.out.println("El nombre de su bebe va a ser: " + nombresBebesH[2]);
			break;
			
		case 8:
			System.out.println("El nombre de su bebe va a ser: " + nombresBebesH[3]);
			break;
			
		case 9:
			System.out.println("El nombre de su bebe va a ser: " + nombresBebesH[4]);
			break;
		}
		
		
	}
	
	
}
