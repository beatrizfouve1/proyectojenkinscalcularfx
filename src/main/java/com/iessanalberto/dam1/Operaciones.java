package com.iessanalberto.dam1;

public class Operaciones {
    // Constantes para las operaciones
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;

    public int calcular(int opcion, int numero1, int numero2) {
        switch (opcion) {
            case SUMA:
                return suma(numero1, numero2);
            case RESTA:
                return resta(numero1, numero2);
            case MULTIPLICACION:
                return multiplicacion(numero1, numero2);
            case DIVISION:
                return division(numero1, numero2);
            default:
                throw new IllegalArgumentException("Opción no válida.");
        }
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }
}