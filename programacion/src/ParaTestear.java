// Adolfo Gomez Losada DAM ULHI TAREA 2 PROG 03
// Programa que adivina un numero al azar del 1 al 100 y va dando pistas si es mayor o menor.
// Enlace archivo de evaluacion

// importamos todo lo que tenemos dentro de java.util
import java.util.*;

public class ParaTestear {
   public static Scanner entrada = new Scanner(System.in);
   public static void main(String[] args) {
   
   introduccion();
   jugarPartida();
   nuevaPartida();
     
   }
   
   public static void introduccion(){
     System.out.println("El programa genera un número aleatorio del 1 al 100");
     System.out.println("El usuario o usuaria debe adivinarlo");
     System.out.println("El programa le dará pistas cada vez que falle.");
     System.out.println();
   }
   
   
   public static void jugarPartida() {
   // Obtenemos el valor aleatorio entre el 1 y el 100
		int numero=(int)(Math.random()*100);
 
		System.out.println("Indica un numero entre el 0 y el 100");
      
      int entrada=-1;
		int contador=0;
      int partida=0;
      
 
		// bucle hasta que el usuario adivine el numero
		do {
         // Obtenemos un nuevo valor
			entrada=obtenerValor();
			if(entrada>numero) {
				System.out.println("El numero es menor");
			}else if(entrada<numero) {
				System.out.println("El numero es mayor");
			}
			contador++;
         
		} while(entrada!=numero);
      System.out.println();
      System.out.println("Adivina un numero del 1 al 100");
      System.out.println("Adivina el número: " + numero);
		System.out.println("Has avariguado el numero en " + contador + " intentos.");
      System.out.println();
	   }
      
      public static int obtenerValor() {
		int valor=0;
 
		// Iniciamos un bucle infinito
		while(true){
			try {
				System.out.print("Indica el numero: ");
				valor=entrada.nextInt();
 
				// revisamos que el valor introducido este comprendido entre el 0 y el 100
				if(valor<0 || valor>100) {
					System.out.println("El numero tiene que estar entre el 0 y el 100");
				}else{
					// salimos del bucle
					break;
				}
			}catch(InputMismatchException e) {
				// Controlamos que siempre introduzca un valor numerico
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
		return valor;
	}
   
   // crear el bucle while para que pida una otra partida y reconozca si S o SI
   public static void nuevaPartida() {
       int partida = 1;
       String respuesta1 = "S";
       String respuesta2 = "Si";
       String respuesta3 = "SIEMPRE";
       String respuesta4 = "seguro";
       System.out.println("");
       System.out.println(" Quieres jugar otra partida S / N ");
       String respuesta = entrada.next();
       
       
       if (respuesta.equalsIgnoreCase(respuesta1) == true || 
           respuesta.equalsIgnoreCase(respuesta2) == true || 
           respuesta.equalsIgnoreCase(respuesta3) == true || 
           respuesta.equalsIgnoreCase(respuesta4) == true) { 
              jugarPartida();
              nuevaPartida();
              
              }else{
              System.out.println("Resultados del juego:");
              System.out.println("Partidas jugadas: " + partida);
              System.out.println("Intentos por partidas: " );
              System.out.println("Mejor Partida: ");
              }
              
       }
}



