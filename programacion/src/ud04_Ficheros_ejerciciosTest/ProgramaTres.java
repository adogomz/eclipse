package ud04_Ficheros_ejerciciosTest;

// Librerias que necesitamos para trabajar con las clases Scanner y File
import java.util.*;
import java.io.*;

public class ProgramaTres {
	
		    // Lanzamos la excepcion FileNotFoundException para que el programa compile
		    // Le indicamos que sabemos que se puede producir esa excepcion y la vamos a gestionar
		 public static void main(String[] args) throws FileNotFoundException {
		        
		        // Creamos un objeto File para representar el fichero "datos.txt"
		        // y lo usamos para crear un objeto Scanner que conectar con el para leerlo
		        Scanner leerFich = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\ejerciciosTest\\datos2.txt"));
		        
		        // Leemos todos los textos del fichero
		        // Si se corresponden con un entero, lo indicamos
		        // Si se corresponden con un numero decimal, lo indicamos
		        // El resto seran palabras
		        while (leerFich.hasNext()) {
		            if (leerFich.hasNextInt()) {
		               int entero = leerFich.nextInt();
		               System.out.println(entero + ": entero");
		            } else if (leerFich.hasNextDouble()) {
		               double decimal = leerFich.nextDouble();
		               System.out.println(decimal + ": double");
		            } else {
		               String palabra = leerFich.next();
		               System.out.println(palabra + ": palabra");
		            }
		        }
		        
		        // Cerramos la conexion al fichero
		        leerFich.close();
		    }
		
	}


