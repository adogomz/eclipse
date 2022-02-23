package ud04_ficheros;

// Programa que lee números de un fichero y los muestra por consola
//
// Considera que el fichero numeros.txt existe y tiene números, no se sabe cuántos
// Lee todos los números y se salta los que no son

import java.util.*;     // Clase Scanner
import java.io.*;       // Clase File

public class LeerFicheroTexto3 {
   public static void main(String[] args) throws FileNotFoundException {
      // Conecta con el fichero
      /*File fichero = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\leerFichero3.txt");
      Scanner leerFichero = new Scanner(fichero);*/
	  Scanner leerFichero = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\leerFichero3.txt"));
      leerFichero.useLocale(Locale.US);    
      
      
      // Mientras haya otro elemento para leer sigue leyendo deberiamos usar (hasNext)
      while (leerFichero.hasNext()) {
    	// si el elemento es double lo leemos y lo mostramos (hasNextDouble)
    	  if (leerFichero.hasNextDouble()) {
    		double num = leerFichero.nextDouble();
    		System.out.println(num);
    		
    	  } else {		// en caso contrario lo leemos y lo descartamos
    		  String otros = leerFichero.next();
    	  }
      }
      // Cierra la conexion con el archivo
      leerFichero.close();
   }
}