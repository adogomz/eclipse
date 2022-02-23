/******************************************************************************************************************

  Nombre:   XXX
  Fecha:    XX/XX/XXXX
  Modulo:   Programaci�n.
  UD:       UD2 Estructura de un programa inform�tico.
  Tarea:    Tarea Evaluaci�n 03. Realiza un programa en Java.
  
  Descripci�n del programa:   Programa que realiza y muestra los c�lculos para un prestamo
                              haciendo uso de m�todos, variables, bucles FOR y las sentencias print y println.
  
  Enlace autoevaluaci�n: 
                                
*******************************************************************************************************************/

import java.util.*;

public class AmortizacionPrestamo3 {
   //constantes para el inicio y fin de los anios para las cuotas
   public static final int INICIO = 5;
   public static final int FIN = 10;
   
   // M�todo principal: se estructura utilizando m�todos que realizan las tareas principales
   // No se puede utilizar println
   public static void main(String[] args) {
            
      presentacion();
      
      Scanner leerTeclado = new Scanner(System.in);
      double capital = pedirDato("Introduce la cantidad solicitada para el pr�stamo: ", leerTeclado);
      
      //imprimimos la tabla de las cuotas seg�n anio e interes
      muestraCuotas(capital);
      
      //mostramos datos por anio      
      muestraPagos(capital, leerTeclado);
   }
   
   // M�todo que imprime la introduccion del programa
   public static void presentacion() {
      System.out.println("Este es un programa para calcular las cuotas de un pr�stamo");
      System.out.println("Pedir� el capital del pr�stamo (euros), el inter�s anual a pagar (%) y su duraci�n (a�os)");
      System.out.println("Calcular� para cada a�o, el capital pendiente y la cuota a pagar, intereses y amortizaci�n");
      System.out.println("Empezamos ya");
      System.out.println();
   }
   
   // M�todo que calcula y muestra las cuotas para intereses de 2 a 5 con incremento de 0,5
   // y plazos entre 5 y 10 a�os
   // Recibe un �nico par�metro y no devuelve nada:
   // double capital: la cantidad que se ha pedido para el pr�stamo
   public static void muestraCuotas(double prestamo) {   
      System.out.println("Estas son las cuotas a pagar para diferentes intereses y plazos"); 
      
      //bucle para iterar los anios    
      for (int duracion = INICIO; duracion <= FIN; duracion++) {     
         System.out.print(duracion + " A�os \t");
         
         //bucle para iterar el interes
         for (double i = 2.0; i <= 5.0; i += 0.5) {
            System.out.print(redondear(calculaCuota(prestamo, i / 100, duracion)) + "(" + i + "%) \t");
         }
         
         System.out.println();
      }
      System.out.println();
   }
   
   // M�todo que lee el inter�s y la duraci�n del pr�stamo y
   // calcula y muestra los pagos desglosados para cada uno de los a�os
   // Utiliza el algoritmo acumulador: capitalPendiente se inicializa fuera del for y se actualiza dentro
   // Recibe 2 par�metros:
   // double capital: la cantidad que se ha pedido para el pr�stamo
   // Scanner teclado: objeto para leer datos por teclado
   public static void muestraPagos(double capital, Scanner teclado) {
    
      double interes = pedirDato("Introduce el inter�s anual que se aplicar� al pr�stamo en %: ", teclado);
      
      System.out.print("Introduce el n�mero de a�os que va a durar el pr�stamo: ");
      int duracion = teclado.nextInt();
      
      double cuota = calculaCuota(capital, interes / 100, duracion);
         
      double capitalPendiente = capital;
      //bucle para iterar los anios
      for(int anio = 1; anio <= duracion; anio++) {         
         double intereses = capitalPendiente * interes / 100;
         double amortizacion = cuota - intereses;
         
         System.out.println("A�o: " + anio);
         System.out.println("\tCapital Pendiente: " + redondear(capitalPendiente));
         System.out.println("\tCuota Anual: " + redondear(cuota));
         System.out.println("\tIntereses a pagar: " + redondear(intereses));
         System.out.println("\tAmortizaci�n: " + redondear(amortizacion));
         
         capitalPendiente -= amortizacion;
      }
   }
   
   // M�todo que pide la cantidad del pr�stamo. Recibe 2 par�metros:
   // String mensaje: una cadena de caracteres con el mensaje que se quiere mostrar por consola
   // Scanner teclado: objeto para pedir datos por teclado
   // return double: el dato introducido por teclado   
   public static double pedirDato(String mensaje, Scanner teclado) {   
      System.out.print(mensaje);
      return teclado.nextDouble();
   }

   // M�todo que calcula la f�rmula de la cuota para evitar redundancias
   // Recibe 3 par�metros:
   // double capital: la cantidad que se ha solicitado para el pr�stamo
   // double interes: inter�s en tanto por uno que se le va a aplicar
   // int duracion: a�os que va a durar el pr�stamo
   // return double: la cuota anual que se debe pagar
   public static double calculaCuota(double capital, double interes, int duracion) {
      return (capital * interes / (1 - Math.pow(1 + interes, - duracion)));
   }
   
   // M�todo que redondea el resultado a 2 decimales para mostrarlo por consola
   // Recibe un p�rametro:
   // double num: valor que se quiere redondear
   // return double: devuelve el valor redondeado
   public static double redondear(double num) {
      return Math.round(num * 100) / 100.0;
   }
}