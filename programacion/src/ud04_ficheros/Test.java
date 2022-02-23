package ud04_ficheros;
import java.io.*;
import java.util.Scanner;

public class Test {
	   public static void main(String[] args) throws FileNotFoundException {
		// Conectaremos con el fichero
		   System.out.println("Mensaje 1");
	        Scanner leerFichero = new Scanner(new File("datos.txt"));
	        System.out.println("Mensaje 2");
	    }
}

