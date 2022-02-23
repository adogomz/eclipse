// Programa que realiza y muestra los c�lculos para un prestamo

import java.util.*;
public class AmortizacionPrestamo2 {

   // Crea al menos una constante para valores que no cambian durante la ejecuci�n del programa
   public static final int INICIO = 5, FIN = 10;
   public static final double MIN = 2.0, MAX = 5.0, INCREMENTO = 0.5;
   public static final int DECIMALES = 2;  
   
   // M�todo principal: se estructura utilizando m�todos que realizan las tareas principales
   public static void main(String[] args) {
      
      // Describe lo que hace el programa    
      presentacion();

      // PARTE 1: Lee la cantidad para el pr�stamo.
      // Calcula y muestra las cuotas para intereses de 2 a 5 con incremento de 0,5
      // y plazos entre 5 y 10 a�os
      Scanner leerTeclado = new Scanner(System.in);
      double capital = muestraCuotas(leerTeclado);

      // PARTE 2: Lee el inter�s y la duraci�n del pr�stamo y
      // Calcula y muestra los pagos desglosados para cada uno de los a�os
      muestraPagos(capital, leerTeclado);
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
   public static double muestraCuotas(Scanner teclado) {
      System.out.print("Introduce la cantidad solicitada para el pr�stamo: ");
      double prestamo = teclado.nextDouble();
       
      System.out.println("Estas son las cuotas a pagar para diferentes intereses y plazos");     
      for (int duracion = INICIO; duracion <= FIN; duracion++) {
         System.out.print(duracion + " A�os \t");
         
         double i = 2.0;
         for (int j = 1; j <= 7; j++) {
            double cuota = calculaCuota(prestamo, i / 100, duracion);
            double cuotaRedondeada = redondear(cuota);
            System.out.print(cuotaRedondeada + "(" + i + "%) \t");
            i = i + 0.5;
         }
         
         System.out.println();
      }
      System.out.println();
      return prestamo;
   }

   // M�todo que lee el inter�s y la duraci�n del pr�stamo y
   // calcula y muestra los pagos desglosados para cada uno de los a�os
   // Utiliza el algoritmo acumulador: capitalPendiente se inicializa fuera del for y se actualiza dentro
   public static void muestraPagos(double capital, Scanner teclado) {
    
      System.out.print("Introduce el inter�s anual que se aplicar� al pr�stamo en %: ");
      double interes = teclado.nextDouble();
      
      System.out.print("Introduce el n�mero de a�os que va a durar el pr�stamo: ");
      int duracion = teclado.nextInt();
      
      double cuota = calculaCuota(capital, interes / 100, duracion);
         
      double capitalPendiente = capital;
      for(int anio = 1; anio <= duracion; anio++) {         
         double intereses = capitalPendiente * interes / 100;
         double amortizacion = cuota - intereses;
         
         System.out.println("A�o: " + anio);
         System.out.println("\tCapital Pendiente: " + redondear(capitalPendiente));
         System.out.println("\tCuota Anual: " + redondear(cuota));
         System.out.println("\tIntereses a pagar: " + redondear(intereses));
         System.out.println("\tAmortizaci�n: " + redondear(amortizacion));
         
         // Calcula el nuevo capital pendiente
         capitalPendiente -= amortizacion;
      }
   }

   // M�todo que calcula la f�rmula de la cuota para evitar redundancias   
   public static double calculaCuota(double capital, double i, int plazo) {
      return (capital * i / (1 - Math.pow(1 + i, - plazo)));
   }
   
   // M�todo que redondea el resultado a 2 decimales para mostrarlo por consola
   // Alguno de los n�meros de la divisi�n debe ser un double para que haya decimales
   public static double redondear(double num) {
      return (double) Math.round(num * 100) / 100;
   }
}