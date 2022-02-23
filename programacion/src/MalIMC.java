// Esta es una version mal estructurada de un programa que obtiene el IMC de una persona.
// Funciona pero es dificil de entender y modificar
// debido a la mala descomposicion en metodos.

import java.util.*;

public class MalIMC {
    public static void main(String[] args) {
        System.out.println("Este programa lee la altura y el peso de");
        System.out.println("una persona y calcula su IMC");
        System.out.println("su Indice de Masa Corporal.");
        System.out.println();

        Scanner leerTeclado = new Scanner(System.in);
        persona(leerTeclado);
    }

    public static void persona(Scanner leerTeclado) {
        System.out.println("Introduce los datos de la persona:");
        System.out.print("Altura en metros: ");
        double altura = leerTeclado.nextDouble();
        getPeso(leerTeclado, altura);
    }

    public static void getPeso(Scanner leerTeclado, double altura) {
        System.out.print("peso en kilogramos: ");
        double peso = leerTeclado.nextDouble();
        muestraResultados(leerTeclado, altura, peso);
    }

    public static void muestraResultados(Scanner leerTeclado, double altura,
                                    double peso) {
        double imc = peso / (altura * altura);
        System.out.println("El IMC de la persona es = " + imc);
        if (imc < 18.5) {
            System.out.println("bajo peso");
        } else if (imc < 25) {
            System.out.println("normal");
        } else if (imc < 30) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("obeso");
        }
    }
}
