// Este programa utiliza nuevos tipos de bucles:
//   bucles while y do-while.

import java.util.*;

public class BuclesWhile {
   public static void main(String[] args) {
      Scanner leerTeclado = new Scanner(System.in);
         
      //sumaHasta(leerTeclado, 500);
      
      System.out.println();
      int num = leerEntero(leerTeclado);
      System.out.println("Número: " + num);
   }
   
   // Pide y suma números hasta que se supera el mñaximo permitido
   //
   // int max - limite para el valor de la suma
   // Scanner teclado - objeto de tipo Scanner para leer los números por teclado
   public static void sumaHasta(Scanner teclado, int max) {
      int suma = 0;
      while(suma < max) {
         System.out.print("Introduce número: ");
         int num = teclado.nextInt();
         suma += num;
      }
      System.out.println(suma);
   }

   // Comprueba que el número introducido es realmente un entero antes de leerlo
   // Si no lo es, lo descarta y pide otro
   //
   // Scanner teclado - objeto de tipo Scanner para leer los números por teclado
   public static int leerEntero(Scanner teclado) {
      System.out.print("Introduce número: ");
      while(!teclado.hasNextInt()) {
         System.out.print("Dato no valido. Introduce número: ");
         teclado.next(); //leera el dato, pero lo borrara
      }
      
      return teclado.nextInt();
   }
}