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
public class CalcularNotaFinalEvaluacion1 {

   // Constantes que se van a utilizar
    public static final int MAX_EXAMEN = 100;
    public static final int MAX_PESO = 100;
    public static final int MAX_PRESENCIALES = 30;
   
   
  
   
   
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
      
      /*
      double alumna2 = calcularNota(leerTeclado);
      if (alumna1 > alumna2) {
         System.out.println("La calificaci�n del primer estudiante es m�s alta");
      }
      */
      
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
      
      // Se podr�a pensar algo para incluir el println dentro del m�todo examen
      System.out.println("Parcial: ");
      double examenParcial = examen(leerTeclado);
      
      System.out.println("Final: ");
      double examenFinal = examen(leerTeclado);
      
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
   public static double examen(Scanner leerDatos) {
        
      // Lee el peso y la nota obtenida en el examen
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
         nota = nota + puntosExtra;
         if (nota > MAX_EXAMEN) {
            nota = MAX_EXAMEN;
         }
      }
      
      // Calcula la nota ponderada y muestra los resultados por consola
      // Esta parte se repite para las tareas. Se podr�a crear un m�todo
      double notaPonderada = (double) nota * peso / MAX_EXAMEN;
      System.out.println("Nota final = " + nota + " / " + MAX_EXAMEN); 
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
         int laNota = leerTeclado.nextInt();
         int laMaxima = leerTeclado.nextInt();
         nota = nota + laNota;
         notaMaxima = notaMaxima + laMaxima;
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
      
      // Mismos c�lculos, printf y println que en el m�todo examen: m�todo para evitar redundancias
      System.out.println("Nota final = " + nota + " / " + notaMaxima);     
      double notaPonderada = (double) nota * peso / notaMaxima;
      System.out.printf("Nota final ponderada = %.1f / %d\n", notaPonderada, peso);
      System.out.println();
      
      return notaPonderada;
   }
   
   /*
      Pasa la nota final a una escala del 0 al 4 y muestra el mensaje correspondiente
      Par�metros:
         int nota: valor de la nota final total
      No devuelve nada
   */
   public static void obtenerEscala(double nota) {
      
      // Redondeamos a 2 decimales
      nota = Math.round(nota * 100) / 100;
      
      // Sobra la primera condici�n de los else
      if (nota >= 85) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 3.0);
         System.out.println("Excelente trabajo");
      } else if (nota <= 84.99 && nota >= 75) {   // La primera condici�n (nota < 84.99) es redundante. Se cumple siempre
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 2.0);
         System.out.println("Gran trabajo");
      } else if (nota <= 74.99 && nota >= 60) {
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.7);
         System.out.println("Todav�a tienes trabajo por hacer");
      } else if (nota <= 59.99) {                 // Esta condici�n sobra. Todos los valores que llegan aqu� la cumplen
         System.out.println("La nota final en una escala del 0 al 4 es al menos: " + 0.0);
         System.out.println("Otra vez ser�");
      }
   }
}