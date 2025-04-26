package com.calculadora.operaciones;

import com.calculadora.OperacionBinaria;

public class Potencia extends OperacionBinaria {
    public Potencia() {
        this.nombre = "Potencia";
    }

    @Override
    public double calcular(double... operandos) {
        return Math.pow(operandos[0], operandos[1]);
    }
}