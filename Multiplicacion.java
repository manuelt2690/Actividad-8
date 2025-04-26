package com.calculadora.operaciones;

import com.calculadora.OperacionBinaria;

public class Multiplicacion extends OperacionBinaria {
    public Multiplicacion() {
        this.nombre = "Multiplicación";
    }

    @Override
    public double calcular(double... operandos) {
        return operandos[0] * operandos[1];
    }
}