package ud04_Ficheros_ejerciciosTest;

import java.io.*;
import java.util.*;

/* Crea el método conectarFichero que recibirá como parámetro un objeto de la clase Scanner 
 * para leer por teclado y devolverá otro objeto de la clase Scanner conectado al fichero introducido 
 * por el usuario. El método pedirá el nombre del fichero por teclado hasta que el usuario o la usuaria 
 * introduzca uno válido, que pueda ser leído. A continuación, conectará con ese fichero y devolverá el Scanner 
 * conectado
 */
public class ProgramaSeis {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner teclado = new Scanner(System.in);
	      Scanner fichero = conectarFichero(teclado);
	      
	      while (fichero.hasNextLine()) {
	          System.out.println(fichero.nextLine());
	      }
	      
	      fichero.close();
	    }
	    
	    // Pide el nombre del fichero hasta obtener uno que se pueda leer
	    // Conecta con el y devuelve el objeto Scanner creado
	    public static Scanner conectarFichero(Scanner leerTeclado) throws FileNotFoundException {
	        
	        // Pide el nombre del fichero
	        System.out.println("Nombre del fichero: ");
	        String nombre = leerTeclado.next();
	        
	        // Crea el objeto File para representar al fichero elegido
	        File fichero = new File(nombre);
	        
	        // Mientras el fichero no se pueda leer, seguira pidiendo otro nombre de fichero
	        // Hay que actualizar el objeto File con el nuevo fichero
	        while(!fichero.canRead()) {
	            System.out.println("Ese fichero no se puede leer. Nombre: ");
	            nombre = leerTeclado.next();
	            fichero = new File(nombre);
	        }
	        
	        // Si el fichero es valido el while acaba y se informa de ello
	        System.out.println("Fichero valido.");
	        
	        // Se crea el Scanner y se devuelve al main
	        return new Scanner(fichero);
	    }
	 }