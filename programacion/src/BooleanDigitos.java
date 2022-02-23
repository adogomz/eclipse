// Programa que utiliza booleanos como return de un m�todo

import java.util.*;

public class BooleanDigitos {
   public static void main(String[] args) {
      if(tieneDigito(12034, 3)) {
         System.out.println("Tiene el d�gito");
      } else {
         System.out.println("No lo tiene.");
      }
   }
   
   // Comprueba si uno de los d�gitos del n�mero es el indicado.
   //
   // int num - n�mero
   // int digito - d�gito que hay que buscar
   // return true si el d�gito existe false en caso contrario
   public static boolean tieneDigito(int num, int digito) {
      // Recorre todos los d�gitos
      int siguienteDigito;
      while(num > 0) {
         siguienteDigito = num % 10;   // Obtiene el �ltimo d�gito
         if(siguienteDigito == digito) {
            return true;
         }
         //System.out.println("N�mero: " + num + " D�gito: " + siguienteDigito);
         num = num / 10;   // Elimina el �ltimo d�gito para seguir buscando
      }
      return false;
   }
}