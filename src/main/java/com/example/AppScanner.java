package com.example;

import java.util.Scanner;

public class AppScanner {
    
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o nome do usuário:");
    String nome = scan.nextLine();
    System.out.println("Digite o CPF do usuário:");
    String cpfString = scan.nextLine();

    System.out.println("Nome: "+nome);
    System.out.println("CPF:"+ cpfString);
    scan.close();

    

}

}
