package es.pildorasInformaticas.entradaSalida;
import javax.swing.*;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
		

	}

}
