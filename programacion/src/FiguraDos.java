// Este programa produce una figura compleja utilizando bicles for
public class FiguraDos {
   public static void main(String[] args) {
      dibujaLinea();
      dibujarParteSuperior();
      dibujarParteInferior();
      dibujaLinea();
   }
   
   // Dibujar la línea que aparece en la parte superior e inferior
   //   de la figura
   public static void dibujaLinea() {
      System.out.print("#");
      for (int i = 0; i < 16; i++) {
         System.out.print("=");
      }
      System.out.println("#");      
   }
   
   // Dibujar la parte superior de la figura
   public static void dibujarParteSuperior() {
      for (int linea = 1; linea <= 4; linea++) {
         System.out.print("|");
         // Dibuja 8 - 2*linea  espacios
         for (int i = 0; i < 8 - 2 * linea; i++) {
            System.out.print(" ");
         }
         
         // Dibuja <>
         System.out.print("<>");
         
         // Dibuja 4 * (linea - 1) puntos
         for (int i = 0; i < 4 * (linea - 1); i++) {
            System.out.print(".");
         }
         
         // Dibuja <>
         System.out.print("<>");
         
         // Dibuja 8 - 2 * linea espacios
         for (int i = 0; i < 8 -2 * linea; i++) {
            System.out.print(" ");
         }         
         System.out.println("|");
      }
   }
   
   // Dibujar la parte inferior de la figura
   public static void dibujarParteInferior() {
      for (int linea = 4; linea >= 1; linea--) {
         System.out.print("|");
         // Dibuja 8 - 2 * linea espacios
         for (int i = 0; i < 8 - 2 * linea; i++) {
            System.out.print(" ");
         }
         
         // Dibuja <>
         System.out.print("<>");
         
         // Dibuja 4 * (linea - 1) puntos
         for (int i = 0; i < 4 * (linea - 1); i++) {
            System.out.print(".");
         }
         
         // Dibuja <>
         System.out.print("<>");
         
         // Dibuja 8 - 2 * linea espacios
         for (int i = 0; i < 8 - 2 * linea; i++) {
            System.out.print(" ");
         }         
         System.out.println("|");
      }
   }   
}