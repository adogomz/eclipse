package ud04_Ficheros_ejerciciosTest;

import java.io.*;
import java.util.*;

public class ProgramaDos {
	
	// Lanzamos la excepcion FileNotFoundException para que el programa compile
    // Le indicamos que sabemos que se puede producir esa excepcion y la vamos a gestionar
	public static void main(String[] args) throws FileNotFoundException {
		
		// creamos un objeto file para representar el fichero "edades.dat"
		File Fichero = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\ejerciciosTest\\edades.txt");
		
		// creamos un objero Scanner para poder conectar con el fichero y leerlo
		Scanner leerFichero = new Scanner(Fichero);
		
		// Creamo otro objero Scanner para pocer conectar con el teclado
		Scanner leerTeclado = new Scanner(System.in);
		
		// pedimos la edad por consola
		System.out.println("Edad: ");
		int buscar = leerTeclado.nextInt();
		
		// mientras queden palabras lee 
		boolean encontrado = false;
		while (leerFichero.hasNext()) {
			String nombre = leerFichero.next();
			int edad = leerFichero.nextInt();
			
		// si la edad es menor, muestra la edad y econtrado se pone a  true pero continua leyendo el fichero
			if (edad < buscar) {
				System.out.println(nombre + " es menor: " +  edad);
				encontrado = true;
			}
		}
		// si encontrado es false es porque no ha encontrado nungun numero menor
		if(!encontrado) {
			System.out.println("Todos los numeros son mayores");
		}
		
		// cerramos la conexion
		leerFichero.close();
		
		
	}

}
