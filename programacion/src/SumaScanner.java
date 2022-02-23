import java.util.*;

// Programa que suma todos los números entre 1 y el valor dado
//   ambos inclusive
public class SumaScanner {
   public static void main(String[] args) {
      // Lee por teclado el número máximo
      Scanner teclado = new Scanner(System.in);
      System.out.print("Introduce un número: ");
      int numero = teclado.nextInt();
       
      // Suma todos los números desde el 1 al número dado
      int suma = sumaHasta(numero);
      System.out.println("Resultado: " + suma);
   }
   
   // Calcula y devuelve la suma de los números 
   // entre 1 y max.
   //
   // int max - valor máximo que se incluye en la suma
   public static int sumaHasta(int max) {
      int suma = 0;
      for(int i = 1; i < max; i++){
         suma = suma + i;         
      }
      
      return suma;
   }
}