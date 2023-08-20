package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AppEleitor {
    
    public static void main(String[] args) {
        Cidadao c1 = new Cidadao(); 
        Cidadao c2 = new Cidadao(LocalDate.of(1983, 8, 8));
        Cidadao c3 = new Cidadao(LocalDate.of(2010, 2, 9));
        
        List<Cidadao> listaCidadao = new ArrayList<>();
    
        listaCidadao.add(c1);
        listaCidadao.add(c2);
        listaCidadao.add(c3);

        for (Cidadao cidadao : listaCidadao) {
            String imprimir = cidadao.toString(); 
            System.out.println(imprimir);
            
        }
    
    }


    
  
}
