// Programa que lee números de un fichero y los muestra por consola
//
// Considera que el fichero numeros.txt existe y tiene al menos 5 números
// Lanzará una excepción si encuentra un valor no númerico o hay menos de 5 números

import java.util.*;     // Clase Scanner
import java.io.*;       // Clase File

public class LeerFicheroTexto1 {
   public static void main(String[] args) throws FileNotFoundException /*throws FileNotFoundException*/ { // sentencia throws excepcion de errores
      // Conecta con el fichero
      File fichero = new File("numeros.txt");
      Scanner leerFichero = new Scanner(fichero);
      leerFichero.useLocale(Locale.US);      // Notación americana, números con punto decimal
      
      // Lee 5 numeros double del fichero y los muestra por consola
      for (int i = 0; i < 5; i++) {
         double num = leerFichero.nextDouble();
         System.out.println(num);
      }

      // Cierra la conexión
      leerFichero.close();
   }
}