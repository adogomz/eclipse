package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la distancia al colegio en km"));
		
		double renta_familiar = Integer.parseInt(JOptionPane.showInputDialog("Introduce la renta familiar"));
		
		byte hermanos_centro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el numero de hermanos en el colegio"));
		
		if(distancia_colegio > 10 && renta_familiar < 20000 || hermanos_centro>=2) {
			System.out.println("El alumno tiene beca");
		}else {
			System.out.println("No tiene derecho a beca");
			
		}
	}

}
