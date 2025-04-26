package com.calculadora.operaciones;

import com.calculadora.OperacionBinaria;

public class Division extends OperacionBinaria {
    public Division() {
        this.nombre = "División";
    }

    @Override
    public double calcular(double... operandos) {
        if (operandos[1] == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return operandos[0] / operandos[1];
    }
}