package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, pro favor: "));
		
		boolean mayor_edad = false;
		if(edad >= 18) {
			mayor_edad = true;
		}
		
		if ( mayor_edad == true) {
			String carnet = JOptionPane.showInputDialog("Tienes carnet??");
			
			if(carnet.equals("si")) {
				JOptionPane.showMessageDialog(null,"Puedes comprar el coche");
			}else {
				JOptionPane.showMessageDialog(null,"Sin carnet no hay coche");
			}
		}else {
			JOptionPane.showMessageDialog(null,"si eres menor ni coche ni carnet");
		}
	}

}
