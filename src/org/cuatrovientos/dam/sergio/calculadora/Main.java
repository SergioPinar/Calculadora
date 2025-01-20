package org.cuatrovientos.dam.sergio.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la operación (suma, resta, multiplicacion, division): ");
        String operacion = scanner.nextLine().toLowerCase();

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre 0");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida");
                scanner.close();
                return;
        }

        System.out.println("El resultado de la " + operacion + " es: " + resultado);
        scanner.close();
    }
}
