package com.calculadora.operaciones;

import com.calculadora.OperacionUnaria;

public class RaizCuadrada extends OperacionUnaria {
    public RaizCuadrada() {
        this.nombre = "Raíz Cuadrada";
    }

    @Override
    public double calcular(double... operandos) {
        if (operandos[0] < 0) {
            throw new ArithmeticException("No existe raíz real de números negativos");
        }
        return Math.sqrt(operandos[0]);
    }
}