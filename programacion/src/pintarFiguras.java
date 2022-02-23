
public class pintarFiguras {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		// para imprimir las 6 plantas de la figura
		for (int i = 1; i <= 4; i++) {
				
				for (int j = 0; j < (6 - i); j++) {

				System.out.print(" ");

				}

				for (int j = 0; j < i; j++) {

			System.out.print(":");

				}
				System.out.print("||");
				System.out.println();

				}
		
		
		
		
		
	}
}
/*
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
*/