/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/XXXX
  Modulo:   Programación.
  UD:       UD3 Estructuras de control.
  Tarea:    Tarea Evaluación 03. Realiza un programa en Java.
  
  Descripción del programa:   Programa para adivinar un número generado al azar entre 1 MAX_NUM
                              Se puede jugar todas las veces que se quiera
  
  Enlace autoevaluación: 
                                
*******************************************************************************************************************/
import java.util.*;

public class Adivina1 {

   // Constante. Hay que usarla siempre que queramos utilizar el valor 100
   public static final int MAX_NUM = 100;
   
   /*
      Método principal: Juega una partida y luego con un bucle while la vuelve a repetir
      mientras se quiera seguir. Cálcula las estadísticas.
      La partida siempre se juega al menos una vez, ¿podría mejorarse con un do-while?
   */
   public static void main(String[] args) {
   
      Scanner leerTeclado = new Scanner(System.in);
      
      presentacion();
      
      // Jugamos una partida y obtenemos los intentos que se han necesitado en ella
      int intentos = jugarPartida(leerTeclado);
      
      // Inicializamos las variables con las que vamos a calcular las estadísticas
      // Con el resultado de la primera partida
      int numPartidas = 1;
      int totalIntentos = intentos;
      int mejorPartida = intentos;
      
      // Preguntamos si se quiere continuar
      // Pasamos la respuesta a mayúsculas para preocuparnos solo de ellas
      System.out.print("¿Quieres jugar otra vez (S/N)? ");
      String seguir = leerTeclado.next();
      seguir = seguir.toUpperCase();
      
      // Repetimos la partida mientras se responda algo que empiece por "S"
      // Mejor usar starsWith que charAt(0) o substring(0, 1)
      while (seguir.startsWith("S")) {
      
         intentos = jugarPartida(leerTeclado);
         
         // Se actualizan las estadísticas con el resultado de la partida
         numPartidas = numPartidas + 1;
         totalIntentos = totalIntentos + intentos;
         
         // Para obtener la mejor partida comparamos los intentos obtenido
         // con los que tenemos almacenados como mejor partida
         // Si es menor, actualizamos el valor de la mejor partida
         // Podemos usar también Math.min
         if (intentos < mejorPartida) {
            mejorPartida = intentos;
         }
         
         // Preguntamos si queremos jugar otra vez
         // Si no preguntamos el bucle no acabaría
         System.out.print("¿Quieres jugar otra vez (S/N)? ");
         seguir = leerTeclado.next().toUpperCase();
      }
      
      mostrarEstadisticas(numPartidas, totalIntentos, mejorPartida);
   }
   
   /*
      Presentación del programa
      No necesita parámetros y no devuelve ningún valor
   */
   public static void presentacion() {
      System.out.println("El programa genera un número aleatorio del 1 al " + MAX_NUM);
      System.out.println("El usario o usuaria debe adivinarlo");
      System.out.println("El programa le dará pistas cada vez que falle");
      System.out.println();
   }
   
   /*
      Juega una partida: genera un número al azar y pide al usuario o usuaria
      que lo adivine. Da pistas, dice si el número a adivinar es mayor o menor
      Parámetros:
         Scanner leerTeclado para leer datos por teclado
      Return: un entero con el número de intentos que se han necesitado
   */
   public static int jugarPartida(Scanner leerTeclado) {
      
      // Generamos el número a adivinar
      Random numAleatorio = new Random();
      int numAdivinar = numAleatorio.nextInt(MAX_NUM) + 1;

      System.out.println("Adivina un número del 1 al " + MAX_NUM);
      
      //System.out.println("El número es " + numAdivinar);     // Comentar o borrar las líneas de ayuda
      
      // Inicializa el contador
      int intentos = 0;
      
      // Creamos la variable fuera para que el do-while la pueda comprobar.
      int num;
      
      // Se repite mientras no se adivine
      do {
      
         // Pide un número
         System.out.print("Adivina el número: ");
         num = leerTeclado.nextInt();
         
         // Comprobamos si es mayor o menor y damos la pista       
         if (num > numAdivinar) {
            System.out.println("El número es menor.");          
         } else if (num < numAdivinar) {
            System.out.println("El número es mayor.");
         }
         
         // Contamos el intento
         intentos++;       
           
      } while (num != numAdivinar);
      
      // Se ha adivinado el número
      System.out.println("Has adivinado en " + intentos + " intentos.");
      return intentos;
   }
   
   /*
      Muestra los resultados de las partidas
      Parámetros:
         int numPartidas: número de partidas jugadas
         int numIntentos: número de intentos que se han necesitados
         int mejorPartida: número de intentos de la mejor partida
      No devuelve ningún valor         
   */
   public static void mostrarEstadisticas(int numPartidas, int numIntentos, int mejorPartida) {
   
      System.out.println();
      System.out.println("Resultados del juego:");
      System.out.println("Partidas jugadas: " + numPartidas);
      System.out.println("Intentos realizados: " + numIntentos);
      
      // Si dividimos 2 enteros el resultado es un entero
      // Hay que utilizar el casting para convertir uno de los números a double
      System.out.printf("Intentos por partida: %.1f\n", (double) numIntentos / numPartidas);
      System.out.println("Mejor partida: " + mejorPartida);
   }
}