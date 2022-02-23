package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_switch_ejemplo1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("introduce numero de hijos"));
		
		switch(hijos) {
		
		case 0:
			System.out.println("La natalidad es baja,");
			break;
			
		case 1:
			System.out.println("Por algo se empieza");
			break;
			
		case 2:
			System.out.println("Ya tienes la pareja");
			break;
			
		case 3:
			System.out.println("Te estas animando");
			break;
			
		case 4:
			System.out.println("Ya tienes familia numerosa");
			
		default:
			System.out.println("pues ya puedes ponerte a trabajar");
		}
	}

}
