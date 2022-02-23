// ESTA LA USAREMOS PARA PROBAR LOS PROGRAMAS DE LOS EJERCICIOS O TAREAS
import java.util.*;

public class ProbarTareas {
   public static void main(String[] args) {
   // MAIN
metodo(5, 5);


}
 public static int metodo(int a, int b) {
      while (a != 0 && b != 0) {
         if (a < b) {
            b -= a;
         } else {
            a -= b;
         }
      }
      return a + b;
   }           
   
   }
            
                       

    
    
    

   