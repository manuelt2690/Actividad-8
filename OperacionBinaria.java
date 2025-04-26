package com.calculadora;

public abstract class OperacionBinaria implements OperacionMatematica {
    protected String nombre;

    @Override
    public String getNombre() {
        return nombre;
    }
}