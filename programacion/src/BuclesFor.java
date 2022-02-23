 // Este programa incluye diferentes métodos que demuestran
//   distintos usos de los bucles for.
public class BuclesFor {
   public static void main(String[] args) {
      for (int i = 1; i <= 1000; i++) {
         System.out.println("Otra línea...");
      }
      System.out.println();
   
      contar();
      dibujarCuadrados();
      cuentaAtras();
      cuentaAtras2();
      dibujarCuadro();
      dibujarCuadro2();
      dibujarPiramide();
   }
   
   // Cuenta del 1 al 10.
   //   Fijate en cómo funciona la variable.
   public static void contar() {
      for (int i = 1; i <= 10; i++) {
         System.out.println("Vamos " + i);
      }
      System.out.println();   
   }
   
   // Muestra los cuadrados de los números del 1 al 10. Uno por línea
   public static void dibujarCuadrados() {
      for (int i = 1; i <= 10; i++) {
         System.out.println(i + " al cuadrado = " + (i * i));
      } 
      System.out.println();   
   }
   
   // Muestra la cuenta atrás desde 10 a 1, seguido por "Hemos llegado al final"
   //   Cada número se mostrará en una línea diferente.
   public static void cuentaAtras() {
      for (int i = 10; i > 0; i--) {
         System.out.println(i);
      }    
      System.out.println("Hemos llegado al final");
      System.out.println();
   }
   
   // Muestra la cuenta atrás desde 10 a 1, seguido por "Hemos llegado al final"
   //   Todos los números se muestran en la misma línea.
   public static void cuentaAtras2() {
      for (int i = 10; i > 0; i--) {
         System.out.print(i + ", ");
      }    
      System.out.println("Hemos llegado al final");
      System.out.println();
   }
   
   // Muestra un cuadrado de 10 x 5 asteriscos.
   public static void dibujarCuadro() {
      for (int i = 1; i <= 5; i++) {
         System.out.println("**********");
      }
      System.out.println();
   }
   
   // Muestra un cuadrado de 10 x 5 asteriscos.
   //   Esta vez utilizando bucles for anidades.
   public static void dibujarCuadro2() {
      for (int i = 1; i <=5; i++) {
         for (int j = 1; j <= 10; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   // Dibuja una pirámide de 5 filas de asteriscos
   public static void dibujarPiramide() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
   }
}