package ud04_ficheros;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class BusquedaImdb {

	public static void main(String[] args) throws FileNotFoundException {
		// conecta con el fichero imdb.txt y con el teclado para leer los datos
		Scanner leerFichero = new Scanner(new File("E:\\WORKstation\\eclipse\\programacion\\src\\lecturaFicheros\\programacion\\imdb.txt"));
		Scanner leerTeclado = new Scanner(System.in);
		
		presentacion();
		
		//Pregunta por el texto a buscar en el fichero 
		System.out.println("Que texto buscamos");
		String texto = leerTeclado.nextLine().toLowerCase();
		System.out.println();
		
		// utiliza el metodo buscar para saber cuantas peliculas contiene ese texto
		int cantidad_peliculas = buscar(texto, leerFichero);
		System.out.println(cantidad_peliculas + " peliculas que incluyen ese texto");
		
		// cierro conexion con el fichero
		leerFichero.close();
		
	}
	// muestra la presentacion del programa resumen de que hace
	public static void presentacion() {
		System.out.println("Programa que busca peliculas que incluyan en su titulo");
		System.out.println("el texto introducido por el usuario o usuarioa");
		System.out.println("");
	}
	
	// lee un objeto de tipo Scanner conectado a un fichero
	// linea a linea y comprueba si contiene el texto buscado
	// Muestra cada una de esas lineas y devuelve el numero de coincidencias
	
	// String texto - el texto que quiero buscar que le pedido mas arriba
	// Scanner fichero - conexion al fichero que se va a leer para buscar el texto
	// retun int - devuelve el numero de peliculas que incluyen el texto
	
	public static int buscar(String texto, Scanner fichero) throws FileNotFoundException {
		// almaceno las coincidencias en un contador
		int encontradas = 0;
		// vamos a ir leyendolo linea a linea
		while(fichero.hasNextLine()) {
			String linea = fichero.nextLine();
			if (linea.toLowerCase().contains(texto)) {
				encontradas++;
				procesarMostrar(linea);
			}
		}
		return encontradas;
	}
	
	// visualiza la pelucla con el siguiente formato
	// titulo -- posicion #N, valoracion X.x (X opiniones)
	// String pelicula - posicion, numero de opiniones, valoraciones titulo
	public static void procesarMostrar(String pelicula) {
		
		// creamos un objeto Scanner a partir de una cadena de caracteres
		Scanner informacion = new Scanner(pelicula);
		informacion.useLocale(Locale.US);
		
		int posicion = informacion.nextInt();
		int opiniones = informacion.nextInt();
		double valoracion = informacion.nextDouble();
		String titulo = "";
		while(informacion.hasNext()) {
			titulo += informacion.next() + "";
		}
		System.out.println(titulo + "-- Posicion #" + posicion + ", Valoracion " + valoracion + " (" + opiniones + " opiniones) ");
	}
	
}
