
public class pruebas {
	
	public static void main(String[] args) {
	
		// bucle para las plantas
		for (int i = 0; i<=3; i++) {
		// creo un bucle para los espacios en blanco en cada linea -3 espacios
			for(int j = 0; j<(-3*i)+9; j++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			for(int k=0; k<i*3; k++) {
				System.out.print(":");	
			}
			System.out.print("||");
			
			for(int l=0; l<i*3; l++) {
				System.out.print(":");
			}
			System.out.print("\\__");
			System.out.println();
		}
		System.out.print("|");
		for(int i=0; i<=23; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
		
		
/*		bucle for para imprimir esta parte

         __/||\__						9 espacios 0 puntos		
      __/:::||:::\__		relacion	6 espacios 3 puntos
   __/::::::||::::::\__					3 espacios 6 puntos
__/:::::::::||:::::::::\__				0 espacios 9 espacios
	  							// primero un bulce que pinte los pisos	 
|""""""""""""""""""""""""| 							
*/			
    }
}