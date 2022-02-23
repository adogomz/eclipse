/* TAREA EVOLUCION 01 Realiza un pograma en Java
// Adolfo Gomez Losada adgomez@birt.eus - Programacion / DAM
// EVALUACION https:https://drive.google.com/file/d/160NgJno1LXNhGyxt8KEbUM19qhZs49jd/view?usp=sharing
 */

public class ALevantarse {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		//llamada al metodo principal
		
		poema();
		
	}
	
	//metodo que agrupa a todos los metodos para solo
	//tener uno uno en el mail
	public static void poema(){
		EstrofaUno();
		EstrofaDos();
		EstrofaTres();
		EstrofaCuatro();	
	}
	// los metodos de las estrofas que no se repiten pero
	// van acumulando resto de metodos y sumando una linea
	public static void EstrofaUno() {
		System.out.println("Hoy a las siete de la mañana,");
		System.out.println("el sol empieza a entrar por la ventana");
		suena();
	}
	
	public static void EstrofaDos() {
		System.out.println("Sigo durmiendo otro ratito,");
		System.out.println("igual no importa porque aún es tempranito.");
		gallo();
		
	}
	
	public static void EstrofaTres() {
		System.out.println("Doy media vuelta sigo durmiendo,");
		System.out.println("hace un rato que ya está amaneciendo");
		hermano();
	}
	
	public static void EstrofaCuatro() {
		System.out.println("Ya mucha luz entra en mi pieza,");
		System.out.println("pero yo tengo un poco de pereza");
		camion();
		
	}
	
	//las partes que se repiten y van acumulandose en otros metodos
	public static void suena() {
		System.out.println("Suena el despertador");
		System.out.println("Cinco minutos más por favor");
		System.out.println();
	}
	public static void gallo() {
		System.out.println("Canta el gallo cantor");
		suena();
	}
	
	public static void hermano(){
		System.out.println("Mi hermano toca el tambor");
		gallo();
		
	}
	
	public static void camion() {
		System.out.println("Suena la bocina de un camión");
		hermano();
	}
	
}
