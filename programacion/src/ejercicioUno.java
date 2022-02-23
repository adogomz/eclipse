
public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Creamos un bucle para contar hasta 3, para los 3 bloques
	      for(int i = 0; i < 3; i++) {
	         
	         // pintamos el bloque llamando al metodo
	         bloque();
	         
	         // Introducimos un salto de linea
	         System.out.println();
	      }
	   }
	   
	   // Creamos el metodo bloque
	   public static void bloque() {
	      
	      // Creamos un bucle para contar hasta 5, para las 5 lineas de cada bloque
	      for(int linea = 1; linea <= 5; linea++) {
	         // Pintamos cada linea
	          
	         // Pintamos una !
	         System.out.print("!");
	         
	         // Creamos un bucle para pintar los *
	         // En cada linea se pintan (7 - linea) asteriscos
	         for(int i = 0; i < (7 - linea); i++) {
	            // Usamos print para que los caracteres se muestren seguidos, sin saltos de linea
	            System.out.print("*");
	         }
	         
	         // Creamos un bucle para pintar los espacios
	         // En cada linea se pintan (linea + 1) espacios
	         for(int i = 0; i < (linea + 1); i++) {
	            System.out.print(" ");
	         }
	         
	         // Pintamos el numero de linea
	         System.out.print(linea);
	         
	         // Creamos un bucle para pintar los espacios
	         // En cada linea se pintan (linea + 1) espacios
	         for(int i = 0; i < (linea + 1); i++) {
	            System.out.print(" ");
	         }
	         
	         // Creamos un bucle para pintar los *
	         // En cada linea se pintan (7 - linea) asteriscos
	         for(int i = 0; i < (7 - linea); i++) {
	            System.out.print("*");
	         }
	         
	         // Pintamos la ultima !. Lo hacemos con printl para introducir un salto de linea y empezar la siguiente
	         System.out.println("!");
	      }
	   }
	}