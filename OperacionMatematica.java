package com.calculadora;

public interface OperacionMatematica {
    double calcular(double... operandos);
    String getNombre();
}