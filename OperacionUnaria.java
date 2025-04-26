package com.calculadora;

public abstract class OperacionUnaria implements OperacionMatematica {
    protected String nombre;

    @Override
    public String getNombre() {
        return nombre;
    }
}