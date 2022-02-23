package ud04_Ficheros_ejerciciosTest;
/*
 * Escribe un programa que lea el fichero nombres.dat y muestre el nombre en mayúsculas y a 
 * continuación el apellido encriptado, sustituyendo cada una de sus letras por X
	Si el fichero contiene la siguiente información:

Pedro Moreno Susana Lopez Aritz
Aranegi          Miren      Urra

 */
import java.util.*;
import java.io.*;

public class ProgramaCuatro {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Esbozo de método generado automáticamente
		Scanner leerFichero = new Scanner (new File("E:\\WORKstation\\eclipse\\programacion\\src\\ud04_Ficheros_ejerciciosTest\\nombres.dat.txt"));
	
		// leemos el nombre y apellido hasta llegar al final del  fichero y lo visualizamos encriptado
		
			while(leerFichero.hasNext()) {
			String nombre = leerFichero.next();
			String apellido = leerFichero.next();
			
			System.out.println(nombre.toUpperCase() + " ");
		
		// mostramos tantas 'X' como letras tenga el Apellido
			for (int i = 0; i < apellido.length(); i++) {
			System.out.print("X");
			} // final for
			System.out.println();
	
			} // final while

}
}

