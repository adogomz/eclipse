import java.util.*;

// Programa que suma todos los n�meros entre 1 y el valor dado
//   ambos inclusive
public class SumaScanner {
   public static void main(String[] args) {
      // Lee por teclado el n�mero m�ximo
      Scanner teclado = new Scanner(System.in);
      System.out.print("Introduce un n�mero: ");
      int numero = teclado.nextInt();
       
      // Suma todos los n�meros desde el 1 al n�mero dado
      int suma = sumaHasta(numero);
      System.out.println("Resultado: " + suma);
   }
   
   // Calcula y devuelve la suma de los n�meros 
   // entre 1 y max.
   //
   // int max - valor m�ximo que se incluye en la suma
   public static int sumaHasta(int max) {
      int suma = 0;
      for(int i = 1; i < max; i++){
         suma = suma + i;         
      }
      
      return suma;
   }
}