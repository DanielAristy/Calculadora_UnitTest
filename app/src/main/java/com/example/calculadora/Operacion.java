package com.example.calculadora;

public class Operacion {

    public String suma(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String resta(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String multiplicacion(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

}
