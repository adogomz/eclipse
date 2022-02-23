/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/XXXX
  Modulo:   Programaci�n.
  UD:       UD3 Estructuras de control.
  Tarea:    Tarea Evaluaci�n 03. Realiza un programa en Java.
  
  Descripci�n del programa:   Programa para adivinar un n�mero generado al azar entre 1 MAX_NUM
                              Se puede jugar todas las veces que se quiera
  
  Enlace autoevaluaci�n: 
                                
*******************************************************************************************************************/
import java.util.*;

public class Adivina1 {

   // Constante. Hay que usarla siempre que queramos utilizar el valor 100
   public static final int MAX_NUM = 100;
   
   /*
      M�todo principal: Juega una partida y luego con un bucle while la vuelve a repetir
      mientras se quiera seguir. C�lcula las estad�sticas.
      La partida siempre se juega al menos una vez, �podr�a mejorarse con un do-while?
   */
   public static void main(String[] args) {
   
      Scanner leerTeclado = new Scanner(System.in);
      
      presentacion();
      
      // Jugamos una partida y obtenemos los intentos que se han necesitado en ella
      int intentos = jugarPartida(leerTeclado);
      
      // Inicializamos las variables con las que vamos a calcular las estad�sticas
      // Con el resultado de la primera partida
      int numPartidas = 1;
      int totalIntentos = intentos;
      int mejorPartida = intentos;
      
      // Preguntamos si se quiere continuar
      // Pasamos la respuesta a may�sculas para preocuparnos solo de ellas
      System.out.print("�Quieres jugar otra vez (S/N)? ");
      String seguir = leerTeclado.next();
      seguir = seguir.toUpperCase();
      
      // Repetimos la partida mientras se responda algo que empiece por "S"
      // Mejor usar starsWith que charAt(0) o substring(0, 1)
      while (seguir.startsWith("S")) {
      
         intentos = jugarPartida(leerTeclado);
         
         // Se actualizan las estad�sticas con el resultado de la partida
         numPartidas = numPartidas + 1;
         totalIntentos = totalIntentos + intentos;
         
         // Para obtener la mejor partida comparamos los intentos obtenido
         // con los que tenemos almacenados como mejor partida
         // Si es menor, actualizamos el valor de la mejor partida
         // Podemos usar tambi�n Math.min
         if (intentos < mejorPartida) {
            mejorPartida = intentos;
         }
         
         // Preguntamos si queremos jugar otra vez
         // Si no preguntamos el bucle no acabar�a
         System.out.print("�Quieres jugar otra vez (S/N)? ");
         seguir = leerTeclado.next().toUpperCase();
      }
      
      mostrarEstadisticas(numPartidas, totalIntentos, mejorPartida);
   }
   
   /*
      Presentaci�n del programa
      No necesita par�metros y no devuelve ning�n valor
   */
   public static void presentacion() {
      System.out.println("El programa genera un n�mero aleatorio del 1 al " + MAX_NUM);
      System.out.println("El usario o usuaria debe adivinarlo");
      System.out.println("El programa le dar� pistas cada vez que falle");
      System.out.println();
   }
   
   /*
      Juega una partida: genera un n�mero al azar y pide al usuario o usuaria
      que lo adivine. Da pistas, dice si el n�mero a adivinar es mayor o menor
      Par�metros:
         Scanner leerTeclado para leer datos por teclado
      Return: un entero con el n�mero de intentos que se han necesitado
   */
   public static int jugarPartida(Scanner leerTeclado) {
      
      // Generamos el n�mero a adivinar
      Random numAleatorio = new Random();
      int numAdivinar = numAleatorio.nextInt(MAX_NUM) + 1;

      System.out.println("Adivina un n�mero del 1 al " + MAX_NUM);
      
      //System.out.println("El n�mero es " + numAdivinar);     // Comentar o borrar las l�neas de ayuda
      
      // Inicializa el contador
      int intentos = 0;
      
      // Creamos la variable fuera para que el do-while la pueda comprobar.
      int num;
      
      // Se repite mientras no se adivine
      do {
      
         // Pide un n�mero
         System.out.print("Adivina el n�mero: ");
         num = leerTeclado.nextInt();
         
         // Comprobamos si es mayor o menor y damos la pista       
         if (num > numAdivinar) {
            System.out.println("El n�mero es menor.");          
         } else if (num < numAdivinar) {
            System.out.println("El n�mero es mayor.");
         }
         
         // Contamos el intento
         intentos++;       
           
      } while (num != numAdivinar);
      
      // Se ha adivinado el n�mero
      System.out.println("Has adivinado en " + intentos + " intentos.");
      return intentos;
   }
   
   /*
      Muestra los resultados de las partidas
      Par�metros:
         int numPartidas: n�mero de partidas jugadas
         int numIntentos: n�mero de intentos que se han necesitados
         int mejorPartida: n�mero de intentos de la mejor partida
      No devuelve ning�n valor         
   */
   public static void mostrarEstadisticas(int numPartidas, int numIntentos, int mejorPartida) {
   
      System.out.println();
      System.out.println("Resultados del juego:");
      System.out.println("Partidas jugadas: " + numPartidas);
      System.out.println("Intentos realizados: " + numIntentos);
      
      // Si dividimos 2 enteros el resultado es un entero
      // Hay que utilizar el casting para convertir uno de los n�meros a double
      System.out.printf("Intentos por partida: %.1f\n", (double) numIntentos / numPartidas);
      System.out.println("Mejor partida: " + mejorPartida);
   }
}