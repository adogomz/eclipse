
public class ejercicio01 {
//	public static final int MAX = 5;
	public static void main(String[] args) {
	   for(int fila = 0; fila<=4; fila++) {
		   for(int espacios = 0; espacios <=9; espacios=fila+3) {
			   for(int puntos=0; puntos<=espacios; puntos=(espacios*3)){
				   System.out.print("");
			   }
			   System.out.println("_/");
		   }
	   }
	}
}