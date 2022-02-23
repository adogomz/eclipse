/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/XXXX
  Modulo:   Programacion.
  UD:       UD3 Estructuras de control.
  Tarea:    Tarea Evaluacion 03. Realiza un programa en Java.
  
  Descripcion del programa:   Programa para adivinar un numero generado al azar entre 1 MAX_NUM
                               Se puede jugar todas las veces que se quiera
  
  Enlace autoevaluacion: 
                                
*******************************************************************************************************************/
import java.util.*;

public class Adivina3 {
   
   // Constante. Hay que usarla siempre que queramos utilizar el valor 100
   public static final int MAX_NUM = 100;
   
   /*
      Metodo principal: Usa un do-while para repetir las jugadas y realiza los calculos de las estadisticas.
   */
   public static void main(String[] args) {
   
      Scanner leerTeclado = new Scanner(System.in);
      presentacion();
      
      // Inicializamos las variables con las que vamos a calcular las estaditicas    
      // Utilizamos el valor 1000000 para inicializar la variable mejorPartida
      // y asitener un valor con el que comparar la primera partida
      int numPartidas = 0, numIntentos = 0, mejorPartida = 1000000;
      
      do {
      
         // Jugamos la partida
         int resultado = jugarPartida(leerTeclado);
         
         // Actualizamos las estadisticas
         numPartidas++;
         numIntentos += resultado;
         mejorPartida = Math.min(mejorPartida, resultado);
         
      } while (jugarOtraVez(leerTeclado));
      
      mostrarEstadisticas(numPartidas, numIntentos, mejorPartida);
   }
   
   /*
      Presentacion del programa
      No necesita parametros y no devuelve ningun valor
   */
   public static void presentacion() {
      System.out.println("El programa genera un numero aleatorio del 1 al " + MAX_NUM);
      System.out.println("El usario o usuaria debe adivinarlo");
      System.out.println("El programa le dar las pistas cada vez que falle");
      System.out.println();
   }

   /*
      Comprueba si quiere seguir jugando
      Parametros:
         Scanner leerTeclado: objeto para leer datos por teclado
      Devuelve true si quiere seguir jugando, false en caso contrario
   */
   
   public static boolean jugarOtraVez(Scanner leerTeclado) {
      System.out.print("¿Quieres jugar otra vez (S/N)? ");
      String jugar = leerTeclado.next().toUpperCase();
      return jugar.startsWith("S");
   }

   /*
      Muestra los resultados de las partidas
      Parametros:
         int numPartidas: numero de partidas jugadas
         int numIntentos: numero de intentos que se han necesitados
         int mejorPartida: numero de intentos de la mejor partida
      No devuelve ningun valor         
   */
   public static void mostrarEstadisticas(int numPartidas, int numIntentos, int mejorPartida) {
      System.out.println();
      System.out.println("Resultados del juego:");
      System.out.println("Partidas jugadas: " + numPartidas);
      System.out.println("Intentos realizados: " + numIntentos);
      
      // Si dividimos 2 enteros el resultado es un entero
      // Hay que utilizar el casting para convertir uno de los numeros a double
      System.out.printf("Intentos por partida: %.1f\n", (double) numIntentos / numPartidas);
      System.out.println("Mejor partida: " + mejorPartida);
   }
   
   /*
      Juega una partida: genera un numero al azar y pide al usuario o usuaria
      que lo adivine. Da pistas, dice si el numero a adivinar es mayor o menor
      Parametros:
         Scanner leerTeclado para leer datos por teclado
      Return: un entero con el numero de intentos que se han necesitado
   */
   public static int jugarPartida(Scanner leerTeclado) {
      
      // Generamos el numero a adivinar
      Random numAleatorio = new Random();
      int numAdivinar = numAleatorio.nextInt(MAX_NUM) + 1;
      
      System.out.println("Adivina un numero del 1 al " + MAX_NUM);
      
      //System.out.println("El numero es " + numAdivinar);
      
      // Inicializa el contador
      int intentos = 0;
      
      // Creamos la variable fuera para que el do-while la pueda comprobar.
      int num;
      
      do {
      
         // Pide un numero
         System.out.print("Adivina el numero: ");
         num = leerTeclado.nextInt();
         
         // Contamos el intento
         intentos++;

      } while (!adivina(num, numAdivinar));
      
      System.out.println("Has adivinado en " + intentos + " intentos.");
      return intentos;
   }

   /*
      Comprueba si se ha adivinado el numero y si no da pistas
      Dice si el numero a adivinar es mayor o menor
      Parametros:
         int num: numero introducido
         int numAdivinar: numero que hay que adivinar
         int intentos: intentos que se han necesitados
      Return: true si adivina el numero, false en caso contrario
   */   
   public static boolean adivina(int num, int numAdivinar) {
   
      // Si los numeros son iguales devuelve true y el bucle acaba
      // En caso contrario da pistas
      
      if (num == numAdivinar) {
         return true;
      } else if (num > numAdivinar) {
         System.out.println("El numero es menor.");
         return false;         
      }
      System.out.println("El numero es mayor.");
      return false;
   }
}