// Login sencillo en base a una contrase�a

import java.util.*;

public class Logindos {
   public static void main(String[] args) {
      Scanner leerTeclado = new Scanner(System.in);     
      String clave = "PROG2018";
      System.out.print("Introduce passsword: ");
      String password = leerTeclado.nextLine();
      
      while (password.equals(clave) != true) {    //PUEDO QUITAR ESE !=true   si pongo !password 
         System.out.println("Clave incorrecta");
         System.out.println("Introduce password; ");
         password = leerTeclado.nextLine();
      }
      System.out.println("Ya est�s dentro");
   }
}

//Aqui estariamos pidiendo contrase�as hasta que meteriamos la clave correcta
// En este bucle particular de bucle en que siempre la pedimos al vez la contrase�a.

      