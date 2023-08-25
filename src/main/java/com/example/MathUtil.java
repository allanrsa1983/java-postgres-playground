package com.example;

public class MathUtil {



    public static int calcularMDC(int a, int b) {
        int retorno = -1;

        a = Math.abs(a);
        b = Math.abs(b);

        int maior = Math.max(a, b);
        int menor = Math.min(a, b);

        if (menor > 0 && (maior%menor == 0)) {
            retorno = menor;
        }
        if (menor == 0) {
            retorno = Math.abs(maior);
        }

        return retorno;
    }
    
}
