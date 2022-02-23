// Este programa utiliza nuevos tipos de bucles:
//   bucles while y do-while.

import java.util.*;

public class BuclesWhile {
   public static void main(String[] args) {
      Scanner leerTeclado = new Scanner(System.in);
         
      //sumaHasta(leerTeclado, 500);
      
      System.out.println();
      int num = leerEntero(leerTeclado);
      System.out.println("N�mero: " + num);
   }
   
   // Pide y suma n�meros hasta que se supera el m�aximo permitido
   //
   // int max - limite para el valor de la suma
   // Scanner teclado - objeto de tipo Scanner para leer los n�meros por teclado
   public static void sumaHasta(Scanner teclado, int max) {
      int suma = 0;
      while(suma < max) {
         System.out.print("Introduce n�mero: ");
         int num = teclado.nextInt();
         suma += num;
      }
      System.out.println(suma);
   }

   // Comprueba que el n�mero introducido es realmente un entero antes de leerlo
   // Si no lo es, lo descarta y pide otro
   //
   // Scanner teclado - objeto de tipo Scanner para leer los n�meros por teclado
   public static int leerEntero(Scanner teclado) {
      System.out.print("Introduce n�mero: ");
      while(!teclado.hasNextInt()) {
         System.out.print("Dato no valido. Introduce n�mero: ");
         teclado.next(); //leera el dato, pero lo borrara
      }
      
      return teclado.nextInt();
   }
}