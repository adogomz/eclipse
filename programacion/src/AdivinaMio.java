
//cabecera
import java.util.*;

//meter ne variables los maximos??
//intentos partida y jugadas??


public class AdivinaMio {
  public static void  main(String[] args){
      
      // inicio el Scanner para la entrada de datos y genero el numero a divinar
      Scanner entrada = new Scanner(System.in);
      info();
      
  }//fin del main
  
  // metodo info sobre que va hacer el programa
  public static void info(){
     System.out.println("El programa genera un número aleatorio del 1 al 100"); 
     System.out.println("El usuario o usuaria debe adivinarlo"); 
     System.out.println("El programa le dará pistas cada vez que falle");
     System.out.println();
  }
  // inicio la partida, creo el metodo random para el numero adivinar con el limite 100 +1 ( 0 - 100 )
  // con un bucle do while voy dando las pistas si el numero es mayor o menor
  public static void partida(Scanner entrada) {
	  Random aleatorio = new Random();
	  int numero = aleatorio.nextInt(100)+1;
	  System.out.println("Adivina un número del 1 al 100");
	  System.out.println(numero);
  }
  
  
  
} // fin del progroma