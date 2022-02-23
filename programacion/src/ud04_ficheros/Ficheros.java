package ud04_ficheros;
//Librerias que necesitamos para trabajar con las clases Scanner y File
import java.util.*;
import java.io.*;

public class Ficheros {
 
 // Lanzamos la excepcion FileNotFoundException para que el programa compile
 // Le indicamos que sabemos que se puede producir esa excepcion y la vamos a gestionar
 public static void main(String[] args) throws FileNotFoundException {
     
     // Creamos un objeto File para representar el fichero "datos.txt"
     File ficheroEntrada = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\test.txt");
     
     // Creamos un objeto Scanner para conectar con el fichero y leerlo
     Scanner leerFichero = new Scanner(ficheroEntrada);

     // Mientras quede una palabra por leer la leemos
     // Si es un numero entero, lo contamos. En caso contrario, se lee y se descarta.
     int cont = 0;
     while (leerFichero.hasNext()) {
         if (leerFichero.hasNextInt()) {
             int num = leerFichero.nextInt();
             cont++;
         } else {
             String linea = leerFichero.next();
         }
     }
     
     // Mostramos el numero de enteros leidos
     System.out.println("Tiene " + cont + " numeros enteros");
     
     // Cerramos la conexion al fichero
     leerFichero.close();
 }
}	
		
	


