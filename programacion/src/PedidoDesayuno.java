// El programa calcula el precio del pedido de un dsayuno.
// Incluye un 10% de impuestos y un 5% de descuento por "cliente habitual"
public class PedidoDesayuno {
   public static void main(String[] args) {
      // zumo (1euros), tostadas (1,5euros), café (2euros)
	   
      int cafe = 2;
      int zumo = 1;
      double tostadas = 1.5;
      
      double subtotal = cafe + zumo + tostadas;
      double impuestos = subtotal * 0.1;
      double descuento = subtotal * 0.05;
      
      System.out.println("Subtotal: " + subtotal + " euros");
      System.out.println("Tax: " + impuestos + " euros");
      System.out.println("Discount: (" + descuento + " euros)");
      System.out.println("TOTAL: " + (subtotal - descuento + impuestos) + " euros");
      System.out.println("2 + \"(int) 2.0\" + 2 * 2 + 2");
   }
}