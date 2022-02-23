// Login sencillo en base a una contraseña

import java.util.*;

public class Login {
   public static void main(String[] args) {
      Scanner leerTeclado = new Scanner(System.in);     
      System.out.print("Introduce password: ");
      String entrada = leerTeclado.next();
      String password = "=PROG2018";
      if (entrada.equals(password)) {
         System.out.println("Adelante!");
      } else {
         System.out.println("Intentalo otra vez");
      }

   }
}
