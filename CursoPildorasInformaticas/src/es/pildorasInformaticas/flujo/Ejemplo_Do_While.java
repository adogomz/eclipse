package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_Do_While {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		System.out.println("");
		
		JOptionPane.showMessageDialog(null, "Este programa los caracteres de la palabra o frese introdudica:\n"
				+ "Para terminar escribe salir");
		
		// si lo hago con un bucle do while no tengo que inicarla solo declararla porque le obligo con el do a tener un valor
		
		String texto;
		
		// mientras no escriba salir va hacer el codigo
		do{
			texto = JOptionPane.showInputDialog("Introduce el texto");
			
			JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() + " caracteres");
			
		} while (!texto.equals("salir"));
		System.out.println("Salido del programa");
		
		
	}

}
