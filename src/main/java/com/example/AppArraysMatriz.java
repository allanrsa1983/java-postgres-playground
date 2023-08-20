package com.example;

public class AppArraysMatriz {
    
    public static void main(String[] args) {
        double vetor[] = new double[4];
        vetor[0] = 0;
        vetor[1] = 100;
        vetor[2] = 200;
        vetor[3] = 300;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }
        System.out.println();

        double matriz[][] = {{10,20,30}, {40,50,60}};
        //System.out.println(Arrays.toString(matriz[0]));
        //System.out.println(Arrays.toString(matriz[1]));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
            
        }
    }
    
    
}


