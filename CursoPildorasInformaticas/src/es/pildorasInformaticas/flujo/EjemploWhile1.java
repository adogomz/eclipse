package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String clave = "Adolfo";
		String acceso = "";
		int contador = 0;
		
		while(!clave.equals(acceso)) {
			
			acceso = JOptionPane.showInputDialog("Introduce la clave de acceso, por favor");
			if (!clave.equals(acceso)) {
				System.out.println("La clave es incorrecta");
			}
		}
		System.out.println("Bienvenido a la zona de usuarios");
	}

}
