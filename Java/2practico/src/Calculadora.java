import java.util.Scanner;

public class Calculadora {
	Scanner sc = new Scanner(System.in);
	
	int num1 = pedirDatos();
	int num2 = pedirDatos();
	
	void Iniciar() {
		mostrar();
		pedirDatos();
	}
	
	//MOSTRAR
	void mostrar() {
		int result1 = Sumar(num1, num2);
		int result2 = Restar(num1, num2);
		int result3 = multi(num1, num2);
		int result4 = didir(num1, num2);
		
		System.out.println("la suma es: " + result1);
		System.out.println("La resta es: " + result2);
		System.out.println("La multiplicacion es: " + result3);
		System.out.println("La division es: " + result4);
	}
	
	//PEDIR DATOS
	public int pedirDatos() {
		System.out.println("Ingrese dos numeros: ");
		int dato = sc.nextInt();
		
		return dato;
	}
	
	//SUMAR
	public int Sumar(int a, int b) {
		return (a+b);
	}
	
	//RESTAR
	public int Restar(int a, int b) {
		return (a-b);
	}
	
	//MULTIPLICACION
	int multi(int a, int b) {
		return (a*b);
	}
	
	//DIVIDIR
	int didir(int a, int b) {
		return (a/b);
	}

}
