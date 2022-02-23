package ud04_ficheros;

// Programa de uso de la clase File

import java.io.*;
import java.util.Scanner;

public class InforFichero {
   public static void main(String[] args) {
	   
      File fichero = new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion");
      Scanner leerFichero = new Scanner("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion");
      
      System.out.println("el método exists() devuelve " + fichero.exists());
      System.out.println("el método canRead() devuelve " + fichero.canRead());
      System.out.println("el método length() devuelve " + fichero.length());
      System.out.println("el método getAbsolutePath() devuelve " + fichero.getAbsolutePath());
      System.out.println("devuleve la ruta abosluta del fichero " + fichero.getAbsolutePath());
      
      String palabras = leerFichero.next();
      System.out.println(palabras);
      leerFichero.close();
   }
}