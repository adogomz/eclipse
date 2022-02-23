package ud04_ficheros;
import java.io.*;
import java.util.*;

public class MediaAlumnaLineas {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Conectamos con el archivo alumnosID.txt
		Scanner leerFichero = new Scanner(new File(":\\WORKstation\\eclipse\\programacion\\src\\ud04_ficheros\\alumnosID.txt")); 
		
		// mientras haya otra liena mas por leer, la lee y la procesa
		while (leerFichero.hasNextLine()) {
			String linea = leerFichero.nextLine();
			procesarLinea(linea);
		}
		// cierrra la conexion
		leerFichero.close();
	}
	// procesa la cadena proporcionada (ID, name, and hour worker)
	// String texto: línea de texto que hay que procesar
	public static void procesarLinea(String texto) {
		// crea un objeto de tipo Scanner a partir de una cadena de texto
		Scanner linea = new Scanner (texto);
		
		// lee el id del alumno o alumna
		int id = linea.nextInt();
		
		
		// lee el nombre del alumno o la alumna
		String nombre = linea.next();
		
		
		// lee las calificaciones, las cuenta y las suma
		int contador =0;
		double suma = 0;
		while (linea.hasNextDouble()) {
			double num = linea.nextDouble();
			suma = suma + num;
			contador++;
		}
		// visualiza los datos del alumno o alumna y su nota media
		System.out.println("Nota media de " + nombre + " (id# " + id + ") = " + suma / contador);
	}
}
