package com.calculadora.operaciones;

import com.calculadora.OperacionBinaria;

public class Resta extends OperacionBinaria {
    public Resta() {
        this.nombre = "Resta";
    }

    @Override
    public double calcular(double... operandos) {
        return operandos[0] - operandos[1];
    }
}