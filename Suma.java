package com.calculadora.operaciones;

import com.calculadora.OperacionBinaria;

public class Suma extends OperacionBinaria {
    public Suma() {
        this.nombre = "Suma";
    }

    @Override
    public double calcular(double... operandos) {
        return operandos[0] + operandos[1];
    }
}