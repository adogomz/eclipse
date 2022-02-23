 // Programa que resuelve problemas FENCE-POST con bucles FOR y WHILE

import java.util.*;

public class FencePost {
   public static final int FIN = -2;
   
   public static void main(String[] args) {
      contarHasta(10);
      contarHasta(15);
      System.out.println();
      
      deletreaPalabra("abracadabra");
      deletreaPalabra("CSE142");
      System.out.println();
      
      Scanner teclado = new Scanner(System.in);
      sumarNumeros(teclado);
   }
   
   // Imprime los n�meros del 1 al max separado por comas.
   //
   // int max - em n�mero mayor a imprimir
   public static void contarHasta(int max) {
      //System.out.print(1);
      for(int i = 1; i < max; i++) {
         System.out.print(i +  ", ");
      }
      System.out.println(max);
   }
   
   // Imprime los caract�res de una palabra separados por guiones.
   //
   // String palabra - palabra que se quiere imprimir
   public static void deletreaPalabra(String palabra) {
      int longi = palabra.length();
      for(int i = 0; i < longi - 1; i++) {
         System.out.print(palabra.charAt(i) + " - ");
      }
      System.out.println(palabra.charAt(longi - 1));
   }
   
   // Lee n�meros por teclado hasta introducir el FIN,
   //   Imprime el total de n�meros introducidos y su suma (sin
   //   incluir el FIN).
   //
   // Scanner teclado - Scanner para leer los n�meros por teclado
   public static void sumarNumeros(Scanner teclado) {
       //Pedir un numero
      // System.out.print("Introduce numero: ");
       int num = teclado.nextInt();
       
       // Si el numero es distinto que FIN contar, sumar y pedir otro
       int suma = 0;
       int cont = 0;
       while(num != FIN) {
         suma = suma + num;
         cont++;
         System.out.print("Introduce numero: ");
         num = teclado.nextInt();
       }
       // Si el numero es igual a FIN acabar y mostrar totales
       System.out.println("Total: " + cont);
       System.out.println("Suma: " + suma); 
   }
}