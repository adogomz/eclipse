// Tarea PROG01 TAREA 02. Realizar un programa en java
// Programacion - DAM- 16 de Octubre 2021
// Adolfo Gomez Losada
// Enlace autoevaluacion
// https://drive.google.com/file/d/1P4hOM0flI8bw_OP6r9nKFuuJg0oSY7Mm/view?usp=sharing

public class Cohete {

	public static void main(String[] args) {
		System.out.println(" DIBUJA ESTA FIGURA:");
		System.out.println();
		antena();
		cuerpo(); 
		inferior();
		ascensor();
		//antena();
		//antena();
		cuerpo();
	/* agrupado todos los metedos y antena() y cuerpo() los utilizo dos veces
	   como el programa asi evito otro bucle for anidado
	 */
		
		
		
	} //fin del main

	// bucle para la antena que tambien usare para el tronco por llamarlo asi
	public static void antena() {
		
		for (int espacios = 0; espacios<4; espacios++) {
			for (int barra = 0; barra < 12; barra++) {
					System.out.print(" ");
			}
			System.out.println("||");
			}
	}
		public static void ascensor() {
				
				for (int espacios = 0; espacios<12; espacios++) {
					for (int barra = 0; barra < 12; barra++) {
							System.out.print(" ");
					}
					System.out.println("||");
					}
			}
	// bucle para el cuerpo y la base
	public static void cuerpo() {
		// bucle para las plantas
		for (int i = 0; i<=3; i++) {
	// creo un bucle para los espacios en blanco en cada linea y sacado la relacion
	// entre la linea y espacios
			for(int j = 0; j<(-3*i)+9; j++) {
					System.out.print(" ");
			}
			System.out.print("__/");
	// Bucle para los puntos de menos a mas
			for(int k=0; k<i*3; k++) {
				System.out.print(":");	
			}
	// cuando termindo el bucle pinto la columna
			System.out.print("||");
	// vuelvo hacer otro bucle para los puntos
			for(int l=0; l<i*3; l++) {
			System.out.print(":");
			}
	// inprimo el final de cada planta y hago un saldo de liena
			System.out.print("\\__");
			System.out.println();
		}
	// con este añado la linea que separa las plantas
		System.out.print("|");
		for(int i=0; i<=23; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}
	
	// bucle para la parte inferior del cuerpo
	public static void inferior() {
		// bucle para las plantas lo mismo que el primero
				for (int i = 0; i<=3; i++) {
		// creo un bucle para los espacios en blanco en cada linea
					for(int j = 0; j<(i)*2; j++) {
						System.out.print(" ");
					}
					System.out.print("\\_/");
					// bucle para las ventanas por llamarlas asi siempre teniendo 
					// en cuenta la relacion entre linea y ventanas con la formula
					for(int k=0; k<((-2*i)+10); k++) {
						System.out.print("\\/");	
					}
					System.out.print("\\_/");
					System.out.println();
				}
	}
} 
