/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/2019
  Modulo:   Programaci�n.
  UD:       UD3 Estructuras de control.
  Tarea:    Tarea Evaluaci�n 01. Realiza un programa en Java.
  
  Descripci�n del programa:   Calcula la nota final de un estudiante a partir de sus calificaciones
                              en el examen parcial, en el examen final y en las tareas del curso
  
  Enlace autoevaluaci�n: 
                                
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
      M�todo principal: calcula la calificaci�n final de un alumno o alumna
      y muestra en qu� escala est�
      Podr�a hacerse para varios y comparar sus resultados
   */
   public static void main(String[] args) {
   
      Scanner leerTeclado = new Scanner(System.in);
      
      presentacion();
          
      double alumna1 = calcularNota(leerTeclado);
      
      obtenerEscala(alumna1);
      
      
      double alumna2 = calcularNota(leerTeclado);
      if (alumna1 > alumna2) {
         System.out.println("La calificaci�n del primer estudiante es m�s alta");
      }
      
      
   }
   
   /*
      M�todo presentacion: Explica lo que hace el programa
      No tiene par�metros y no devuelve ning�n valor
   */
   public static void presentacion() {
      System.out.println("Este programa lee las calificaciones de ex�menes y tareas");
      System.out.println("y calcula la nota final del m�dulo.");
      System.out.println("Tambi�n podr�a hacerlo para 2 estudiantes y comparar sus notas. Funcionar�a sin problemas.");
      System.out.println();
   }
   
   /*
      M�todo que calcula la calificaci�n final de un estudiante
      Usar� un m�todo para calcular cada una de las notas
      Par�metros: Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada
   */
   public static double calcularNota(Scanner leerTeclado) {
      
      // Utiliza un entero para distinguir entre el parcial y el final
      // Se podr�a pasar directamente el String
      double examenParcial = examen(PARCIAL, leerTeclado);     
      double examenFinal = examen(FINAL, leerTeclado);
      double notaTareas = tareas(leerTeclado);
      
      double nota = examenParcial + examenFinal + notaTareas;     
      System.out.printf("La calificaci�n total obtenida es: %.1f\n", nota);
      
      return nota;
   }
   
   /*
      Calcula la aportaci�n de un examen, parcial o final, a la nota final
      Par�metros:
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
      // Se podr�a crear un m�todo para leer todos los datos enteros
      System.out.print("Introduce el peso del examen (0-" + MAX_PESO + "): ");
      int peso = leerDatos.nextInt();      
      System.out.print("Introduce la calificaci�n del examen (0-" + MAX_EXAMEN + "): ");
      int nota = leerDatos.nextInt();
      
      // Lee si ha obtenido puntos extra. En caso afirmativo,
      // lee los puntos y controla que la calificaci�n no sea mayor que MAX_EXAMEN
      System.out.print("�Has obtenido puntos extra (1=Si, 2=No)? ");
      int extra = leerDatos.nextInt();
      if (extra == 1) {
         System.out.print("Introduce el total de puntos extra: ");
         int puntosExtra = leerDatos.nextInt();
         
         // Calcula y controla los puntos extra m�ximos
         // Este if se podr�a sustituir por
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
      M�todo que calcula la nota final ponderada del parcial, del final y de las tareas
      Par�metros:
         int nota: valor de la calificaci�n obtenida
         int peso: peso de la calificaci�n en la nota final total
         int notaMax: valor de la calificaci�n m�xima que se pod�a obtener
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
      Calcula la aportaci�n de las tareas a la nota final
      Par�metros:
         Scanner leerTeclado para leer valores introducidos por teclado
      return: valor de tipo double con la nota final ponderada de las tareas
   */
   public static double tareas (Scanner leerTeclado) {
      System.out.println("Tareas: ");
      
      // Casi igual a lo que aparece en el m�todo examen: m�todo para evitar redundancias
      System.out.print("Introduce el peso de las tareas (0-" + MAX_PESO + "): ");
      int peso = leerTeclado.nextInt();

      // Lee el n�mero de tareas y utiliza el algoritmo acumulador
      // para calcular la nota obtenida total y la nota m�xima total
      System.out.print("Introduce el n�mero de tareas: ");
      int tareas = leerTeclado.nextInt();
      int nota = 0;
      int notaMaxima = 0;
      for (int i = 1; i <= tareas; i++) {
         // Introduce los 2 valores seguidos y separados por un espacio. Con Scanner se leen igual
         System.out.print("Tarea " + i + ": Introduce la puntuaci�n obtenida y la puntuaci�n m�xima: ");
         nota += leerTeclado.nextInt();
         notaMaxima += leerTeclado.nextInt();
      }
      
      // Lee el n�mero de presenciales, calcula su nota y controla que no sea mayor que MAX_PRESENCIALES
      System.out.print("Introduce el n�mero de presenciales a las que has atendido: ");
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
      Par�metros:
         int nota: valor de la nota final total
      No devuelve nada
   */
   public static void obtenerEscala(double nota) {
          
      // Estar�a m�s elegante con 2 �nicos println al final y fuera de los if
      if (nota >= 85) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 3.0);
         System.out.println("Excelente trabajo");
      } else if (nota >= 75) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 2.0);
         System.out.println("Gran trabajo");
      } else if (nota >= 60) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.7);
         System.out.println("Todav�a tienes trabajo por hacer");
      } else {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.0);
         System.out.println("Otra vez ser�");
      }
   }
}