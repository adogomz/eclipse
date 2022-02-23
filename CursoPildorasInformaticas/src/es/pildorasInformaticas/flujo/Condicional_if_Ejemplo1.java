package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad, puedes pasar");
		}else {
			System.out.println("Tienes que crecar mas");
		}
	}

}
