// Programa que realiza y muestra los c�lculos para un prestamo

import java.util.*;
public class AmortizacionPrestamo1 {
   
   public static void main(String[] args) {
      
      // Descibe lo que hace el programa    
      presentacion();

      // PARTE 1           
      // Lee la cantidad para el pr�stamo. Necesita librer�a java.util.*
      Scanner leerTeclado = new Scanner(System.in);
      System.out.print("Introduce la cantidad solicitada para el pr�stamo: ");
      double capital = leerTeclado.nextDouble();
      
      // Calcula y muestra las cuotas para intereses de 2 a 5 con incremento de 0,5
      // y plazos entre 5 y 10 a�os
      muestraCuotas(capital);

      // PARTE 2     
      // Lee el inter�s y la duraci�n del pr�stamo      
      System.out.print("Introduce el inter�s anual que se aplicar� al pr�stamo en %: ");
      double i = leerTeclado.nextDouble();
      double interes = i / 100;
      
      System.out.print("Introduce el n�mero de a�os que va a durar el pr�stamo: ");
      int duracion = leerTeclado.nextInt();
      
      // Calcula y muestra los pagos desglosados para cada uno de los a�os
      // cuota: es fija y se calcula con la misma f�rmula que antes
      // intereses = capitalPendiente * interes
      // amortizacion = cuota - intereses
      // capitalPendiente = capitalPendiente - cuotaAnual
      double cuota = calculaCuota(capital, interes, duracion);
         
      double capitalPendiente = capital;
      for(int anio = 1; anio <= duracion; anio++) {         
         // Calcula los intereses
         double intereses = capitalPendiente * interes;
         
         // Calcula la cuota de amortizaci�n
         double amortizacion = cuota - intereses;
         
         System.out.println("A�o: " + anio);
         System.out.println("\tCapital Pendiente: " + capitalPendiente);
         System.out.println("\tCuota Anual: " + cuota);
         System.out.println("\tIntereses a pagar: " + intereses);
         System.out.println("\tAmortizaci�n: " + amortizacion);
         
         // Calcula el nuevo capital pendiente
         capitalPendiente -= amortizacion;
      }
   }

   // M�todo que describe lo que hace el programa   
   public static void presentacion() {
      System.out.println("Este es un programa para calcular las cuotas de un pr�stamo");
      System.out.println("Pedir� el capital del pr�stamo (euros), el inter�s anual a pagar (%) y su duraci�n (a�os)");
      System.out.println("Calcular� para cada a�o, el capital pendiente y la cuota a pagar, intereses y amortizaci�n");
      System.out.println("Empezamos ya");
      System.out.println();
   }

   // M�todo que calcula y muestra las cuotas para intereses de 2 a 5 con incremento de 0,5
   // y plazos entre 5 y 10 a�os
   public static void muestraCuotas(double prestamo) {   
      System.out.println("Estas son las cuotas a pagar para diferentes intereses y plazos");     
      for (int duracion = 5; duracion <= 10; duracion++) {
         System.out.print(duracion + " A�os \t");
         for (double i = 2.0; i <= 5.0; i = i + 0.5) {
            double interes = i / 100;
            double cuota = calculaCuota(prestamo, interes, duracion);
            System.out.print(cuota + "(" + i + "%) \t");
         }
         System.out.println();
      }
      System.out.println();
   }

   // M�todo que calcula la f�rmula de la cuota para evitar redundancias   
   public static double calculaCuota(double capital, double i, int plazo) {
      double exponente = Math.pow(1 + i, - plazo);
      double cuota = capital * i / (1 - exponente);
      return cuota;
   }
}