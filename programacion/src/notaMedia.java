/******************************************************************************************************************

  	Nombre:         Adolfo Gomez Losada
  	Fecha:          19/11/2021
  	Modulo:         Programación.
  	Tarea:          PROG03 Tarea de evaluación 01. Realiza un programa en Java
  	Autoevaluacion: 
  
  	Descripción del programa:   
  	El programa permitirá calcular la nota media de un estudiante a partir de la calificación del examen final, 
  	el examen parcial y las tareas realizadas durante el curso.
                                
*******************************************************************************************************************/

import java.util.*;
public class notaMedia {

	public static int MAX_EXAMEN = 100;
	public static int MAX_PESO = 100;
	public static int MAX_PRESENCIAL = 30;
	
	
	public static void main(String[] args) {
		
		Scanner leerTeclado = new Scanner(System.in);
		
		presentacion();
		
		double estudiante1 = calculoNota(leerTeclado);
		rangoEscala(estudiante1);
		
		double estudiante2 = calculoNota(leerTeclado);
		rangoEscala(estudiante2);

		comparaEstudiantes(estudiante1, estudiante2);
	}

	
	public static void presentacion() {
		System.out.println("Este programa lee las calificaciones de exámenes y tareas");
		System.out.println("y calcula la nota final del módulo para un estudiante.");
		System.out.println("También podría hacerlo para 2 estudiantes y comparar sus notas. Funcionaría sin problemas");
		System.out.println("");
	}
	
	
	
	public static double calculoNota(Scanner leerTeclado) {
		double nota = examen("Parcial", leerTeclado) + examen("Final", leerTeclado) + tareas(leerTeclado);
		
		System.out.printf("La calificación total obtenida es: %.1f\n", nota);
		return nota;
	}
	
	public static double examen(String tipo, Scanner datos) {
		System.out.println(tipo + ":");
		
		int peso = entero(datos, "Introduce el peso del examen (0-" + MAX_PESO + "): ");
		int nota = entero(datos, "Introduce la calificación del examen (0-" + MAX_EXAMEN + "): ");
		int extra = entero(datos, "¿Has obtenido puntos extra (1=Si, 2=No)? ");
		
		if(extra == 1) {
			int puntosExtra = entero(datos, "Introduce el total de puntos extra: ");
			
			nota = Math.min(nota + puntosExtra, MAX_EXAMEN);
		}
		double ponderada = calculoNota(nota, peso, MAX_EXAMEN);
		return ponderada;
	}
	
	public static double tareas ( Scanner leerTeclado) {
		System.out.println("Tareas:");
		int peso = entero(leerTeclado, "Introduce el peso de las tareas (0-" + MAX_PESO + "): ");
		int tareas = entero(leerTeclado, "Introduce el número de tareas: ");
		
		int nota = 0;
		int notaMaxima = 0;
		for (int i = 1; i <= tareas; i++) {
	         // Introduce los 2 valores seguidos y separados por un espacio. Con Scanner se leen igual
	         System.out.print("Tarea " + i + ": Introduce la puntuación obtenida y la puntuación máxima: ");
	         nota += leerTeclado.nextInt();
	         notaMaxima += leerTeclado.nextInt();
	      }
		int presenciales = entero(leerTeclado, "Introduce el número de presenciales a las que has atendido: ");
	    int notaPresenciales = presenciales * 5;
		
	    notaPresenciales = Math.min(notaPresenciales, MAX_PRESENCIAL);     
	    System.out.println("Nota de las presenciales = " + notaPresenciales + " / " + MAX_PRESENCIAL);
	           
	      double ponderada = calculoNota(nota + notaPresenciales, peso, notaMaxima + MAX_PRESENCIAL);
	      
	      return ponderada;
	}
	
	public static int entero(Scanner datos, String texto) {
		System.out.print(texto);
		int entero = datos.nextInt();
		return entero;
	}
	
	public static double calculoNota(int nota, int peso, int notaMax) {
		double ponderada = (double) nota * peso / notaMax;
		System.out.println("Nota final = " + nota + " / " + notaMax);     
	     System.out.printf("Nota final ponderada = %.1f / %d\n", ponderada, peso);
	     System.out.println();
	     return ponderada;
	}
	
	public static void rangoEscala(double nota) {
	      double escala = 0;
	      String mensaje = "";
	      
	      if (nota >= 85) {
	         escala = 3.0;
	         mensaje = "Excelente trabajo";
	      } else if (nota >= 75) {   
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
	
	public static void comparaEstudiantes(double estudiante1, double estudiante2) {
		if(estudiante1 > estudiante2) {
			System.out.println("la casificacion del primer alumno es superior");
		}else System.out.println("la casificacion del segundo alumno es superior");
	}
	
}
