// Este program lee las notas de diferentes alumnos y alumnas de un fichero de texto
// y calcula y muestra la nota media de cada uno

import java.io.*;
import java.util.*;

public class MediaAlumnaLineas {

   // Lee línea a línea el fichero y llama al método procesarLinea por cada una de ellas
   public static void main(String[] args) throws FileNotFoundException {
   
      // Conecta con el fichero alumnosID.txt
      Scanner leerFichero = new Scanner(new File("alumnosId.txt"));
      
      // Mientras haya otra línea más por leer, la lee y la procesa
      while (leerFichero.hasNextLine()) {
         String linea = leerFichero.nextLine();
         procesarLinea(linea);
      }
      
      // Cierra la conexión
      leerFichero.close();
   }

   // Procesa la cadena proporcionada (ID, name, and hours worked)
   // String texto: línea de texto que hay que procesar
   public static void procesarLinea(String texto) {

      // Crea un objeto de tipo Scanner a partir de una cadena de texto
      Scanner linea = new Scanner(texto);
      
      // Lee el id del alumno o alumna
      int id = linea.nextInt();
      
      // Lee el nombre del alumno o alumna
      String nombre = linea.next();
      
      // Lee las calificaciones, las cuenta y las suma
      int cont = 0;
      double suma = 0;
      while (linea.hasNextDouble()) {
         double num = linea.nextDouble();
         suma = suma + num;
         cont++;
      }
      
      // Visualiza los datos del alumno o alumna y su nota media
      System.out.println("Nota media de " + nombre + " (id#" + id + ") = " + suma / cont);

   }
}