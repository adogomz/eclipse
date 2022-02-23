package ud04_Ficheros_ejerciciosTest;
/*
 * Escribe un programa que lea el fichero lineas.txt y muestre su contenido por consola cambiando el orden 
 * de las líneas de dos en dos. Si el número de líneas es impar, la última línea la dejará igual.
 */


import java.util.*;
import java.io.*;

public class ProgramaSiete {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner leerFichero = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\ud04_Ficheros_ejerciciosTest\\lineasDos.txt"));
        
        intercambiarLineas(leerFichero);
        
        leerFichero.close();
    }
    
    public static void intercambiarLineas(Scanner leerFich) {
        
        // Leemos el fichero mientras queden lineas
        // Leemos 2 lineas, si las hay y las mostramos en orden inverso
        while (leerFich.hasNextLine()) {
            
            // Leemos la primera linea
            String linea1 = leerFich.nextLine();
            
            // Si hay otra, la leemos
            if (leerFich.hasNextLine()) {
                String linea2 = leerFich.nextLine();
                System.out.println(linea2);
            }
            
            System.out.println(linea1);
        }
    }
}