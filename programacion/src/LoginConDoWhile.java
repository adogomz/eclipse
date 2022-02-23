//  Si quisieramos tener un numero de intentos USAREMOS EL ALGORITMO ACUMULADOR


import java.util.*;

public class LoginConDoWhile {
   public static void main(String[] args) {
      Scanner leerTeclado = new Scanner(System.in);     
      String clave = "PROG2018";
      String password;
      
      int cont = 0; // contador que va llevar la cuenta de los intentos
      do { 
         System.out.println("Clave incorrecta");
         System.out.print("Introduce password; ");  //Primero hago el bucle no compruebo nada pido la contraseña y mientras sea diferente volvera a pedirla hasta
         password = leerTeclado.nextLine();           // que pongamos bien la contraseña
         cont++;                                      // llevara la cuenta.
      } while ( cont < 3 && !password.equals(clave)); // MIENTRAS NO LLEGUE A LOS TRES INTENTOS Y LA CONTRASEÑA SEA INCORRECTA NO FINALIZA   
            
      if (password.equals(clave)) {
          System.out.println("Ya estás dentro");
      } else {
         System.out.println("Intentos agotados");
      }       
   }
}
// EN LOS CASOS ESPECIALES EN LOS QUE EL BUCLE SE EJECUTE SIEMPRE AL MENOS UNA VEZ, PODEMOS SUSTITUIR EL WHILE POR UN DO WHILE EN EL QUE EL DO SE PONE DELANTE  Y EL WHILE DESPUES.

