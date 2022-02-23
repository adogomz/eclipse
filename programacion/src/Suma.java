// Programa que suma todos los números entre 1 y el valor dado
//   ambos inclusive
public class Suma {
   public static void main(String[] args) {
      int suma = sumaHasta(10);
      System.out.println("Resultado: " + suma);
   }
   
   // Calcula y devuelve la suma de los números 
   // entre 1 y max.
   //
   // int max - valor máximo que se incluye en la suma
   public static int sumaHasta(int max) {
      int suma = 0;
      int multi = 1;
      String cadena = "";
      for(int i = 1; i <= max; i++){
         suma = suma + i;
         multi = multi * i;
         cadena += i;
         
      }
      System.out.println("Resultado: " + suma);
      System.out.println("Resultado: " + multi);
      System.out.println("Resultado: " + cadena);
      
      return suma;
   }
}