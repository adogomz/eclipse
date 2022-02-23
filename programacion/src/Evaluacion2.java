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
public class Evaluacion2 {

   // Constantes que se van a utilizar
   public static final int MAX_EXAMEN = 100;
   public static final int MAX_PESO = 100;
   public static final int MAX_PRESENCIALES = 30;
   public static final int PARCIAL = 0;
   public static final int FINAL = 1;
   
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
      Usará un método para calcular cada una de las notas
      Parámetros: Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada
   */
   public static double calcularNota(Scanner leerTeclado) {
      
      // Utiliza un entero para distinguir entre el parcial y el final
      // Se podría pasar directamente el String
      double examenParcial = examen(PARCIAL, leerTeclado);     
      double examenFinal = examen(FINAL, leerTeclado);
      double notaTareas = tareas(leerTeclado);
      
      double nota = examenParcial + examenFinal + notaTareas;     
      System.out.printf("La calificación total obtenida es: %.1f\n", nota);
      
      return nota;
   }
   
   /*
      Calcula la aportación de un examen, parcial o final, a la nota final
      Parámetros:
         Scanner leerDatos para leer valores introducidos por teclado
         int para distinguir si el examen es parcial (PARCIAL) o final (FINAL)
      return: valor de tipo double con la nota final ponderada del examen
   */
   public static double examen(int tipoExamen, Scanner leerDatos) {
   
      // Utiliza un entero para distinguir entre el parcial y el final
      if (tipoExamen == PARCIAL) {
         System.out.println("Parcial :");
      } else {
         System.out.println("Final :");
      }
      
      // Lee el peso y la nota obtenida en el examen
      // Se podría crear un método para leer todos los datos enteros
      System.out.print("Introduce el peso del examen (0-" + MAX_PESO + "): ");
      int peso = leerDatos.nextInt();      
      System.out.print("Introduce la calificación del examen (0-" + MAX_EXAMEN + "): ");
      int nota = leerDatos.nextInt();
      
      // Lee si ha obtenido puntos extra. En caso afirmativo,
      // lee los puntos y controla que la calificación no sea mayor que MAX_EXAMEN
      System.out.print("¿Has obtenido puntos extra (1=Si, 2=No)? ");
      int extra = leerDatos.nextInt();
      if (extra == 1) {
         System.out.print("Introduce el total de puntos extra: ");
         int puntosExtra = leerDatos.nextInt();
         
         // Calcula y controla los puntos extra máximos
         // Este if se podría sustituir por
         nota = Math.min(nota, MAX_EXAMEN);
         /*
         if (nota > MAX_EXAMEN) {
            nota = MAX_EXAMEN;
         }
         */
      }
      
      // Calcula la nota ponderada y muestra los resultados por consola
      double notaPonderada = calcularNota(nota, peso, MAX_EXAMEN);
      
      return notaPonderada;
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
      Calcula la aportación de las tareas a la nota final
      Parámetros:
         Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada de las tareas
   */
   public static double tareas (Scanner leerTeclado) {
      System.out.println("Tareas: ");
      
      // Casi igual a lo que aparece en el método examen: método para evitar redundancias
      System.out.print("Introduce el peso de las tareas (0-" + MAX_PESO + "): ");
      int peso = leerTeclado.nextInt();

      // Lee el número de tareas y utiliza el algoritmo acumulador
      // para calcular la nota obtenida total y la nota máxima total
      System.out.print("Introduce el número de tareas: ");
      int tareas = leerTeclado.nextInt();
      int nota = 0;
      int notaMaxima = 0;
      for (int i = 1; i <= tareas; i++) {
         // Introduce los 2 valores seguidos y separados por un espacio. Con Scanner se leen igual
         System.out.print("Tarea " + i + ": Introduce la puntuación obtenida y la puntuación máxima: ");
         nota += leerTeclado.nextInt();
         notaMaxima += leerTeclado.nextInt();
      }
      
      // Lee el número de presenciales, calcula su nota y controla que no sea mayor que MAX_PRESENCIALES
      System.out.print("Introduce el número de presenciales a las que has atendido: ");
      int presenciales = leerTeclado.nextInt();
      int notaPresenciales = presenciales * 5;
      if (notaPresenciales > MAX_PRESENCIALES) {
         notaPresenciales = MAX_PRESENCIALES;
      }   
      System.out.println("Nota de las presenciales = " + notaPresenciales + " / " + MAX_PRESENCIALES);
      
      nota = nota + notaPresenciales;
      notaMaxima = notaMaxima + MAX_PRESENCIALES;
      
      // Calculamos la nota final ponderada y la devolvemos
      return calcularNota(nota, peso, notaMaxima);
   }
   
   /*
      Pasa la nota final a una escala del 0 al 4 y muestra el mensaje correspondiente
      Parámetros:
         int nota: valor de la nota final total
      No devuelve nada
   */
   public static void obtenerEscala(double nota) {
          
      // Estaría más elegante con 2 únicos println al final y fuera de los if
      if (nota >= 85) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 3.0);
         System.out.println("Excelente trabajo");
      } else if (nota >= 75) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 2.0);
         System.out.println("Gran trabajo");
      } else if (nota >= 60) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.7);
         System.out.println("Todavía tienes trabajo por hacer");
      } else {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.0);
         System.out.println("Otra vez será");
      }
   }
}