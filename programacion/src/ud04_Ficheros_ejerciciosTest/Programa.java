package ud04_Ficheros_ejerciciosTest;

import java.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

public class Programa {
    
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner sarrera = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\ejerciciosPreguntas\\lineas.txt"));
    	int cont = 0;
    	while (sarrera.hasNext()) {
    	    System.out.println("Leido: " + sarrera.next());
    	    cont++;
    	}
    	System.out.println("Total: " + cont);
    }
    
    
}