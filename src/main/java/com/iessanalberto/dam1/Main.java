package com.iessanalberto.dam1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        CalculadoraConsole calculadora = new CalculadoraConsole(operaciones);

        while (true) {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 5) {
                    System.out.println("Saliendo de la calculadora...");

                }

                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción no válida. Intente de nuevo.");

                }

                System.out.print("Ingrese el primer número: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el segundo número: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                int resultado = calculadora.realizarOperacion(opcion, num1, num2);
                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}