/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/2019
  Modulo:   Programación.
  UD:       UD3 Estructuras de control.
  Tarea:    Tarea Evaluación 01. Realiza un programa en Java.
  
  Descripción del programa:   Calcula la nota final de un estudiante a partir de sus calificaciones
                              en el examen parcial, en el examen final y en las tareas del curso
  
  Enlace autoevaluación: 
                                
*******************************************************************************************************************/
import java.util.*;

public class Evaluacion3 {
   
   // Constantes que se van a utilizar
   public static final int MAX_EXAMEN = 100;
   public static final int MAX_PESO = 100;
   public static final int MAX_PRESENCIALES = 30;
   
   /*
      Método principal: calcula la calificación final de un alumno o alumna
      y muestra en qué escala está
      Podría hacerse para varios y comparar sus resultados
   */
   public static void main(String[] args) {
   
      Scanner leerTeclado = new Scanner(System.in);
      
      presentacion();
          
      double alumna1 = calcularNota(leerTeclado);
      
      obtenerEscala(alumna1);
      
      
      double alumna2 = calcularNota(leerTeclado);
      if (alumna1 > alumna2) {
         System.out.println("La calificación del primer estudiante es más alta");
      }
      
   }
   
   /*
      Método presentacion: Explica lo que hace el programa
      No tiene parámetros y no devuelve ningún valor
   */
   public static void presentacion() {
      System.out.println("Este programa lee las calificaciones de exámenes y tareas");
      System.out.println("y calcula la nota final del módulo.");
      System.out.println("También podría hacerlo para 2 estudiantes y comparar sus notas. Funcionaría sin problemas.");
      System.out.println();
   }
   
   /*
      Método que calcula la calificación final de un estudiante
      Parámetros: Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada
   */
   public static double calcularNota(Scanner leerTeclado) {
        
      double nota = examen("Parcial", leerTeclado) + examen("Final", leerTeclado) + tareas(leerTeclado);
      
      // Se utiliza printf para formatear la salida y redondear los resultados       
      System.out.printf("La calificación total obtenida es: %.1f\n", nota);
      
      return nota;
   }
   
   /*
      Calcula la aportación de un examen, parcial o final, a la nota final
      Parámetros:
         Scanner leerDatos para leer valores introducidos por teclado
         String periodo para distinguir si el examen es parcial o final
      return: valor de tipo double con la nota final ponderada del examen
   */
   public static double examen(String periodo, Scanner leerDatos) {
   
      System.out.println(periodo + ": ");
      
      // Usamos el mismo método para leer todos los enteros
      // Le pasamos el mensaje con el que queremos pedir el dato como parámetro
      int peso = leeEntero(leerDatos, "Introduce el peso del examen (0-" + MAX_PESO + "): ");
      int nota = leeEntero(leerDatos, "Introduce la calificación del examen (0-" + MAX_EXAMEN + "): ");
      int extra = leeEntero(leerDatos, "¿Has obtenido puntos extra (1=Si, 2=No)? ");
      
      // Si hay puntos extra los lee y controla que la nota final no sea mayor que MAX_EXAMEN
      // Se leen y controlan los puntos extra solo si existen. if dentro de otro if
      if(extra == 1) {
         int puntosExtra = leeEntero(leerDatos, "Introduce el total de puntos extra: ");
         
         // Si la nota es mayor que MAX_EXAMEN nos quedamos con este último valor
         nota = Math.min(nota + puntosExtra, MAX_EXAMEN);
      }
      
      double notaPonderada = calcularNota(nota, peso, MAX_EXAMEN);
      
      return notaPonderada;
   }
   
   /*
      Calcula la aportación de las tareas a la nota final
      Parámetros:
         Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada de las tareas
   */
   public static double tareas (Scanner leerTeclado) {
   
      System.out.println("Tareas: ");
      
      int peso = leeEntero(leerTeclado, "Introduce el peso de las tareas (0-" + MAX_PESO + "): ");
      int tareas = leeEntero(leerTeclado, "Introduce el número de tareas: ");
      
      int nota = 0;
      int notaMaxima = 0;
      for (int i = 1; i <= tareas; i++) {
         // Introduce los 2 valores seguidos y separados por un espacio. Con Scanner se leen igual
         System.out.print("Tarea " + i + ": Introduce la puntuación obtenida y la puntuación máxima: ");
         nota += leerTeclado.nextInt();
         notaMaxima += leerTeclado.nextInt();
      }
      
      int presenciales = leeEntero(leerTeclado, "Introduce el número de presenciales a las que has atendido: ");
      int notaPresenciales = presenciales * 5;
      
      // Controla que la nota de las presenciales no sea mayor que MAX_PRESENCIALES
      notaPresenciales = Math.min(notaPresenciales, MAX_PRESENCIALES);     
      System.out.println("Nota de las presenciales = " + notaPresenciales + " / " + MAX_PRESENCIALES);
           
      double notaPonderada = calcularNota(nota + notaPresenciales, peso, notaMaxima + MAX_PRESENCIALES);
      
      return notaPonderada;
   }

   /*
      Método que pide un dato entero mostrando el mensaje pasado y lo lee como int
      Parámetros:
         Scanner leerDatos para leer valores introducidos por teclado
         String mensaje con el que se quiere pedir el dato
      return: valor de tipo double con la nota final ponderada del examen
   */   
   public static int leeEntero(Scanner leerDatos, String mensaje) {
      System.out.print(mensaje);
      int entero = leerDatos.nextInt();
      return entero;
   }
   
   /*
      Método que calcula la nota final ponderada del parcial, del final y de las tareas
      Parámetros:
         int nota: valor de la calificación obtenida
         int peso: peso de la calificación en la nota final total
         int notaMax: valor de la calificación máxima que se podía obtener
      return: valor de tipo double con el resultado de la nota ponderada
   */
   public static double calcularNota(int nota, int peso, int notaMax) { 
      double notaPonderada = (double) nota * peso / notaMax;     
      System.out.println("Nota final = " + nota + " / " + notaMax);     
      System.out.printf("Nota final ponderada = %.1f / %d\n", notaPonderada, peso);
      System.out.println();
      return notaPonderada;
   }
   
   /*
      Pasa la nota final a una escala del 0 al 4 y muestra el mensaje correspondiente
      Parámetros:
         int nota: valor de la nota final total
      No devuelve nada
   */
   public static void obtenerEscala(double nota) {
      double escala = 0;
      String mensaje = "";
      
      if (nota >= 85) {
         escala = 3.0;
         mensaje = "Excelente trabajo";
      } else if (nota >= 75) {   // Aquí llegan las notas menores de 85. Solo hay que mirar que sean mayores de 75
         escala = 2.0;
         mensaje = "Gran trabajo";
      } else if (nota >= 60) {
         escala = 0.7;
         mensaje = "Todavía tienes trabajo por hacer";
      } else {
         escala = 0.0;
         mensaje = "Otra vez será";
      }
      
      System.out.println("La nota final en una escala del 0 al 4 es al menos: " + escala);
      System.out.println(mensaje);
   }
   
} // Final de la clase