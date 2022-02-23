package ud04_Ficheros_ejerciciosTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Esbozo de método generado automáticamente
		
		Scanner sarrera = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\ejerciciosTest\\lineas.txt"));
		while (sarrera.hasNextLine()) {
		    System.out.println("Linea: " + sarrera.nextLine());
		}
}
}
