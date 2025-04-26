package com.calculadora;

import com.calculadora.operaciones.*;
import java.util.Scanner;

public class Calculadora {
    private OperacionMatematica[] operaciones;

    public Calculadora() {
        operaciones = new OperacionMatematica[] {
                new Suma(),
                new Resta(),
                new Multiplicacion(),
                new Division(),
                new Potencia(),
                new RaizCuadrada()
        };
    }

    public void mostrarMenu() {
        System.out.println("CALCULADORA POO");
        System.out.println("Operaciones disponibles:");

        for (int i = 0; i < operaciones.length; i++) {
            System.out.println((i+1) + ". " + operaciones[i].getNombre());
        }
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una operación (0 para salir): ");

            int opcion = scanner.nextInt();
            if (opcion == 0) break;

            if (opcion < 1 || opcion > operaciones.length) {
                System.out.println("Opción inválida");
                continue;
            }

            OperacionMatematica operacion = operaciones[opcion-1];
            double[] operandos = solicitarOperandos(scanner, operacion);

            try {
                double resultado = operacion.calcular(operandos);
                System.out.printf("Resultado: %.2f%n", resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private double[] solicitarOperandos(Scanner scanner, OperacionMatematica operacion) {
        if (operacion instanceof OperacionUnaria) {
            System.out.print("Ingrese el número: ");
            return new double[]{scanner.nextDouble()};
        } else {
            System.out.print("Ingrese el primer número: ");
            double op1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double op2 = scanner.nextDouble();
            return new double[]{op1, op2};
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.ejecutar();
    }
}