package es.pildorasInformaticas.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Introduce una frase");
		 String frase = entrada.nextLine();
		 
		 System.out.println("Introduce tu nombre");
		 String nombre = entrada.nextLine();
		 
		 System.out.println("Introduce un numero que quieras sumar");
		 int numero = entrada.nextInt();
		 
		 System.out.println("introduce otro numero para sumar");
		 double numero2 = entrada.nextDouble();
		 
		 
		 
		 
		 double suma = numero + numero2;
		 
		 System.out.println("Hola " + nombre);
		 
		 System.out.println("la suma de los numero es : " + suma);
		 
		 System.out.println(frase);
		 
		
		 
	}
	
}
	
