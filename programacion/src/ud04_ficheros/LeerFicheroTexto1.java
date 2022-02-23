package ud04_ficheros;

// Programa que lee numeros de un fichero y los muestra por consola
// Considera que el fichero numeros.txt exite y tiene al menos 5 numeros
// Lanzara una excepcion si encuentra un valor no numerico no reconocido o hay menos de 5 numeros


import java.util.*;     // Clase Scanner
import java.io.*;       // Clase File

public class LeerFicheroTexto1 {
   public static void main(String[] args) throws FileNotFoundException  {
	   
	   // conecta con el fichero
	   File fichero = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\leerFichero1.txt.txt");
	   Scanner leerFichero = new Scanner(fichero);
	   leerFichero.useLocale(Locale.US);
	   
	   // lee 5 numeros double del fichero y los muestra por consola
	   for (int i = 0; i < 5; i++) {
		   double num = leerFichero.nextDouble();
		   System.out.println(num);
	   }
	   
	   // cierrra la conexion
	   leerFichero.close();
	   
	  
	   
   }
}