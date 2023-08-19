package com.example;

import java.util.Arrays;

public class AppArraysMatriz {
    
    public static void main(String[] args) {
        double vetor[] = new double[4];
        vetor[0] = 0;
        vetor[1] = 100;
        vetor[2] = 200;
        vetor[3] = 300;
        System.out.println(Arrays.toString(vetor));

        double matriz[][] = {{10,20,30}, {40,50,60}};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
    }
    
    
}


