import java.util.*;

public class unoPorTres {
	
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        System.out.println("Introduce un numero:");
	        
	        int num = leerEntero(teclado);
	        while(num < 0) {
	            System.out.println("Introduce un numero:");
	            num = leerEntero(teclado);   
	        }
	        System.out.println(num + " + 2 = " + (num + 2));
	    }
	    
	    public static int leerEntero(Scanner leer) {
	        while(!leer.hasNextInt()) {
	            leer.nextLine(); 
	            System.out.println("Introduce un numero:");   
	        }
	       int numero = leer.nextInt();
	       leer.nextLine();
	       return numero;
	    }
	}
		
	    
	    
	

