package com.iessanalberto.dam1;

public class CalculadoraConsole {
    private Operaciones operaciones;

    public CalculadoraConsole(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    public int realizarOperacion(int operacion, int num1, int num2) {
        return operaciones.calcular(operacion, num1, num2);
    }
}