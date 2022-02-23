package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		
		String genero = JOptionPane.showInputDialog("Introduce el genero ( Hombre o Mujer");
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		int pesoideal = 0;
		
		if ( genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;
		}
		
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;
		}
		System.out.println("Tu peso ideal es " + pesoideal + " Kg");
		
			
	}
		
}
