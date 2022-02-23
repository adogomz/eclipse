package es.pildorasInformaticas.flujo;
import java.util.*;


public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		// genero un lumero aleatorio con limite 100 y fuerzo que sea entero y positivo
		int aleatorio = (int) (Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		//genero un contador
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un mumero, por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("El numero para acertar es menor");
			}
			
			else if(aleatorio > numero) {
				System.out.println("El numero para acertar el mayor");
			}
		}
		System.out.println("ACERTASTE BUEN TRABAJO");
	}

}
