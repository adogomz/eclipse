 package es.pildorasInformaticas.entradaSalida;


import java.util.Scanner;
import javax.swing.*;
public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner dato = new Scanner(System.in);
		// base
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introce un numero para la base"));
		
		// exponente
		int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introce un numero para el exponente"));
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + Math.pow(base, exponente));
		System.out.println("El resutaldo es " + Math.pow(base, exponente));
	}

}
