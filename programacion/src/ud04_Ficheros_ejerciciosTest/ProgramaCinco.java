package ud04_Ficheros_ejerciciosTest;
import java.util.*;
import java.io.*;

/* Leerá el fichero y mostrará las líneas que tiene cada parrafo. 
 * Devolverá el número de líneas que tiene el parrafo más largo. 
 * Los párrafos finalizan con un punto.
 */


public class ProgramaCinco {

	public static void main(String[] args) throws FileNotFoundException { 
	
		Scanner leerFichero = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\ud04_Ficheros_ejerciciosTest\\parrafos.txt"));
		
		int largo = parrafos(leerFichero);
		
		System.out.println("Parrafo mas largo: " + largo);
		
		leerFichero.close();
	}
		
		// Lee el fichero linea a linea. Identifica las lineas que acaban en punto (final del parrafo)
	    // para contar las lineas del parrafo
	    // Controla el numero de lineas del parrafo mas largo
	    public static int parrafos(Scanner leer) {
	        int max = -1;
	        
	        // Lee lineas del Scanner hasta llegar al final del fichero
	        while (leer.hasNextLine()) {
	            
	            // Lee la primera linea del parrafo y la cuenta
	            String linea = leer.nextLine();
	            int cont = 1;
	            
	            // Mientras no llega al final del parrafo (.) sigue leyendo lineas y las cuenta
	            while(!linea.endsWith(".")) {
	               cont++;
	               linea = leer.nextLine();
	            }
	            
	            // Ha llegado el final del parrafo y muestra cuantas lineas tiene
	            System.out.println("Parrafo con " + cont + " lineas");
	            
	            // Si el numero de lineas del parrafo es mayor que el maximo, lo actualiza
	            if (cont > max) {
	               max = cont;
	            }
	        } 
	        
	        // Devuelve cuantas lineas tiene el parrafo mas largo
	        return max;
	    }
	}