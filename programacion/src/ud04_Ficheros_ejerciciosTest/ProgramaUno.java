package ud04_Ficheros_ejerciciosTest;

import java.io.*;
import java.util.*;


public class ProgramaUno {
	   // Lanzamos la excepcion FileNotFoundException para que el programa compile
    	// Le indicamos que sabemos que se puede producir esa excepcion y la vamos a gestionar

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Esbozo de método generado automáticamente
		
		File fichero = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\ejerciciosTest\\datos.txt");
		Scanner leerFichero = new Scanner(fichero);
		
		// mientras quede una palabra la leemos
		// si es un numero entero, lo contamos. en caso contrario, se lee y se desecha.
		
		// contador para almacenar los numeros
		int contador = 0;
		
		while(leerFichero.hasNext()) {
			if(leerFichero.hasNextInt()) {
				int numero = leerFichero.nextInt();
				contador ++;
			} else {
				String palabra = leerFichero.next();
			}
		}
		
		// mostramos el numero de enteros que tenemos leido
		System.out.println("Tiene "+ contador + " numeros enteros");
				
		// cerramos la conexion al fichero
		leerFichero.close();
	}

}
