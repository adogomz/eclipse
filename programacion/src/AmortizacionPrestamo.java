/******************************************************************************************************************

  	Nombre:   Adolfo Gomez Losada
  	Fecha:    05/11/2021
  	Modulo:   Programaci�n.
  	Tarea:    PROG02 Tarea Evaluaci�n 01. Realiza un programa en Java
  
  	Descripci�n del programa:   
  	El objetivo de esta tarea es practicar en nuestros programas el manejo de variables, bucles FOR
 	m�todos con paso de par�metros y sentencia return. As� mismo, utilizaremos funcionalidades de las clases Math y Scanner. 
  	Para utilizar esta �ltima, recordad que tendr�is que importar la librer�a java.util.*.
	El programa proporcionar� diferentes c�lculos para dep�sitos a plazo fijo.
                                
*******************************************************************************************************************/

import java.util.*;  //Para poder usar Scanner entrada por teclado inporto la libreria .util.*   ( por no poner la .Scanner )

public class AmortizacionPrestamo{
	public static void main(String[] args) {
			// metodo principal main, utilizo 3 metodos y las entradas por teclado almacenandolos en variables
			
		
															
		introduccion();		// explica que va hacer el programa							
		Scanner teclado = new Scanner(System.in);		// pido por teclado el dato y lo almaceno en la variable cantidad
		System.out.print("Introduce la cantidad solicitada para el pr�stamo: ");
		double cantidad = teclado.nextDouble();
		
		cuotasPagar(cantidad);		// calcula las cuotas del prestamo que hemos pedido arriba
		 

		System.out.print("Introduce el inter�s anual que se aplicar� al pr�stamo en %: ");
		double interesaPagar = teclado.nextDouble();
		System.out.println();
		
		System.out.println("Introduce el n�mero de a�os que va a durar el pr�stamo: ");
		double duracion = teclado.nextDouble();
		System.out.println();
		
		datosPrestamo(cantidad, interesaPagar, duracion); 	// calcula las cuotas anuales 
		
	}
	// la introduccion agrupada
	public static void introduccion() {
		System.out.println("Este es un programa para calcular las cuotas de un pr�stamo");
		System.out.println("Pedir� el capital del pr�stamo (euros), el inter�s anual a pagar (%) y su duraci�n (a�os)");
		System.out.println("Calcular� para cada a�o, el capital pendiente y la cuota a pagar, intereses y amortizaci�n");
		System.out.println("Empezamos ya");
		System.out.println();
	}
	// metodo para calcular las cuotas recibe por parametro la cantidad y hace los calculos
	public static void cuotasPagar(double prestamo) {	
		double interes100 = 0;
		double cuotaAnual = 0;
		System.out.println("Estas son las cuotas a pagar para diferentes intereses y plazos");	// con un bucle for calculo las cuotas y las tabulo
		for (int urteak = 5; urteak <= 10; urteak++ ) {
			System.out.print(urteak + " A�os\t");
			for(double interes = 2.0; interes <= 5.0; interes = (interes + 0.5)) {
				interes100 = interes/100.0;
				cuotaAnual = (prestamo*interes100)/(1-(Math.pow(1+interes100,-urteak)));
				System.out.print(((double)(Math.round(cuotaAnual*100))/100) + "(" + interes + "%)\t");
			}
			System.out.println();
		}
	}
	// metodo que recibe tres parametros y calcula el capital pendiente las cuotas e intereses
	public static void datosPrestamo(double prestamo, double interes, double duracion) {
		double capitalPendiente = prestamo;
		double interes100 = interes / 100;
		double cuotaAnual;
		
		// las formulas necesarias para hacer los calculos con las tabulaciones 
		for ( int urteak = 1; urteak <= duracion; urteak++) {
			System.out.println("A�o: " + urteak);
			System.out.println("\tCapital Pendiente: " + redondear(capitalPendiente));
			cuotaAnual = (prestamo * interes100)/(1-(Math.pow(1 + interes100, - duracion)));
			System.out.println("\tCuota Anual: " + redondear(cuotaAnual));
			System.out.println("\tIntereses a pagar: " + redondear(capitalPendiente * interes100));
			System.out.println("\tAmortizaci�n: " + redondear(cuotaAnual - (capitalPendiente * interes100)));
			capitalPendiente = capitalPendiente - (cuotaAnual - (capitalPendiente * interes100));
			}
	}
	
	// metodo para redondear a dos decimales que retorna un double para poderlo utilizar fuera del metodo
	public static double redondear(double numero) {
		return  ((double)(Math.round(numero * 100d) / 100d));
	}
}