// Programa con ejemplos de uso de return en los m�todos
// Utiliza los m�todos de la clase Math. Aplica la conversi�n de tipos o casting
// Crea y utiliza m�todos con par�metros y return
// Trigonometr�a: areaRectangulo(), areaCirculo(), areaTriangulo()

public class EjemplosReturn {
   public static void main(String[] args) {
      // Calcula la potencia de un n�mero elevado a otro
      double resultado = Math.pow(2, 7);
      System.out.println(resultado); 
      System.out.println(Math.sqrt(34.6));              
        
      // Calcula el �rea de una circulo a partir del radio
      System.out.println("Area del c�rculo: " + redondear(areaCirculo(5)));
      double radio = 2.4;
      double area = areaCirculo(radio);
      System.out.println("Area del c�rculo: " + redondear(area));

      // Calcula el �rea de un rect�ngulo a partir de su base y altura
      int areaRec = areaRectangulo(4, 6);
      System.out.println("Area del rect�ngulo = " + areaRec);
      System.out.println("Area del rect�ngulo = " + areaRectangulo(5, 2));

      // Calcula el �rea de un triangulo a partir de la base y la altura
      area = areaTriangulo(10, 4);
      System.out.println("Area del tri�ngulo = " + area);
      double base = 5, altura = 2.4;
      System.out.println("Area del tri�ngulo = " + redondear(areaTriangulo(base, altura)));
   }
   
   // Calcula el �rea de una circulo a partir del radio
   //
   public static double areaCirculo(double radio) {
      double area = Math.PI * radio * radio;
      
      return area;
   }
   
   // Redondea un n�mero a 2 decimales
   public static double redondear (double num) {
      num = (double) Math.round(num * 100) / 100;
      return num;
   }
   
   // Calcula el �rea de una rectangulo a partir de 2 de sus lados
   public static int areaRectangulo (int base, int altura) {
	   int calculo = base * altura;
	   return calculo;
      //return base * altura;
   } 

   // Calcula el �rea de una tri�ngulo a partir de la base y la altura
   public static double areaTriangulo (double base, double altura) {
      return base * altura / 2;
   }
}
